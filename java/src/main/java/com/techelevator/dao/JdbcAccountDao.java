package com.techelevator.dao;

import com.techelevator.model.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JdbcAccountDao implements AccountDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcAccountDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Account createApplicant(Account account){
        Account createdApplicant = null;
        String sql = "INSERT INTO applicants (username, password_hash, full_name, email, phone_number) " +
                     "VALUES (?, ?, ?, ?, ?) " +
                     "RETURNING applicant_id;";
        Long newApplicantId = jdbcTemplate.queryForObject(sql,Long.class,account.getUsername(), account.getPassword_hash(), account.getFullname(), account.getEmail(), account.getPhoneNumber());
        createdApplicant = getAccount(newApplicantId);

        return createdApplicant;
    }

    public Account getAccount(Long accountId){
        Account account = null;

        String sql = "SELECT applicant_id, username, password_hash, full_name, email, phone_number " +
                     "FROM applicants " +
                     "WHERE applicant_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql,accountId);
        if(results.next()){
            account = mapRowToAccount(results);
        }
        return account;
    }

    public List<Account> getApplicants(){
        List<Account> applicants = new ArrayList<>();

        String sql = "SELECT applicant_id, username, password_hash, full_name, email, phone_number " +
                     "FROM applicants;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()){
            Account account = mapRowToAccount(results);
            applicants.add(account);
        }

        return applicants;
    }

    private Account mapRowToAccount(SqlRowSet rs){
        Account account = new Account();
        account.setId(rs.getLong("applicant_id"));
        account.setEmail(rs.getString("email"));
        account.setFullname(rs.getString("full_name"));
        account.setPassword_hash(rs.getString("password_hash"));
        account.setPhoneNumber(rs.getLong("phone_number"));
        account.setUsername(rs.getString("username"));
        return account;
    }


}

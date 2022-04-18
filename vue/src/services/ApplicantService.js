import axios from 'axios';


export default {


    addApplicant(applicant) {
        return axios.post('/apply', applicant);

    },

    getApplicants(user) {
        return axios.get('/applicants', user);
    },

    approveApplicant(id, user) {
        return axios.post(`/approve/${user.applicant.id}`, user)
    },

    deleteApplicant(id, user) {
        return axios.put(`/deny/${user.applicant.id}`, user)
    }
}
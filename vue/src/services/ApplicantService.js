import axios from 'axios';


export default {


    addApplicant(applicant) {
        return axios.post('/apply', applicant);

    },

    getApplicants(user) {
        return axios.get('/applicants', user);
    },

    approveApplicant(applicant) {
        return axios.post(`/approve/${applicant}`)
    },

    deleteApplicant(applicant, user) {
        return axios.put(`/deny/${applicant.id}`, user)
    }
}
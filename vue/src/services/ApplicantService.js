import axios from 'axios';

const http = axios.create({
    baseURL: "http://localhost:3000",
    headers: {"Authorization": "Bearer "+ this.$store.state.token}
  });

export default {


    addApplicant(applicant) {
        return http.post('/apply', applicant);

    },

    getApplicants(user) {
        return http.get('/applicants', user);
    }
}
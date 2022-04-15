import axios from 'axios';

const http = axios.create({
    baseURL: "http://localhost:3000"
});

export default {

    addApplicant(applicant) {
        return http.post('/apply', applicant);

    },







    getApplicants() {
        return http.get('/applicants');
    }
}
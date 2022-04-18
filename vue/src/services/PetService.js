import axios from 'axios';


export default {

    getAllPets() {
        return axios.get('/allpets');
    },
    getCats() {
        return axios.get('/cats');
    },
    getDogs() {
        return axios.get('/dogs');
    },
    getOthers() {
        return axios.get('/otheranimals');
    },

    addPet(pet, user) {
        return axios.post('/addpet', pet, user);

    },

}
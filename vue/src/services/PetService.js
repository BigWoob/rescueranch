import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:3000"
});

export default {

  getAllPets() {
    return http.get('/allpets');
  },
  getCats() {
    return http.get('/cats');
  },
  getDogs() {
    return http.get('/dogs');
  },
  getOthers() {
    return http.get('/otheranimals');
  },

  addPet(pet) {
    return http.post('/addpet', pet);

},


}
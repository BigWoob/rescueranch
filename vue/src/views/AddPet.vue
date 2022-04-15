<template>
  <div>
    <header-default />
    <navbar class="sticky-top" />
    <h2 class="subheading">Add A Pet</h2>

    <div>
      <form v-on:submit.prevent="submitForm">
        <div class="form-row centerForm">
          <div class="form-group col-md-6">
            <label for="animalName">Animal Name:</label>
            <input
              type="text"
              class="form-control"
              id="animalName"
              placeholder="Spaghetti"
              v-model="pet.animalName"
              required
            />
          </div>

          <div class="form-group col-md-6">
            <label for="animalType">Animal Type:</label>
            <input
              type="text"
              class="form-control"
              id="animalType"
              placeholder="Cat/Dog/Other"
              v-model="pet.animalType"
              required
            />
          </div>
        </div>

        <div class="form-row centerForm">
          <div class="form-group col-md-6">
            <label for="animalBreed">Breed:</label>
            <input
              type="text"
              class="form-control"
              id="animalBreed"
              placeholder="Type breed here"
              v-model="pet.animalBreed"
              required
            />
          </div>

          <label for="animalGender">Choose a gender:</label>
          <select v-model="pet.animalGender" id="animalGender" name="animalGender">
            <option value="m">Male</option>
            <option value="f">Female</option>
          </select>
        </div>

        <div class="form-row centerForm">
          <div class="form-group col-md-6">
            <label for="animalAge">Age:</label>
            <input
              type="number"
              class="form-control"
              id="animalAge"
              placeholder="How many years old?"
              v-model="pet.animalAge"
              required
            />
          </div>

          <div class="form-group col-md-6">
            <label for="animalDescription">Description</label>
            <input
              type="text"
              class="form-control"
              id="animalDescription"
              placeholder="Insert Description Here..."
              v-model="pet.animalDescription"
              required
            />
          </div>

          <div class="form-group col-md-6">
            <label for="pictureOne">Picture Link</label>
            <input
              type="text"
              class="form-control"
              id="pictureOne"
              placeholder="Insert Link..."
              v-model="pet.pictureOne"
              required
            />
          </div>

          <label for="available">Available Now:</label>
          <select v-model="pet.available" id="available" name="available">
            <option value=true>Yes</option>
            <option value=false>No</option>
          </select>
          <input type="submit" value="Submit" />
        </div> 
      </form>
    </div>
  </div>
</template>

<script>
import HeaderDefault from "../components/HeaderDefault.vue";
import Navbar from "../components/Navbar.vue";
import PetService from "../services/PetService";

export default {
  name: "AddPet",

  data() {
    return {
      pet: {
        animalType: "",
        animalGender: "",
        petName: "",
        petBreed: "",
        age: "",
        animalDescription: "",
        available: "",
        pictureOne: "",
      },
      //errorMsg: ""
    };
  },

  components: { HeaderDefault, Navbar },

  methods: {
    submitForm() {
      const newPet = {
        //boardId: Number(this.$route.params.boardID),
        //dont know what is after the .
        animalType: this.pet.animalType,
        animalGender: this.pet.animalGender,
        petName: this.pet.petName,
        petBreed: this.pet.petBreed,
        age: parseInt(this.pet.age),
        animalDescription: this.pet.animalDescription,
        available: this.pet.available,
        pictureOne: this.pet.pictureOne,
        //confirmation
      };

      if (newPet) {
        // add
        PetService.addPet(newPet).then((response) => {
          if (response.status === 200) {
            this.$router.push("/thankyou");
          }
        });
        // .catch(error => {
        //   this.handleErrorResponse(error, "adding");
        // });
        //cancel form button

        //created() {},
      }
    },
  },
};
</script>

<style>
.centerForm {
  flex-direction: column;
  align-content: center;
}

#animalGender {
  height: 2rem;
  width: 5rem;
}
</style>
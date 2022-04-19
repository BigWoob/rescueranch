<template>
  <div>
      <header-default />
      <navbar />
      <div 
      class="pet d-flex justify-content-space-evenly redback"
      v-for="pet in pets"
      v-bind:key="pet.petId"
      v-bind:pet="pet">
       <img
          :src="pet.pictureOne"
          alt=""
          srcset=""
          class="img-fluid petImage"
        />
       <h2 class="subyellow">{{ pet.petName }}</h2>
        <p>{{ pet.animalDescription }}</p>
        <p>Animal Type: {{ pet.animalType }}</p>
        <p>Sex: {{ pet.animalGender }}</p>
        <p>Breed: {{ pet.petBreed }}</p>
        <p>Age:{{ pet.age }}</p>
        <p>Available: Yes</p>
      </div>

      
  </div>
</template>

<script>
import HeaderDefault from '../components/HeaderDefault.vue'
import Navbar from '../components/Navbar.vue'
import petService from "../services/PetService";
export default {
  components: { HeaderDefault, Navbar },
  data() {
    return {
      name: 'petinfo',
      pets: {},
    };
  },

  created() {
    petService.getPetById(this.$route.params.id).then((response) => {
      this.pets = response.data;
    });
  },
};
</script>

<style>

</style>
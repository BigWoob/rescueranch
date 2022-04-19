<template>
  <div>
  <header-default />
  <navbar class="sticky-top" />

    <div class="mission">
      <h2 class="subheading">Your New Best Friend!</h2>
    </div>

    <pet-display
      class="pet d-flex justify-content-space-evenly redback"
      v-for="pet in pets"
      v-bind:key="pet.petId"
      v-bind:pet="pet"
    />


     <!--<div class="d-flex justify-content-space-evenly redback">
      <div class="row adopt">
        <div class="col-12 adoptable">
          <img
            class="img-fluid"
            src="https://images.unsplash.com/photo-1580788404954-ae4e4bdc9061?ixlib=rb-1.2.1&ixid=MnwxM[…]G90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=880&q=80"
            alt=""
            srcset=""
          />
        <h2 class="subyellow">Noodle</h2>
          <p>Animal Type: Cat</p>
          <p>Sex: Male</p>
          <p>Breed: Cat</p>
          <p>Age: 3 Years</p>
          <p>Available: Yes</p> 
      </div>

        <div class="row adopt">
          <div class="col-12 adoptable">
            <img
              class="img-fluid"
              src="https://images.unsplash.com/photo-1587354004405-bbce24c893c8?ixlib=rb-1.2.1&ixid=MnwxM[…]G90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=880&q=80"
              alt=""
              srcset=""
            />
            <h2 class="subyellow">Max</h2>
            <p>Animal Type: Dog</p>
            <p>Sex: Male</p>
            <p>Breed: Jack Russel</p>
            <p>Age: 3 Months</p>
            <p>Available: Yes</p>
          </div>
        </div>
        <div class="row adopt">
          <div class="col-12 adoptable">
            <img
              class="img-fluid"
              src="https://images.unsplash.com/photo-1589643989849-b4cef7873cd4?ixlib=rb-1.2.1&ixid=MnwxM[…]G90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=880&q=80"
              alt=""
              srcset=""
            />
            <h2 class="subyellow">Hamilton</h2>
            <p>Animal Type: Horse</p>
            <p>Sex: Male</p>
            <p>Breed: Horse?</p>
            <p>Age: 5 Years</p>
            <p>Available: Yes</p>
          </div>
        </div>
      </div>
    </div> -->
    <footer-default />
  </div>
</template>

<script>
import petService from "../services/PetService";
import HeaderDefault from "../components/HeaderDefault";
import PetDisplay from '../components/PetDisplay.vue';
import Navbar from '../components/Navbar.vue';
import FooterDefault from "../components/FooterDefault";



export default {
  components: { HeaderDefault, PetDisplay, Navbar, FooterDefault}, 
  data() {
    return {
      pets: [],
    };
  },
  created() {
    petService.getAllPets().then((response) => {
      this.pets = response.data;
    });

   // this.$store.commit("AllPets");
  //  this.$router.push("/AllPets");
  },
};
</script>

<style>
.adoptable > p {
  color: rgb(255, 255, 230);
}

.adoptable > img {
  margin-top: 10px;
  width: 33%;
}

</style>
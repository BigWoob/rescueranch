<template>
  <div id="board">
    <header-default />
    <navbar class="sticky-top"/>
  
    <div>

    <div class="mission">
      <h2 class="subheading">Adopted Pets!</h2>
    </div>

    <div class="container-fluid">
      <div class="row adopt celebrate">
        <pet-display
          class="pet d-flex redback"
          v-for="pet in pets"
          v-bind:key="pet.petId"
          v-bind:pet="pet"
        />
      </div>

    </div>
  </div>
    <footer-default />
  </div>
</template>

<script>
import HeaderDefault from "../components/HeaderDefault";
import PetDisplay from "../components/PetDisplay.vue";
import petService from "../services/PetService";
import Navbar from "../components/Navbar";
import FooterDefault from "../components/FooterDefault";
export default {
  components: { HeaderDefault, PetDisplay, Navbar, FooterDefault },
  data() {
    return {
      pets: [],
    };
  },

  created() {
    petService.adoptedPets().then((response) => {
      this.pets = response.data;
    });
  },
};

</script>

<style>
@keyframes    firework-animation {
    0% {background-color : #ff8426;}
    25% {background-color : #fffc84;}
    50% {background-color : #ff83f4;}
    75% {background-color : #83b6ff;}
    100% {background-color : #ff8426;}
}
@-webkit-keyframes firework-animation {
    0% {background-color : #ff8426;}
    25% {background-color : #fffc84;}
    50% {background-color : #ff83f4;}
    75% {background-color : #83b6ff;}
    100% {background-color : #ff8426;}
}
.fireWorkParticle {
    z-index : 999;
    position: absolute;
    height : 5px;
    width : 5px;
    border-radius : 5px;
    animation-name : firework-animation;
    animation-timing-function : linear;
    animation-duration : 1s;
    animation-iteration-count : infinite;
}

</style>
<template>
  <div>
      <header-default />
      <navbar />

    <div>
     <div class="row adopt">
     <div class="col-12 adoptable">
        <img
          :src="pet.pictureOne"
          alt=""
          srcset=""
          class="img-fluid petImage"
        />

        <h2 class="subyellow">{{ pet.petName }}</h2>
        <p>{{ pet.animalDescription }}</p>
        <p>Sex: {{ pet.animalGender }}</p>
        <p>Breed: {{ pet.petBreed }}</p>
        <p>Age: {{ pet.age }}</p>
        <div class="d-flex holdBtn">
          <div class="view-btn">
            <a href="/Adopt" type="button" class="btn btn-outline"
              >Adopt {{ pet.petName }}</a
            >
          </div>
   </div>
     </div>
</div>   
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
      pet: {}
    };
  },

  created() {
    petService.getPetById(this.$route.params.id).then((response) => {
      this.pet = response.data;
    });
  },
};
</script>

<style>

</style>
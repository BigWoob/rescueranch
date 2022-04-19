<template>
  <div class="container">
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
        <p>Animal Type: {{ pet.animalType }}</p>
        <p>Sex: {{ pet.animalGender }}</p>
        <p>Breed: {{ pet.petBreed }}</p>
        <p>Age:{{ pet.age }}</p>
        <p>Available: Yes</p>
        <div class="d-flex holdBtn">
          <div class="view-btn">
            <a href="/Adopt" type="button" class="btn btn-outline"
              >Adopt {{ pet.petName }}</a
            >
          </div>

          <div class="view-btn">
            <a href="/PetInfo/" type="button" class="btn btn-outline"
              >About {{ pet.petName }}</a
            >

            <router-link
              v-bind:to="{ name: 'petinfo', params: { id: pet.petId } }"
            >
              See Details
            </router-link>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  props: ["pet"],
};
</script>

<style>
.holdBtn {
  justify-content: center;
}

.view-btn {
  margin-right: 5px;
  margin-left: 5px;
}
</style>
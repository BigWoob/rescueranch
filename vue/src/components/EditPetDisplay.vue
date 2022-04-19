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
        <button type="button" class="btn btn-outline">EDIT</button>
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
.btn-outline {
  border: 2px solid rgb(255, 255, 230);
  color: rgb(155, 34, 38);
  background-color: rgb(255, 255, 230);
}

.btn-outline:hover {
  border: 2px solid rgb(255, 255, 230);
  color: rgb(255, 255, 230);
  background-color: rgb(155, 34, 38);
}
</style>
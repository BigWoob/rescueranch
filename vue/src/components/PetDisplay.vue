<template>
  <div>
   

    <div class="row adopt">
        <div class="col-12 adoptable">
          <img :src="pet.pictureOne" alt="" srcset="" class="img-fluid" />
          <h2 class="subyellow">{{ pet.petName }}</h2>
          <p>Animal Type: {{ pet.animalType }}</p>
          <p>Sex: {{ pet.animalGender }}</p>
          <p>Breed: {{ pet.petBreed }}</p>
          <p>Age:{{ pet.age }}</p>
          <p>Available: Yes</p>
        </div>
      </div>

  </div>
</template>

<script>
export default {
props: [
  'pet'
]
}
</script>

<style>

</style>
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

         
        

            <router-link class="btn btn-outline"
              v-bind:to="{ name: 'petinfo', params: { id: pet.petId } }"
            tag="button">
              About {{ pet.petName }}
            </router-link>
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
body {
  background-color: rgb(155, 34, 38);
}
.holdBtn {
  justify-content: center;
}

.view-btn {
  margin-right: 5px;
  margin-left: 5px;
}
</style>
<template>

  <div>
      <div class="row adopt">
        <div class="col-12 adoptable">
        <!--  <img :src="pet.pictureOne" alt="" srcset="" class="img-fluid" /> -->
          <h3 class="subyellow">{{ user.fullName }}</h3>
          <p>Email: {{ user.email }}</p>
          <p>Phone: {{ user.phoneNumber }}</p>
        </div>
      </div>
  </div>

</template>

<script>
export default {
props: [
  'user'
]
}
</script>

<style>

</style>
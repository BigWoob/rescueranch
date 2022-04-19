<template>

  <div>
      <div class="row adopt">
        <div class="col-12 volunteer">
        <!--  <img :src="pet.pictureOne" alt="" srcset="" class="img-fluid" /> -->
          <h3 class="subRedding">{{ user.fullname }}</h3>
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
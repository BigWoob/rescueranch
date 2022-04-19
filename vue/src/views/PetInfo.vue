<template>
  <div>
      <header-default />
      <navbar />
       <h1>{{ pet.petName }}</h1>
  </div>
</template>

<script>
import HeaderDefault from '../components/HeaderDefault.vue'
import Navbar from '../components/Navbar.vue'
export default {
  components: { HeaderDefault, Navbar },

}
</script>

<style>

</style>
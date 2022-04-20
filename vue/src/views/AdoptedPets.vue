<template>
  <div>
    <header-default />
    <navbar class="sticky-top"/>
    <pets-adopted />
    
    <footer-default />

  </div>
</template>

<script>
import FooterDefault from '../components/FooterDefault.vue'
import HeaderDefault from '../components/HeaderDefault.vue'
import Navbar from '../components/Navbar.vue'
import PetsAdopted from '../components/PetsAdopted.vue'
export default {
  components: { PetsAdopted, Navbar, HeaderDefault, FooterDefault },

}
</script>

<style>

</style>
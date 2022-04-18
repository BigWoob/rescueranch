<template>
  <div>
    <header-default />
    <navbar class="sticky-top" />
        <h1>Thanks for adding this pet</h1>
        <h2>Click <a href="/">Here</a> To Return Home</h2>
    </div>
</template>

<script>
import HeaderDefault from '../components/HeaderDefault.vue'
import Navbar from '../components/Navbar.vue'
export default {
  components: { HeaderDefault, Navbar},
}
</script>

<style>

</style>
<template>
  <div>
    <header-default />
    <navbar class="sticky-top" />
        <h1>Thank You For Applying!</h1>
        <h2>Click <a class="redHere" href="/">Here</a> To Return Home</h2>
        <footer-default />
    </div>
</template>

<script>
import HeaderDefault from '../components/HeaderDefault.vue'
import Navbar from '../components/Navbar.vue'
import FooterDefault from "../components/FooterDefault";
export default {
  components: { HeaderDefault, Navbar, FooterDefault},
}
</script>

<style>
h1 {
  text-align: center;
}

@keyframes color-change {
  0% { color: red; }
  50% { color: blue; }
  100% { color: yellow; }
}

.redHere {
  animation: color-change 1s infinite;
}

.redHere:hover {
  color: rgb(155, 34, 38);
  text-decoration: underline rgb(155, 34, 38);
  animation: color-change 1s infinite;
}



</style>
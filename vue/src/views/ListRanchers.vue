<template>

  <div>
<header-default />
<navbar class="sticky-top" />

       <rancher-display
      class="pet d-flex justify-content-space-evenly redback"
      v-for="user in users"
      v-bind:key="user.userId"
      v-bind:user="user"
    />
</div>
</template>

<script>
import RancherService from "../services/RancherService";
import RancherDisplay from "../components/RancherDisplay.vue";
import HeaderDefault from "../components/HeaderDefault.vue";
import Navbar from "../components/Navbar.vue";

export default {
  components: { RancherDisplay, HeaderDefault, Navbar },
  data() {
    return {
      users: [],
    };
  },
  created() {
    RancherService.getAllRanchers().then((response) => {
      this.users = response.data;
    });
},
};
</script>

<style>
.adoptable > p {
  color: rgb(255, 255, 230);
}

.adoptable > img {
  margin-top: 10px;
  width: 33%;
}
</style>
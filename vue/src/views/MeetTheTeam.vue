<template>
  <div>
    <header-default />
    <navbar class="sticky-top" />

    <main>
      <div class="d-flex justify-content-space-evenly">
        <div class="row">
          <div class="col-12">
            <img
              class="img-fluid"
              src="../assets/images/Evan.jpg"
              alt=""
              srcset=""
            />
            <a class="yunderline" href="Cats"
              ><h2 class="subyellow">Cats</h2></a
            >
          </div>
        </div>
        <div class="row">
          <div class="col-6">
            <img
              class="img-fluid"
              src="https://images.unsplash.com/photo-1587354004405-bbce24c893c8?ixlib=rb-1.2.1&ixid=MnwxM[…]G90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=880&q=80"
              alt=""
              srcset=""
            />
            <a class="yunderline" href="Dogs"
              ><h2 class="subyellow">Dogs</h2></a
            >
          </div>
        </div>
        <div class="row">
          <div class="col-12">
            <img
              class="img-fluid"
              src="https://images.unsplash.com/photo-1589643989849-b4cef7873cd4?ixlib=rb-1.2.1&ixid=MnwxM[…]G90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=880&q=80"
              alt=""
              srcset=""
            />
            <a class="yunderline" href="Others"
              ><h2 class="subyellow">Other Animals</h2></a
            >
          </div>
        </div>
      </div>
    </main>

    <footer-default />
  </div>
</template>

<script>
import HeaderDefault from "../components/HeaderDefault";
import Navbar from "../components/Navbar.vue";
import FooterDefault from "../components/FooterDefault";
export default {
  components: { HeaderDefault, Navbar, FooterDefault },
};
</script>

<style>
</style>
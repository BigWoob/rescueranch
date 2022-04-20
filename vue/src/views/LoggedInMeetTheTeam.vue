<template>
  <div>
    <header-default />
    <logged-in-navbar class="sticky-top" />
    <h1 class="subheading">Meet The Ranchers</h1>

    <main>
      <div class="d-flex justify-content-space-evenly">
        <div class="row">
          <div class="col-12">
            <a
              class="yunderline"
              href="https://www.linkedin.com/in/evanyhacker/"
            >
              <img
                class="img-fluid"
                src="../assets/images/Evan.jpg"
                alt=""
                srcset=""
              />
              <h2 class="subheading">Evan Y Hacker</h2></a
            >
          </div>
        </div>
        <div class="row">
          <div class="col-12">
            <a
              class="yunderline"
              href="https://www.linkedin.com/in/dev-james-miller/"
            >
              <img
                class="img-fluid"
                src="../assets/images/Jim.jpg"
                alt=""
                srcset=""
              />
              <h2 class="subheading">Jim Miller</h2></a
            >
          </div>
        </div>
        <div class="row">
          <div class="col-12">
            <a
              class="yunderline"
              href="https://www.linkedin.com/in/cameron-nagy/"
            >
              <img
                class="img-fluid"
                src="../assets/images/Me.jpg"
                alt=""
                srcset=""
              />
              <h2 class="subheading">Cameron Nagy</h2></a
            >
          </div>
        </div>

        <div class="row">
          <div class="col-12">
            <a
            class="yunderline"
              href="https://www.linkedin.com/in/robert-presley/">
              <img
                class="img-fluid"
                src="../assets/images/Robert.jpg"
                alt=""
                srcset=""
              />
              <h2 class="subheading">Robert Presley</h2></a
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
import LoggedInNavbar from "../components/LoggedInNavbar.vue";
import FooterDefault from "../components/FooterDefault";
export default {
  components: { HeaderDefault, LoggedInNavbar, FooterDefault },
};
</script>

<style>
.col-12 {
  text-align: center;
}
</style>
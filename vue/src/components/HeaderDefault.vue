<template>
  <div>
    <div>
      <img
        id="title"
        class="img-fluid"
        src="../assets/images/smallerranch.jpg"
        alt="Title and Slogan"
        srcset=""
      />
    </div>
    <b-navbar
      id="nav"
      role="navigation"
      class="
        navbar
        bd-navbar
        flex-column flex-md-row
        navbar-dark navbar-expand
        nav-item
        sticky-top
        navbar-custom
      "
    >
      <b-navbar-nav class="d-flex justify-content-center">
        <b-nav-item href="/" class="nav-item justify-content-end"
          >Home</b-nav-item
        >

        <b-nav-item-dropdown text="Adopt" right class="nav-item">
          <b-dropdown-item href="/AllPets">See All Animals</b-dropdown-item>
          <b-dropdown-item href="/Cats">Cats and Kittens</b-dropdown-item>
          <b-dropdown-item href="/Dogs">Dogs and Puppies</b-dropdown-item>
          <b-dropdown-item href="/Others">Other Animals</b-dropdown-item>
        </b-nav-item-dropdown>

        <b-nav-item-dropdown text="Volunteer" right>
          <b-dropdown-item href="/ApplyToVolunteer"
            >Join The Team</b-dropdown-item
          >
          <b-dropdown-item href="https://www.linkedin.com/in/joe-righetti/"
            >Meet The Team</b-dropdown-item
          >
        </b-nav-item-dropdown>

        <b-nav-item class="mr-auto" href="#A">About Us</b-nav-item>

        <a class="nav-link" href="/dono"
          ><i class="fa fa-heart"></i> Donate<span class="sr-only"
            >(current)</span
          ></a
        >

        <b-nav-item href="/login" class="nav-item justify-content-end"
          >Login</b-nav-item
        >
      </b-navbar-nav>
    </b-navbar>
  </div>
</template>

<script>
export default {
    name: 'header-default',
};
</script>

<style>
#nav {
  bottom: 0;
  width: 100%;
  background-color: rgb(155, 34, 38);
}

.nav-item {
  display: inline-block;
  font-size: 20px;
  padding: 1px 5px 1px 5px;
}
</style>
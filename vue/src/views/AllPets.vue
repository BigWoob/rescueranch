<template>
  <div>
    <div class="containter-fluid">
      <header>
        <div>
          <img
            id="title"
            class="img-fluid"
            src="../assets/images/jimmyredshoes.jpg"
            alt="Title and Slogan"
            srcset=""
          />
        </div>
      </header>
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
          <b-nav-item href="/">Home</b-nav-item>

          <b-nav-item-dropdown text="Adopt" right class="nav-item">
            <b-dropdown-item href="AllPets">See All Pets</b-dropdown-item>
            <b-dropdown-item href="Cats">Cats and Kittens</b-dropdown-item>
            <b-dropdown-item href="Dogs">Dogs and Puppies</b-dropdown-item>
            <b-dropdown-item href="Others">Other Animals</b-dropdown-item>
          </b-nav-item-dropdown>

          <b-nav-item-dropdown text="Volunteer" right>
            <b-dropdown-item href="/ApplyToVolunteer">Join Us</b-dropdown-item>
            <b-dropdown-item href="https://www.linkedin.com/in/joe-righetti/"
              >Meet The Team</b-dropdown-item
            >
          </b-nav-item-dropdown>

          <b-nav-item href="#A">About Us</b-nav-item>

          <b-nav-item href="/login" class="nav-item">Login</b-nav-item>

          <b-nav-item href="https://www.youtube.com/watch?v=dQw4w9WgXcQ"
            >Donate</b-nav-item
          >
        </b-navbar-nav>
      </b-navbar>
      <div class="mission">
        <h2 class="subheading">Your New Best Friend!</h2>
      </div>
      <div class="d-flex justify-content-space-evenly redback">
        <div class="row adopt">
          <div class="col-12 adoptable">
            <img
              class="img-fluid"
              src="https://images.unsplash.com/photo-1580788404954-ae4e4bdc9061?ixlib=rb-1.2.1&ixid=MnwxM[…]G90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=880&q=80"
              alt=""
              srcset=""
            />
            <h2 class="subyellow">Noodle</h2>
            <p>Animal Type: Cat</p>
            <p>Sex: Male</p>
            <p>Breed: Cat</p>
            <p>Age: 3 Years</p>
            <p>Available: Yes</p>
          </div>
        </div>
        <div class="row adopt">
          <div class="col-12 adoptable">
            <img
              class="img-fluid"
              src="https://images.unsplash.com/photo-1587354004405-bbce24c893c8?ixlib=rb-1.2.1&ixid=MnwxM[…]G90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=880&q=80"
              alt=""
              srcset=""
            />
            <h2 class="subyellow">Max</h2>
            <p>Animal Type: Dog</p>
            <p>Sex: Male</p>
            <p>Breed: Jack Russel</p>
            <p>Age: 3 Months</p>
            <p>Available: Yes</p>
          </div>
        </div>
        <div class="row adopt">
          <div class="col-12 adoptable">
            <img
              class="img-fluid"
              src="https://images.unsplash.com/photo-1589643989849-b4cef7873cd4?ixlib=rb-1.2.1&ixid=MnwxM[…]G90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=880&q=80"
              alt=""
              srcset=""
            />
            <h2 class="subyellow">Hamilton</h2>
            <p>Animal Type: Horse</p>
            <p>Sex: Male</p>
            <p>Breed: Horse?</p>
            <p>Age: 5 Years</p>
            <p>Available: Yes</p>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  created() {
    this.$store.commit("AllPets");
    this.$router.push("/AllPets");
  },
};
</script>

<style>
.adoptable > p {
  color: rgb(255, 255, 230);
}
</style>
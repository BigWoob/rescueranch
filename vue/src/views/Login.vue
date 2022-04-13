<template>
  <div>
    <div class="container-fluid">
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
            <b-dropdown-item href="/AllPets">See All Pets</b-dropdown-item>
            <b-dropdown-item href="/Cats">Cats and Kittens</b-dropdown-item>
            <b-dropdown-item href="/Dogs">Dogs and Puppies</b-dropdown-item>
            <b-dropdown-item href="/Others">Other Animals</b-dropdown-item>
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
    </div>

    <div id="login" class="text-center">
      <form class="form-signin" @submit.prevent="login">
        <h1 class="h3 mb-3 font-weight-normal">Please Sign In</h1>
        <div class="alert alert-danger" role="alert" v-if="invalidCredentials">
          Invalid username and password!
        </div>
        <div
          class="alert alert-success"
          role="alert"
          v-if="this.$route.query.registration"
        >
          Thank you for registering, please sign in.
        </div>
        <label for="username" class="sr-only">Username</label>
        <input
          type="text"
          id="username"
          class="form-control"
          placeholder="Username"
          v-model="user.username"
          required
          autofocus
        />
        <label for="password" class="sr-only">Password</label>
        <input
          type="password"
          id="password"
          class="form-control"
          placeholder="Password"
          v-model="user.password"
          required
        />
        <router-link :to="{ name: 'register' }">Need an account?</router-link>
        <button type="submit">Sign in</button>
      </form>
    </div>
  </div>
</template>

<script>
import authService from "../services/AuthService";

export default {
  name: "login",
  components: {},
  data() {
    return {
      user: {
        username: "",
        password: "",
      },
      invalidCredentials: false,
    };
  },
  methods: {
    login() {
      authService
        .login(this.user)
        .then((response) => {
          if (response.status == 200) {
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            this.$router.push("/");
          }
        })
        .catch((error) => {
          const response = error.response;

          if (response.status === 401) {
            this.invalidCredentials = true;
          }
        });
    },
  },
};
</script>

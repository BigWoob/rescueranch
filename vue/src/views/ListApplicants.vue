<template>
  <div>
      <header-default />
      <navbar/>

       <div class="mission">
      <h2 class="subheading">Pending Applicants</h2>
    </div>
    

    <div
      class="applicant"
      v-for="applicant in applicants"
      v-bind:key="applicant.applicantId"
      v-bind:applicant="applicant"
      >
    <p>{{applicant.username}}</p>
    </div>



  </div>
</template>

<script>
import HeaderDefault from "../components/HeaderDefault.vue";
import ApplicantService from "../services/ApplicantService";
import Navbar from '../components/Navbar.vue'

export default {
  components: { HeaderDefault, Navbar},
    data() {
    return {
      applicants: [],
    };
  },
    created() {
    ApplicantService.getApplicants().then((response) => {
      this.applicants = response.data;
    });
    },
};
</script>

<style>
</style>
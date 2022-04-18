<template>
  <div>
    <header-default />
    <navbar />

    <div class="mission">
      <h2 class="subheading">Pending Applicants</h2>
    </div>

    <form>
      <div class="applicant-box">
        <div
          class="applicant"
          v-for="applicant in applicants"
          v-bind:key="applicant.applicantId"
          v-bind:applicant="applicant"
        >
          <h4>{{ applicant.fullname }}</h4>
          <p>Phone: {{ applicant.phoneNumber }}</p>
          <p>{{ applicant.email }}</p>
          <p>Username: {{ applicant.username }}</p>

          <!-- <form style="display: inline" action="#" method="approveApplicant({{applicant.id}})">
  <button>Approve</button>
</form>
     
         <form style="display: inline" action="#" method="deleteApplicant(applicant.id)">
  <button>Delete</button>
</form>
      -->


          <button v-on:click="approveApplicant(applicant.id)">APPROVE</button>
          <button v-on:click="deleteApplicant(applicant.id)">DENY</button> 
        </div>
      </div>
    </form>
  </div>
</template>

<script>
import HeaderDefault from "../components/HeaderDefault.vue";
import ApplicantService from "../services/ApplicantService";
import Navbar from "../components/Navbar.vue";

export default {
  components: { HeaderDefault, Navbar },
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
  methods: { approveApplicant(id){
    ApplicantService.approveApplicant(id)
  }

  }
};
</script>

<style>
.applicant {
  margin: auto;
  margin-bottom: 15px;
  text-align: center;
  border: 2px solid black;
  width: 33%;
}
.applicant-box {
  text-align: center;
}
button {
  margin: 5px;
}
</style>
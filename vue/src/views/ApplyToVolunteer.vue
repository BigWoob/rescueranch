<template>
  <div>
    <header-default />
    <navbar class="sticky-top" />

    <div class="volunteerform">
      <form v-on:submit.prevent="submitForm" class="ApplyToVolunteer">
        <div class="form-row">
          <div class="form-group col-md-6">
            <label for="inputUsername">Username</label>
            <input
              type="text"
              class="form-control"
              id="inputUsername"
              placeholder="Username"
              v-model="applicant.inputUsername"
              required
            />
          </div>

          <div class="form-group col-md-6">
            <label for="inputPassword">Password</label>
            <input
              type="password"
              class="form-control"
              id="inputPassword"
              placeholder="Password"
               v-model="applicant.inputPassword"
              required
            />
          </div>
        </div>
        <div class="form-row">
          <div class="form-group col-md-6">
            <label for="inputFirstname">First Name</label>
            <input
              type="text"
              class="form-control"
              id="inputFirstname"
              placeholder="First Name"
               v-model="applicant.inputFirstname"
              required
            />
          </div>
          <div class="form-group col-md-6">
            <label for="inputLastname">Last Name</label>
            <input
              type="text"
              class="form-control"
              id="inputLastname"
              placeholder="Last Name"
               v-model="applicant.inputLastname"
              required
            />
          </div>

          <div class="form-row">
            <div class="form-group col-md-6">
              <label for="inputEmail">Email</label>
              <input
                type="email"
                class="form-control"
                id="inputEmail"
                placeholder="Joe@RescueRanch.com"
                 v-model="applicant.inputEmail"
                required
              />
            </div>

            <div class="form-group col-md-6">
              <label for="inputPhone">Phone Number (10 Digits)</label>
              <input
                type="tel"
                class="form-control"
                id="inputPhone"
                 v-model="applicant.inputPhone"
                placeholder="9194445555"
                :maxlength="10"
                pattern="[1-9]{1}[0-9]{9}"
                required
              />
            </div>
          </div>
        </div>
        <input type="submit" value="Submit" />
      </form>
    </div>
  </div>
</template>

<script>
import HeaderDefault from '../components/HeaderDefault.vue';
import Navbar from '../components/Navbar.vue';
import ApplicantService from "../services/ApplicantService";


export default {
  name: "ApplyToVolunteer",

  data() {
    return {
      applicant: {
        username: "",
        password_hash: "",
        fullname: "",
        email: "",
        phoneNumber:""
      },
      //errorMsg: ""
    };
  },

  components: { HeaderDefault, Navbar},

  methods: {
    submitForm() {
      const newApplicant = {
        //boardId: Number(this.$route.params.boardID),
        //dont know what is after the .
        username: this.applicant.inputUsername,
        password_hash: this.applicant.inputPassword,
        fullname: this.applicant.inputFirstname + " " +this.applicant.inputLastname ,
        email: this.applicant.inputEmail,
        phoneNumber: parseInt(this.applicant.inputPhone)
       
      
      //confirmation
  };

  
      if (newApplicant) {
        // add
        ApplicantService
          .addApplicant(newApplicant)
          .then(response => {
            if (response.status === 200) {
              this.$router.push('/thankyou');
            }
          })
          // .catch(error => {
          //   this.handleErrorResponse(error, "adding");
          // });
          ;
          //cancel form button

  //created() {},
  
      }
    }
  }
}
</script>

<style>
</style>
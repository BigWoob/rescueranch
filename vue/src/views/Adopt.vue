<template>
  <div>
    <header-default />
    <navbar />

     <form v-on:submit.prevent="submitForm" class="ApplyToVolunteer">
      
            <div class="form-group col-md-6">
              <label for="adopterEmail">Email</label>
              <input
                type="email"
                class="form-control"
                id="adopterEmail"
                placeholder="Joe@RescueRanch.com"
                 v-model="AdoptionApplication.adopterEmail"
                required
              />
            </div>

             <div class="form-group col-md-6">
              <label for="adopterPhoneNumber">Phone Number (10 Digits)</label>
              <input
                type="tel"
                class="form-control"
                id="inputPhone"
                 v-model="AdoptionApplication.adopterPhoneNumber"
                placeholder="9194445555"
                :maxlength="10"
                pattern="[1-9]{1}[0-9]{9}"
                required
              />
            </div>

        <div class="form-row">
          <div class="form-group col-md-6">
            <label for="adopterName">Your Name</label>
            <input
              type="text"
              class="form-control"
              id="adopterName"
              placeholder="Name"
               v-model="AdoptionApplication.adopterName"
              required
            />
          </div>
        </div>
        <input type="submit" value="Submit" />
      </form>
    <footer-default />
  </div>
</template>

<script>
import FooterDefault from '../components/FooterDefault.vue';
import HeaderDefault from "../components/HeaderDefault.vue";
import Navbar from "../components/Navbar.vue";
import petService from "../services/PetService";

export default {
  name: "Adopt",

   data() {
    return {
        pet: {},
        AdoptionApplication: {
        adoptionPetId: "{{ pet.petId }}",
        adopterEmail: "",
        adopterPhoneNumber: "",
        adopterName: "",
        applicationStatus: ""
      },
      //errorMsg: ""
    };
  },

 components: { HeaderDefault, Navbar, FooterDefault },

  methods: {
    submitForm() {
      const newApplicant = {
        adoptionPetId: this.pet.petId,
        adopterEmail: this.AdoptionApplication.adopterEmail,
        adopterPhoneNumber: this.AdoptionApplication.adopterPhoneNumber,
        adopterName: this.AdoptionApplication.adopterName,
        applicationStatus: this.AdoptionApplication.applicationStatus
  };

    if (newApplicant) {
        // add
        petService
          .applyToAdopt(newApplicant)
          .then(response => {
            if (response.status === 200) {
              this.$router.push('/thankyou');
            }
          });
    }
    }
  },
          //cancel form button

 created() {
    petService.getPetById(this.$route.params.id).then((response) => {
      this.pet = response.data;
    });
   }
  };
 


</script>

<style>
</style>
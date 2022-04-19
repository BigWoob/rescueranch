<template>
  <div>
    <b-navbar
      type="dark"
      id="nav"
      role="navigation"
      class="
        navbar
        bd-navbar
        flex-column flex-md-row
        navbar-expand
        nav-item
        sticky-top
        d-flex
        justify-content-center
      "
    >
      <b-navbar-nav class="d-flex justify-content-center">
        <b-nav-item
          href="/LoggedInHome"
          class="nav-item justify-content-end navbar-item"
          >Home</b-nav-item
        >

        <b-nav-item class="mr-auto navbar-item" href="/EditPets"
          >Manage Pets</b-nav-item
        >

        <b-nav-item-dropdown text="Volunteer" right>
          <b-dropdown-item navbar-item href="/ApplyToVolunteer"
            >Join The Team</b-dropdown-item
          >
          <b-dropdown-item href="/MeetTheTeam">Meet The Team</b-dropdown-item>
        </b-nav-item-dropdown>

        <b-nav-item class="mr-auto navbar-item" href="/ListApplicants"
          >Applicants</b-nav-item
        >
        <b-nav-item class="mr-auto navbar-item" href="/LoggedInHome#A"
          >About Us</b-nav-item
        >
        <b-nav-item class="mr-auto navbar-item" href="/RancherList"
          >Ranchers</b-nav-item
        >

        <b-nav-item class="mr-auto navbar-item" href="/AddPet"
          >Add a Pet</b-nav-item
        >

        <a class="nav-link navbar-item" href="/dono"
          ><i class="fa fa-heart"></i> Donate<span class="sr-only"
            >(current)</span
          ></a
        >

        <b-nav-item href="/logout" class="nav-item justify-content-end log"
          >Logout</b-nav-item
        >
      </b-navbar-nav>
    </b-navbar>
  </div>
</template>

<script>
export default {
  name: "loggedinnavbar",
};
</script>
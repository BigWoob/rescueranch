<template>
  <div>
      <div class="">
      <header>
        <div>
          <img
            id="title"
            class="img-fluid"
            src="../assets/images/smallerranch.jpg"
            alt="Title and Slogan"
            srcset=""
          />
        </div>
      </header>
      <b-navbar
      id="nav"
      role="navigation"
      class="navbar 
      bd-navbar 
      flex-column 
      flex-md-row 
      navbar-dark 
      navbar-expand 
      nav-item 
      sticky-top 
      navbar-custom"
    >
      <b-navbar-nav 
      class="d-flex justify-content-center">
      <b-nav-item href="/" class="nav-item justify-content-end">Home</b-nav-item>

        <b-nav-item-dropdown text="Adopt" right class="nav-item">
          <b-dropdown-item href="/AllPets">See All Animals</b-dropdown-item>
          <b-dropdown-item href="/Cats">Cats and Kittens</b-dropdown-item>
          <b-dropdown-item href="/Dogs">Dogs and Puppies</b-dropdown-item>
          <b-dropdown-item href="/Others">Other Animals</b-dropdown-item>
        </b-nav-item-dropdown>

        <b-nav-item-dropdown text="Volunteer" right>
          <b-dropdown-item href="/ApplyToVolunteer">Join The Team</b-dropdown-item>
          <b-dropdown-item href="https://www.linkedin.com/in/joe-righetti/">Meet The Team</b-dropdown-item>
        </b-nav-item-dropdown>

        <b-nav-item class="mr-auto" href="#A">About Us</b-nav-item>

        <a class="nav-link" href="/dono"><i class="fa fa-heart"></i> Donate<span class="sr-only">(current)</span></a>

        <b-nav-item href="/login" class="nav-item justify-content-end">Login</b-nav-item>
      </b-navbar-nav>
    </b-navbar>
    </div>

    <form>
        <div class="form-row">
          <div class="form-group col-md-6">
            <label for="inputFullname">Full Name</label>
            <input
              type="text"
              class="form-control"
              id="inputFullname"
              placeholder="Full Name"
            />
          </div>
        </div>

        <div class="form-row">
          <div class="form-group col-md-6">
            <label for="inputEmail">Email</label>
            <input
              type="email"
              class="form-control"
              id="inputEmail"
              placeholder="Joe@RescueRanch.com"
              required
            />
          </div>
        </div>

        <div class="form-row">
          <div class="form-group col-md-6">
            <label for="inputAmount">Donation</label>
            <input
              type="number"
              min="0.01" 
              step="0.01" 
              class="form-control"
              id="inputAmount"
              placeholder="Donation Amount"
              required
            />
          </div>
        </div>
           
        <button onClick="window.location.href='/ThankYou';"><input type="submit" value="Donate"/></button>      
        </form>
  </div>
</template>

<script>
export default {

}
</script>

<style>

</style>
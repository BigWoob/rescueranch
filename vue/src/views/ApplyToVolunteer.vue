<template>
  <div>
    <header-default />
    <div class="volunteerform">
      <form>
        <div class="form-row">
          <div class="form-group col-md-6">
            <label for="inputUsername">Username</label>
            <input
              type="text"
              class="form-control"
              id="inputUsername"
              placeholder="Username"
              required
            />
          </div>

          <div class="form-group col-md-6">
            <label for="inputPassword4">Password</label>
            <input
              type="password"
              class="form-control"
              id="inputPassword4"
              placeholder="Password"
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
                required
              />
            </div>

            <div class="form-group col-md-6">
              <label for="inputPhone">Phone Number (10 Digits)</label>
              <input
                type="tel"
                class="form-control"
                id="inputPhone"
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
export default {
  components: { HeaderDefault },};
</script>

<style>
</style>
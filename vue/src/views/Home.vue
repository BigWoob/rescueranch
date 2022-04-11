<template>
  <div>
    <header>
      <b-jumbotron id="title" header="Rescue Ranch Animal Shelter" lead="A Ranch of Second Chances">
      </b-jumbotron>
    </header>

    <b-navbar
      type="dark"
      variant="dark"
      id="nav"
      role="navigation"
      class="
        navbar
        bd-navbar
        flex-column flex-md-row
        navbar-dark navbar-expand
        nav-item
        sticky-top
      "
    >
      <b-navbar-nav>
        <b-nav-item href="/">Home</b-nav-item>

        <b-nav-item-dropdown text="Adopt" right class="nav-item">
          <b-dropdown-item href="#">Dog</b-dropdown-item>
          <b-dropdown-item href="#">Cat</b-dropdown-item>
          <b-dropdown-item href="#">Other</b-dropdown-item>
        </b-nav-item-dropdown>

        <b-nav-item-dropdown text="Volunteer" right>
          <b-dropdown-item href="/register">Join Us</b-dropdown-item>
          <b-dropdown-item href="#">About Us</b-dropdown-item>
        </b-nav-item-dropdown>

        <b-nav-item href="/login" class="nav-item">Login</b-nav-item>
      </b-navbar-nav>
    </b-navbar>


    <main id='main-grid'>

      <div class="about">
        <h2 class="subheading">About Us</h2>
      <p>
        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
        tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim
        veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
        commodo consequat. Duis aute irure dolor in reprehenderit in voluptate
        velit esse cillum dolore eu fugiat nulla pariatur. 
      </p>
      </div>

      <div>
    <b-carousel
      class="carousel"
      v-model="slide"
      :interval="4000"
      controls
      indicators
      background="#ababab"
      img-width="1024"
      img-height="480"
      style="text-shadow: 1px 1px 2px #333;"
      @sliding-start="onSlideStart"
      @sliding-end="onSlideEnd"
    >

      <b-carousel-slide
        caption="First slide"
        text="Nulla vitae elit libero, a pharetra augue mollis interdum."
        img-src="https://www.halifaxhumanesociety.org/zupload/site-options/pet-adoption-img1.jpg"
      ></b-carousel-slide>

      <b-carousel-slide
        caption="Second slide"
        text="Nulla vitae elit libero, a pharetra augue mollis interdum."
        img-src="https://ffwallpaper.com/thumb/cat-and-dog/cat-and-dog-4.jpg"
      ></b-carousel-slide>

      <b-carousel-slide
        caption="Third slide"
        text="Nulla vitae elit libero, a pharetra augue mollis interdum."
        img-src="data:image/jpeg;base64,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"
      ></b-carousel-slide>

      <b-carousel-slide
        caption="Fourth slide"
        text="Nulla vitae elit libero, a pharetra augue mollis interdum."
        img-src="https://ffwallpaper.com/thumb/cat-and-dog/cat-and-dog-11.jpg"
      ></b-carousel-slide>
    </b-carousel>
  </div>
    </main>
  </div>
</template>

<script>
export default {};
</script>

<style>

#title {
  color: black;
  
  background-image: 
  url("https://files.slack.com/files-pri/T0GNFLF6D-F03BFA9N6C9/image_from_ios.png")
}

.paragraph {
  text-align: center;
}

#nav {
  bottom: 0;
  width: 100%;
}

.nav-item {
  display: inline-block;
  font-size: 20px;
  padding: 1px 5px 1px 5px;
}

.subheading {
  text-align: center;
}

.about {
  grid-area: about;
   border: 1px solid pink;
   padding: 10px;
}

.carousel {
  grid-area: carousel;
  border: 1px solid limegreen;
  padding: 10px;
}

#main-grid {
  display: grid;
    grid-template-areas:
    "about about carousel"
    "cat dog other"
    "ranch ranch misc"
    "footer footer footer"
    ; 
    grid-template-columns:1fr 1fr 1fr;
    row-gap:10px;
    column-gap:10px;
    height:100vh;
}
</style>
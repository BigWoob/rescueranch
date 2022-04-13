<template>
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
      class="d-flex 
      justify-content-center">
        <b-nav-item href="/">Home</b-nav-item>

        <b-nav-item-dropdown text="Adopt" right class="nav-item">
          <b-dropdown-item href="#">Cats and Kittens</b-dropdown-item>
          <b-dropdown-item href="#">Dogs and Puppies</b-dropdown-item>
          <b-dropdown-item href="#">Other Animals</b-dropdown-item>
        </b-nav-item-dropdown>

        <b-nav-item-dropdown text="Volunteer" right>
          <b-dropdown-item href="/register">Join Us</b-dropdown-item>
          <b-dropdown-item href="https://www.linkedin.com/in/evanyhacker/">Meet The Team</b-dropdown-item>
        </b-nav-item-dropdown>

        <b-nav-item href="#A">About Us</b-nav-item>

        <b-nav-item href="/login" class="nav-item">Login</b-nav-item>

        <b-nav-item href="https://www.youtube.com/watch?v=dQw4w9WgXcQ">Donate</b-nav-item>
      </b-navbar-nav>
    </b-navbar>

    <body>
      <main>
        <div class="row mission">
          <div class="col-6 col-lg-4 col-xl-6">
            <h2 class="subheading">Our Mission</h2>
            <p class="paragraph">
              Rescue Ranch promotes, through its education, respect for all animals, as well as agricultural, environmental, and wildlife conservation, and facilitates rehabilitation, rescue, and responsible pet ownership in order to enhance the human-animal bond.
            </p>
          </div>

          <div class="col-sm-6 col-lg-8 col-xl-6">
            <b-carousel
              class="carousel image"
              v-model="slide"
              :interval="4000"
              controls
              indicators
              background="rgb(255, 255, 230)"
              img-width="1024"
              img-height="480"
              style="text-shadow: 1px 1px 2px #333"
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
                img-src="https://www.stageroadanimalhospital.com/files/spay-neuter-cat-memphis-vet.jpeg"
              ></b-carousel-slide>

              <b-carousel-slide
                caption="Fourth slide"
                text="Nulla vitae elit libero, a pharetra augue mollis interdum."
                img-src="https://ffwallpaper.com/thumb/cat-and-dog/cat-and-dog-11.jpg"
              ></b-carousel-slide>
            </b-carousel>
          </div>
        </div>
        <div class="row-director">
          <div
            class="fluid
              subyellow
              col-12 
              col-sm-12 
              col-md-12 
              col-lg-12 
              col-xl-12 
              col-xxl-12"
          >
            <h2 class="subyellow">Adopt a Pet Today!</h2>
          </div>
          <div class="d-flex 
          justify-content-space-evenly">
            <div class="row adopt">
              <div class="col-12">
                <img
                  class="img-fluid"
                  src="https://images.unsplash.com/photo-1580788404954-ae4e4bdc9061?ixlib=rb-1.2.1&ixid=MnwxM[…]G90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=880&q=80"
                  alt=""
                  srcset=""
                />
                <h2 class="subyellow">Cats</h2>
              </div>
            </div>
            <div class="row adopt">
              <div class="col-12">
                <img
                  class="img-fluid"
                  src="https://images.unsplash.com/photo-1587354004405-bbce24c893c8?ixlib=rb-1.2.1&ixid=MnwxM[…]G90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=880&q=80"
                  alt=""
                  srcset=""
                />
                <h2 class="subyellow">Dogs</h2>
              </div>
            </div>
            <div class="row adopt">
              <div class="col-12">
                <img
                  class="img-fluid"
                  src="https://images.unsplash.com/photo-1589643989849-b4cef7873cd4?ixlib=rb-1.2.1&ixid=MnwxM[…]G90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=880&q=80"
                  alt=""
                  srcset=""
                />
                <h2 class="subyellow">Others</h2>
              </div>
            </div>
          </div>
        </div>
        <div class="row mission">
          <div class="col-sm-6 col-lg-8">
            <img
              class="img-fluid image"
              src="https://www.humanesociety.org/sites/default/files/styles/2000x850/public/2018/08/dog-girl-440625.jpg?h=558430af&itok=R-RS3S6N"
              alt=""
              srcset=""
            />
          </div>
          <div class="col-6 col-lg-4">
            <h2 class="subheading">About The Team</h2>
            <a name="A"></a>
            <p class="paragraph">
              Our team consists of pet-passionate individuals from all over, with expertise in many areas. We work to include all members of our community to help connect and develop programs to support our mission.
            </p>
          </div>
        </div>
      </main>
    </body>
    <footer>
      <div class="foot">
      “When you look into the eyes of an animal you’ve rescued, you can’t help but fall in love.” — <a class="paul" href="https://en.wikipedia.org/wiki/Paul_Shaffer"> Paul Shaffer</a>
      </div>
    </footer>
  </div>
</template>

<script>
export default {};
</script>

<style>
#title {
  width: 100%;
}

.image {
  border: 10px solid rgb(255, 255, 230);
  border-radius: 50px;
  overflow: hidden;

}

.row-director {
  background-color: rgb(155, 34, 38);
}

.subyellow {
  color: rgb(255, 255, 230);
  text-shadow: 1px black;
}

.col-12 > img {
  border-radius: 50%;
  border: 7px solid rgb(255, 255, 230);
}

.mission {
  background-color: rgb(255, 255, 230);
}

.director {
  background-color: rgb(155, 34, 38);
}

.paragraph {
  text-align: center;
  padding-left: 10px;
  padding-right: 10px;
  font-size: 25px;
}

#nav {
  bottom: 0;
  width: 100%;
  background-color: rgb(155, 34, 38);
}

.nav-item {
  display: inline-block;
  font-size: 20px;
  padding: 1px 5px 1px 5px;
}

h2 {
  text-align: center;
  color: rgb(155, 34, 38);
  text-shadow: 2px black;
  padding: 15px;
  text-shadow: black 1px 0px 0px, black 0.540302px 0.841471px 0px, black -0.416147px 0.909297px 0px, black -0.989992px 0.14112px 0px, black -0.653644px -0.756802px 0px, black 0.283662px -0.958924px 0px, black 0.96017px -0.279416px 0px;
}

.d-flex {
  display: flex !important;
  justify-content: space-evenly;
}

.adopt {
  text-align: center;
}

.col-12 > img {
  max-width: 50%;
}

.foot {
  padding: 10px;
  border-top: 10px solid rgb(155, 34, 38);
  background-color: rgb(255, 255, 230);
  font-style: italic;
  text-align: center;
}

.paul {
  color: black;
}

</style>
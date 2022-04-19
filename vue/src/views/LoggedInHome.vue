<template>
  <div>
      <div>
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
  </div> 
  
  <logged-in-navbar class="sticky-top" />


    <body>
      <main>
        <div class="row mission">
          <div class="col-6 col-lg-4 col-xl-6">
            <h2 class="subheading">Our Mission</h2>
            <p class="paragraph">
              Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
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
          <a class="yunderline" href="AllPets"><h2 class="subyellow">Adopt a Pet Today!</h2></a>
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
                <a class="yunderline" href="Cats"><h2 class="subyellow">Cats</h2></a>
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
                <a class="yunderline" href="Dogs"><h2 class="subyellow">Dogs</h2></a>
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
                <a class="yunderline" href="Others"><h2 class="subyellow">Other Animals</h2></a>
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
              Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.
            </p>
            <a class="subheading" href="/MeetTheTeam"><h2 class="subheading">Click To Meet The Team</h2></a>
          </div>
        </div>
      </main>
    </body>
    <footer-default />
  </div>

</template>

<script>
import FooterDefault from "../components/FooterDefault";
import LoggedInNavbar from "../components/LoggedInNavbar";

export default {
  components: { FooterDefault, LoggedInNavbar }
};
</script>

<style>

</style>
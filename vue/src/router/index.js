import Vue from 'vue'
import Router from 'vue-router'
import Home from '../views/Home.vue'
import Login from '../views/Login.vue'
import Logout from '../views/Logout.vue'
import Register from '../views/Register.vue'
import AllPets from '../views/AllPets.vue'
import Cats from '../views/Cats.vue'
import Dogs from '../views/Dogs.vue'
import Others from '../views/Others.vue'
import ApplyToVolunteer from '../views/ApplyToVolunteer.vue'
import Dono from '../views/Dono.vue'
import ThankYou from '../views/ThankYou.vue'
import ListRanchers from '../views/ListRanchers.vue'
import LoggedInHome from '../views/LoggedInHome.vue'
import ListApplicants from '../views/ListApplicants.vue'
import store from '../store/index'

Vue.use(Router)

/**
 * The Vue Router is used to "direct" the browser to render a specific view component
 * inside of App.vue depending on the URL.
 *
 * It also is used to detect whether or not a route requires the user to have first authenticated.
 * If the user has not yet authenticated (and needs to) they are redirected to /login
 * If they have (or don't need to) they're allowed to go about their way.
 */

const router = new Router({
    mode: 'history',
    base: process.env.BASE_URL,
    routes: [{
            path: '/',
            name: 'home',
            component: Home,
            meta: {
                requiresAuth: false
            }
        },
        {
            path: "/login",
            name: "login",
            component: Login,
            meta: {
                requiresAuth: false
            }
        },
        {
            path: "/logout",
            name: "logout",
            component: Logout,
            meta: {
                requiresAuth: false
            }
        },
        {
            path: "/register",
            name: "register",
            component: Register,
            meta: {
                requiresAuth: false
            }
        },
        {
            path: "/allpets",
            name: "allpets",
            component: AllPets,
            meta: {
                requiresAuth: false
            }
        },
        {
            path: "/cats",
            name: "cats",
            component: Cats,
            meta: {
                requiresAuth: false
            }
        },
        {
            path: "/dogs",
            name: "dogs",
            component: Dogs,
            meta: {
                requiresAuth: false
            }
        },
        {
            path: "/others",
            name: "others",
            component: Others,
            meta: {
                requiresAuth: false
            }
        },
        {
            path: "/applytovolunteer",
            name: "applytovolunteer",
            component: ApplyToVolunteer,
            meta: {
                requiresAuth: false
            }
        },
        {
            path: "/thankyou",
            name: "thankyou",
            component: ThankYou,
            meta: {
                requiresAuth: false
            }
        },
        {
            path: "/dono",
            name: "dono",
            component: Dono,
            meta: {
                requiresAuth: false
            }
        },
        {
            path: "/loggedinhome",
            name: "loggedinhome",
            component: LoggedInHome,
            meta: {
                requiresAuth: true
            }
        },
        {
            path: "/rancherlist",
            name: "rancherlist",
            component: ListRanchers,

            meta: {
                requiresAuth: false
            }
        },
        {
            path: "/listapplicants",
            name: "listapplicants",
            component: ListApplicants,

            meta: {
                requiresAuth: true
            }
        }

    ]
})

router.beforeEach((to, from, next) => {
    // Determine if the route requires Authentication
    const requiresAuth = to.matched.some(x => x.meta.requiresAuth);

    // If it does and they are not logged in, send the user to "/login"
    if (requiresAuth && store.state.token === '') {
        next("/login");
    } else {
        // Else let them go to their next destination
        next();
    }
});

export default router;
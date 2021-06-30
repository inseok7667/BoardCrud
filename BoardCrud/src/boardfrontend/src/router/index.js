import { createWebHistory, createRouter } from 'vue-router';
// import Home from './Home.vue';


const routes = [
 
  {
    path: '/board',
    name: 'board',
    component: () => import('@/views/Board')
  },

  {
    path: '/board/save',
    name: 'save',
    component: () => import('@/views/BoardSave'),
  },
  {
    path: '/board/detail/:number',
    name: 'boarddetail',
    component: () => import('@/views/BoardDetail')
  },
  {
    path: '/boardtest',
    name: 'boardtest',
    component: () => import('@/views/BoardTest')
  },
  {
    path: '/boardsavetest',
    name: 'boardsavetest',
    component: () => import('@/views/BoardSaveTest')
  },
];



export const router = createRouter({
  history: createWebHistory(),
  routes,
});
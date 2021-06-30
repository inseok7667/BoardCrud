import { createApp } from 'vue'
import App from './App.vue'
import { router } from './router'; // 라우터 추가하고 
// import { BootstrapVue } from 'bootstrap-vue'





const app = createApp(App);
app.use(router); // 사용 설정 하기
// app.use(BootstrapVue);

app.mount('#app');
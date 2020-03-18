//项目入口js  文件
 
//导入基础模块
import Vue from 'vue'
import VueRouter from 'vue-router'
import app from   './app.vue'
import axios from 'axios'
//可以给axios的ajax请求设置统一的主机和端口号
//将axios这个对象添加到Vue的原型对象中，在使用的时候就只需要使用this.对象名就可以了
// Vue.prototype.$http = axios;
// 将API方法绑定到全局
Vue.prototype.$axios = axios;
axios.defaults.baseURL = "http://192.168.2.108:8080/";
Vue.config.productionTip = false;
// axios.defaults.baseURL="/api"
// axios.defaults.headers.post['Content-Type']='application/json';
// axios.defaults.headers.common['Authorization'] = 'AUTH_TOKEN';
// axios.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded';


//添加session  支持
import sessionStorage from '@/storage/sessionStorage'
Vue.prototype.Session = sessionStorage //挂载到Vue实例上面
//添加全局变量
import Global from '@/common/Global'
Vue.prototype.Global = Global //挂载到Vue实例上面


//导入需要的全局样式
import 'bootstrap/dist/css/bootstrap.min.css';


//支持less
import less from 'less';
Vue.use(less);

//注册mint-ui 部分组件
import Mint from 'mint-ui';
import 'mint-ui/lib/style.css'
Vue.use(Mint);

import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
Vue.use(ElementUI);

// import VueHtml5Editor from 'vue-html5-editor'
// Vue.use(VueHtml5Editor,VueHtml5Editor);

//导入 vue router
Vue.use(VueRouter);
//引入自定义路由
import router  from './route/router.js'

new Vue({
    el : '#root',
    data :{
      // msg :'123'
    },
    render : c => c(app),
    router,
    mounted() {
      if (this._isMobile()) {
        // alert("手机端");
        Vue.prototype.Session.set("channel","mp");
        // this.$router.replace('/m_index');
      } else {
        // alert("pc端");
        Vue.prototype.Session.set("channel","pc");
        // this.$router.replace('/pc_index');
      }
    },
    methods :{
      _isMobile() {
        let flag = navigator.userAgent.match(/(phone|pad|pod|iPhone|iPod|ios|iPad|Android|Mobile|BlackBerry|IEMobile|MQQBrowser|JUC|Fennec|wOSBrowser|BrowserNG|WebOS|Symbian|Windows Phone)/i)
        return flag;
      }
    }
})

//循环遍历 注册某个文件下所有组件
// const requireComponent = require.context(
//   // 其组件目录的相对路径
//   './components',
//   // 是否查询其子目录
//   false,
//   // 匹配基础组件文件名的正则表达式
//   /Base[A-Z]\w+\.(vue|js)$/
// )
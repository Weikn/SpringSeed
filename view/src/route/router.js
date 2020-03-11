// 专门用于处理路由的组件



//导入组件
import VueRouter from 'vue-router'
import login from   '../page/loginView.vue'
import noteList from '../page/noteListView.vue'
import menu from '../components/mianMenu.vue'
import noteInfo from '../page/noteInfoView.vue'


//创建一个路由对象
var router  = new VueRouter({
    routes :[
      {
        path : '/', component : login
      },
      {
        path : '/login', 
        component : login,
        children : [
          {path : 'menu' , component : menu}
        ]
      } ,
      {path : '/noteList',component :noteList},
      {path : '/noteInfo',component :noteInfo}

    ]

})
//把路由对象暴露出去
export  default router
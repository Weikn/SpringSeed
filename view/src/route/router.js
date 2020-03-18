// 专门用于处理路由的组件



//导入组件
import VueRouter  from 'vue-router'
import login      from 'page/loginView'
import noteList   from 'page/noteListView'
// import menu from 'components/mianMenu'
import noteInfo   from 'page/noteInfoView'

//导入 pc
import noteListPC from  'page/pc/noteListPC'

//导入 mp
import noteListMP from  'page/mp/noteListMP'


const routes = [
  {path : '/', component : login},
  {path : '/noteList',component :noteList},
  {path : '/noteInfo',component :noteInfo},

  //pc 
  {path : '/noteListPC',component :noteListPC},


  //mp
  {path : '/noteListMP',component :noteListMP},

]

//创建一个路由对象
var router  = new VueRouter({
    routes : routes
})

router.beforeEach((to,from,next)=>{

  // console.log("to this is ");
  // console.log(to);
  // console.log("from this is");
  // console.log(from)
  // if (to.path != '/' &&  to.path.)
  next();
  // if(to.matched.some(res=>res.meta.isLogin)){//判断是否需要登录
  //     // if (sessionStorage['username']) {
  //     //     next();
  //     // }else{
  //     //     next({
  //     //         path:"/login",
  //     //         query:{
  //     //             redirect:to.fullPath
  //     //         }
  //     //     });
  //     // }

  // }else{
  //     next()
  // }
});


//把路由对象暴露出去
export  default router
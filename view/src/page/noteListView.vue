<template>
    <div>
        <div class=top>
          <mt-header title="Welcome to seed">
            <!-- <router-link to="/" slot="left">
              <mt-button icon="back">返回</mt-button>
            </router-link> -->
            <!-- <mt-button icon="more" slot="right"></mt-button> -->
          </mt-header>
        </div>
        <div class='headerBtu'>     
          <span>
            <svg xmlns="http://www.w3.org/2000/svg" @click="menuHandler()" class="bi bi-list-ul" width="1em" height="1em" viewBox="0 0 20 20" fill="currentColor">
              <path fill-rule="evenodd" d="M7 13.5a.5.5 0 01.5-.5h9a.5.5 0 010 1h-9a.5.5 0 01-.5-.5zm0-4a.5.5 0 01.5-.5h9a.5.5 0 010 1h-9a.5.5 0 01-.5-.5zm0-4a.5.5 0 01.5-.5h9a.5.5 0 010 1h-9a.5.5 0 01-.5-.5zm-3 1a1 1 0 100-2 1 1 0 000 2zm0 4a1 1 0 100-2 1 1 0 000 2zm0 4a1 1 0 100-2 1 1 0 000 2z" clip-rule="evenodd"/>
            </svg>
          </span>
          <span>
            <svg class="bi bi-three-dots-vertical"  @click="menuHandler()" width="1em" height="1em" viewBox="0 0 20 20" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
              <path fill-rule="evenodd" d="M11.5 15a1.5 1.5 0 11-3 0 1.5 1.5 0 013 0zm0-5a1.5 1.5 0 11-3 0 1.5 1.5 0 013 0zm0-5a1.5 1.5 0 11-3 0 1.5 1.5 0 013 0z" clip-rule="evenodd"></path>
            </svg>
          </span>
          <span>
            <svg xmlns="http://www.w3.org/2000/svg" @click="searchHandler()" class="bi bi-search" width="1em" height="1em" viewBox="0 0 20 20" fill="currentColor">
              <path fill-rule="evenodd" d="M12.442 12.442a1 1 0 011.415 0l3.85 3.85a1 1 0 01-1.414 1.415l-3.85-3.85a1 1 0 010-1.415z" clip-rule="evenodd"/>
              <path fill-rule="evenodd" d="M8.5 14a5.5 5.5 0 100-11 5.5 5.5 0 000 11zM15 8.5a6.5 6.5 0 11-13 0 6.5 6.5 0 0113 0z" clip-rule="evenodd"/>
            </svg>
          </span>
          <h1>所有笔记</h1>
        </div>
        <div class='bodyContext'>
          <div>
            <h5>2020-02-25</h5>
            <hr>
            <p>1:33</p>
            <h1>今天编写notelist</h1>
            <h3>notelist  是作为一个展示页面</h3>
            <hr>
          </div>
          <div>
            <h5>2020-02-25</h5>
            <hr>
            <p>1:33</p>
            <h1>今天吃什么</h1>
            <h3>有点瞌睡了</h3>
            <hr>
          </div>
        </div>
        <div class="penBtu">
          <svg class="bi bi-pencil" @click="panBtuHandler" width="1em" height="1em" viewBox="0 0 20 20" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
            <path fill-rule="evenodd" d="M13.293 3.293a1 1 0 011.414 0l2 2a1 1 0 010 1.414l-9 9a1 1 0 01-.39.242l-3 1a1 1 0 01-1.266-1.265l1-3a1 1 0 01.242-.391l9-9zM14 4l2 2-9 9-3 1 1-3 9-9z" clip-rule="evenodd"></path>
            <path fill-rule="evenodd" d="M14.146 8.354l-2.5-2.5.708-.708 2.5 2.5-.708.708zM5 12v.5a.5.5 0 00.5.5H6v.5a.5.5 0 00.5.5H7v.5a.5.5 0 00.5.5H8v-1.5a.5.5 0 00-.5-.5H7v-.5a.5.5 0 00-.5-.5H5z" clip-rule="evenodd"></path>
          </svg>
        </div>
    </div>
</template>

<script>

// import  {Header,CellSwipe  }  from 'mint-ui'
import 'bootstrap/dist/css/bootstrap.min.css';



export  default {
    data () {
      return {
        allLoaded  : ''
      }
    },
    methods : {
      panBtuHandler(){
        alert('panBtu  click')
      },

      searchHandler(){
        alert('search  click')
      },

      menuHandler(){
        alert('menu  click')
      },

      loadTop() {
      // 加载更多数据
        this.$refs.loadmore.onTopLoaded();
      },
      loadBottom() {
      // 加载更多数据
        this.allLoaded = true;// 若数据已全部获取完毕
        this.$refs.loadmore.onBottomLoaded();
      }
    }
}
</script>

<style scoped>
  .headerBtu{
    /* margin-top : 8% ; */
    height: 140px;
    background-color : white;
    border-bottom: solid 1px slategray;
    padding-left: 2%;
    margin-bottom: 2.5%;
    position:  relative;
  }
  .headerBtu > h1 {
    padding-left: 1%;
    padding-top: 2%;
    /* padding-reght */
  }
  .bi {
    font-size  : 400%;
  }
  .bi-three-dots-vertical  {
    float :right ;
    padding-right: 2%;
  }
  .bi-search  {
    float :right ;
    padding-right: 2%;
  }
  .bodyContext{
    padding-left :3.5%;
    padding-right:2%;
    /* border:  solid  black  2px; */
    /* background-color: aqua */
  }
  /* .bodyContext  hr {
    border: 1px solid  slategray; 
    padding-top: 1%;
     padding-bottom :1%;
  } */
  /* .bodyContext > h5 {
    margin-top : 1px;
  } */
  .penBtu{
    /* float:right; */
    /* width: 50px;
      height: 50px;
      background: blue; */
      position: absolute;
      right: 35px;
      bottom: 35px;
  }
</style>
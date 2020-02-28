/* eslint-disable no-empty */
<template>
  <!---登录组件 全屏背景没有现成的组件得来bootstrap  自适应--->
  <div class="container-fuild	">
    <center><img src="../img/log.png"/></center>
    <h1>Welcome</h1>
    <form>
      <hr>
        <div class="form-group input-group">
              <div class="input-group-prepend">
                <!-- <div class="bi bi-person-fill"></div> -->
                <svg class="bi bi-person-fill" width="1em" height="1em" viewBox="0 0 20 20" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                  <path fill-rule="evenodd" d="M5 16s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H5zm5-6a3 3 0 100-6 3 3 0 000 6z" clip-rule="evenodd"></path>
                </svg>
              </div>
              <input type="text" v-model="username" name="username" id="username" class="form-input" />
        </div>
      <hr>
      <div class="form-group input-group">
              <div class="input-group-prepend">
                <!-- <div class="bi bi-person-fill"></div> -->
                <svg xmlns="http://www.w3.org/2000/svg" class="bi bi-lock-fill" width="1em" height="1em" viewBox="0 0 20 20" fill="currentColor">
                  <rect width="11" height="9" x="4.5" y="8" rx="2"/>
                  <path fill-rule="evenodd" d="M6.5 5a3.5 3.5 0 117 0v3h-1V5a2.5 2.5 0 00-5 0v3h-1V5z" clip-rule="evenodd"/>
                </svg>
              </div>
              <input type="text" v-model="password" name="password" id="password" class="form-input" />
        </div>
      <hr>
      <button type="button" class="btn btn-primary" @click="login">登&nbsp;	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;录</button>
    </form>
  </div>
</template>

<script>
import 'bootstrap/dist/css/bootstrap.min.css';


export  default {
    data () {
      return {
        username : '',
        password : ''
      }
    },
    methods : {
      login(){
        console.log("调用 login 的方法")
        // console.log(this.username)
        //获取到账号密码 然后调用后台api 确认账号密码是否正确 给通过

        //通过后给父组件发消息 路由跳转
        if ( this.username != '' ) {
          // this.$emit()
          this.$router.push('noteList')
        }
        else 
        {
//
        }
        //不通过 提示


      }
    }

}
</script>

<style scoped>
  form {
    margin-top: 30%;
    margin-bottom: 5%
  }
  .container-fuild {
    width: 100%;
    height: 100%;
    background  : rgba(44, 62, 84, 1);
    position: absolute

  }
  img {
    margin-top: 30%;
    width: 30%;
    height: 30%;
    
  }  
  h1 {
    color : white;
    text-align:center;
    line-height:100px;
    font-size: 500%
  }
  .input-group-prepend{
    margin-left: 9%
  }
  .bi{
    font-size : 400%;
  }
  .form-input {
    width:74%;
    outline: none;
    border:none;
    border-radius:0;
    box-shadow: 0px 0px 0px 0px;
    background-color :rgba(44, 62, 84, 1);
  }
  hr {
    width: 80%;
    border:0px;
    border-bottom:2px solid #070707;
  }
  .btn {
    margin-top : 9% ;
    width: 82%;
    font-size :3rem;
    margin-left: 9%;
  }
</style>
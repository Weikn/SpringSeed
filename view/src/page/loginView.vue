<template>
  <!---登录组件 全屏背景没有现成的组件得来bootstrap  自适应--->
  <div class="container-fuild">
    <div class="row">
      <div class="col-sm-12  col-md-2 center-block" style="border : red solid 1px">
        <img class="img-responsive center-block"  src="../img/log.png"/>
        <!-- <p class="text-center"><img src="../img/log.png"/></p> -->
      </div>
    </div>
    <div class="row"><h1>Welcome</h1></div>
    <div class="row">
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
        <center><p>{{ msg }}</p></center>
        <button type="button" class="btn btn-primary" @click.prevent="login">登&nbsp;	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;录</button>
      </form>
    </div>
  </div>
</template>

<script>
import 'bootstrap/dist/css/bootstrap.min.css';


export  default {
    data () {
      return {
        username : '',
        password : '',
        msg : ''
      }
    },
    methods : {
      login(){
        //获取到账号密码 然后调用后台api 确认账号密码是否正确 给通过
        if (this.password == '') {
            this.msg = '密码不能为空';
        }
        if ( this.username == '') {
          // this.$emit()
            this.msg = '账户不能为空';
        }  
        //创建表单提交
        let  formData =  new FormData();
        //塞入数据
        formData.append('userCode',this.username);
        formData.append('userPWD',this.password);
        // 设置请求头
        let config = {
          headers : {
            'Content-Type' : 'application/x-www-form-urlencoded'
          }
        }

        //post
        this.$axios.post('login',formData,config).then(res=>{
          console.log('hello');
          this.$router.push('noteList') ;
        }).catch(err=>{

        })

        // this.$axios.get('login/' + this.username)
        // .then(function (response) {
        //   console.log(response);
        //   this.$router.push('noteList') 
        // })
        // .catch(function (error) {
        //   console.log(error);
        // });
      
        //不通过 提示


      }
    }

}
</script>

<style scoped>
 .container-fuild {
    width: 100%;
    display:table;
    height: 100%;
    background  : rgba(44, 62, 84, 1);
    position: absolute;

  }
  .container-login{ 
    padding-left: 0;
    padding-right: 0;
    margin-left: 0;
    margin-right: 0;
    background  : rgba(44, 62, 84, 1);

  }
  .img-responsive {
    display: block;
    height: auto;
    max-width: 50%;
  }
  .center-block {
    display: block;
    margin-left: auto;
    margin-right: auto;
  }
  
   /* img {
    margin-top: 10%;
    width: 30%;
    height: 30%;
    border: red solid 1px;
  }   */
  /* form  p {
    color:red;
    font-size: 30px;
    font-weight:bold;  
  }
  form {
    margin-top: 30%;
    margin-bottom: 5%
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
    width:70%;
    font-size: 40px;
    height: 60px;
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
  } */
</style>
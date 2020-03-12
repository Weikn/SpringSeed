<template>
  <!---登录组件 全屏背景没有现成的组件得来bootstrap  自适应--->
  <div class="container-fuild">
    <div class="container-login">
      <div class="row">
        <!-- <div class="col-sm-*  col-md-1  col-lg-4 center-block" style="border : red solid 1px">
          <img class="img-responsive center-block"  src="../img/log.png"/>
        </div> -->
        <div class="imgClass visible-md-block visible-lg-block" >
          <img class="img-responsive"  src="../img/log.png"/>
        </div>
      </div>
      <div class="row">
        <div class="titleClass visible-md-block visible-lg-block">
          <h1 class="">Welcome</h1>
        </div>
      </div>
  
      <div class="row">
        <div class="alertCls  visible-md-block visible-lg-block">
           <p v-text="msg"></p>
        </div>
        <form class="formClass  visible-md-block visible-lg-block">
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
    </div>
  </div>
</template>

<script>
import  'bootstrap/dist/css/bootstrap.min.css';
import  '../style/login/login.less';


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
        if ( this.username == '') {
          // this.$emit()
            this.msg = '账户不能为空';
            return;
        } 
        if (this.password == '') {
            this.msg = '密码不能为空';
            return;
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
          if (res.status == 'success'){
            this.$router.push('noteList') ;
          }
          else {
            this.msg = 'password is  error'
          }
        }).catch(err=>{
            this.msg = 'Unknown error'
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
</style>
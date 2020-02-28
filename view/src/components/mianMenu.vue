<template>
    <div>
      <h1>  menu  component</h1>
    </div> 
</template>

<script>
export  default {
    data () {
      return {
        msg : '这是login Msg'
      }
    },
    methods : {
      show(){
        console.log("调用 show 的方法")
      }
    }

}
</script>

<style scoped>
    h1 {
        color : red
    }
</style> 
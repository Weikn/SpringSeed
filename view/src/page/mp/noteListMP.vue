<template>
    <div>
      <mt-header  title="固定在顶部 "></mt-header>
      <mt-loadmore   :top-method="loadTop"  :bottom-all-loaded="allLoaded" ref="loadmore">
        <!-- <ul>
          <li v-for="item in list" v-bind:key="item.id">{{ item.name }}</li>
        </!--> 
        <!-- <template v-for="item in list" v-bind:key="item.id"> -->
        <mt-cell v-for="item in list" v-bind:key="item.id" :title="item.name" />
        <!-- </template> -->

      </mt-loadmore>
      <mt-palette-button content="+">
        <div class="my-icon-button"></div>
        <div class="my-icon-button"></div>
        <div class="my-icon-button"></div>
      </mt-palette-button>
    </div>
</template>

<script>
export  default {
  data () {
    return {
      list : [{"id":"1","name":"zhangsan"},{"id":"2","name":"lisi"}],
      allLoaded : false,
    }
  },
  methods : {
    loadTop (){
      console.log("loadTop")
      let  tempList = [
        {
        "id"    : "3",
        "name"  : "王五"
        },
        {
        "id"    : "4",
        "name"  : "王五"
        },
        {
        "id"    : "5",
        "name"  : "王五"
        },
        {
        "id"    : "6",
        "name"  : "王五"
        }
      ]
      // this.list.push(tempList);
      // ls.push(this.list);
      let ls = [];
      ls = tempList.concat(this.list);
      console.log(ls);
      ls.forEach((e,i)=>{              //创建需要滑动的多个变量
                this.$set(this.list, i, e)						
            })        
      // this.$set(this.list,tempList)
      console.log("end" + this.list.toString());
      this.$refs.loadmore.onTopLoaded();
    }
  }
}
</script>

<style scoped>
  
</style>
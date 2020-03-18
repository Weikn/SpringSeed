const sessionStorage={
  //设置/ 
  set(key,value){
    window.sessionStorage.setItem(key,value)   
  },
  //获得/  
  get(key){
   return window.sessionStorage.getItem(key)
  },
  //移除/ 
  remove(key){
    window.sessionStorage.removeItem(key)
  }
}
export default sessionStorage
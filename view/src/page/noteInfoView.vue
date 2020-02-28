<!--
    拆分详细点的组件
    三七分一个页面  上面是功能区  下面是页面区
----->
<template>
    <div>
        <mt-header title="Welcome to seed"></mt-header>
        <div class="header">
            <div class="funArea">
                <!-- 按钮 确认保存 字体 附件 照片  分享 更多 根据状态不一致展示按钮不一致--->
                <svg class="bi bi-check" width="1em" height="1em" viewBox="0 0 20 20" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                  <path fill-rule="evenodd" d="M15.854 5.646a.5.5 0 010 .708l-7 7a.5.5 0 01-.708 0l-3.5-3.5a.5.5 0 11.708-.708L8.5 12.293l6.646-6.647a.5.5 0 01.708 0z" clip-rule="evenodd"></path>
                </svg>

                <svg class="bi bi-chevron-left" width="1em" height="1em" viewBox="0 0 20 20" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                  <path fill-rule="evenodd" d="M13.354 3.646a.5.5 0 010 .708L7.707 10l5.647 5.646a.5.5 0 01-.708.708l-6-6a.5.5 0 010-.708l6-6a.5.5 0 01.708 0z" clip-rule="evenodd"></path>
                </svg>

                <svg class="bi bi-fonts" width="1em" height="1em" viewBox="0 0 20 20" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                 <path d="M14.258 5H5.747l-.082 2.46h.479c.26-1.544.758-1.783 2.693-1.845l.424-.013v7.827c0 .663-.144.82-1.3.923v.52h4.082v-.52c-1.162-.103-1.306-.26-1.306-.923V5.602l.43.013c1.935.062 2.434.301 2.694 1.846h.479L14.258 5z"></path>
                </svg>

                <svg class="bi bi-folder-symlink" width="1em" height="1em" viewBox="0 0 20 20" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                  <path d="M11.828 6a3 3 0 01-2.12-.879l-.83-.828A1 1 0 008.173 4H4.5a1 1 0 00-1 .981L3.546 6h-1L2.5 5a2 2 0 012-2h3.672a2 2 0 011.414.586l.828.828A2 2 0 0011.828 5v1z"></path>
                  <path fill-rule="evenodd" d="M15.81 6H4.19a1 1 0 00-.996 1.09l.637 7a1 1 0 00.995.91h10.348a1 1 0 00.995-.91l.637-7A1 1 0 0015.81 6zM4.19 5a2 2 0 00-1.992 2.181l.637 7A2 2 0 004.826 16h10.348a2 2 0 001.991-1.819l.637-7A2 2 0 0015.81 5H4.19z" clip-rule="evenodd"></path>
                  <path d="M10.616 12.24l3.182-1.969a.442.442 0 000-.742l-3.182-1.97c-.27-.166-.616.036-.616.372V8.7c-.857 0-3.429 0-4 4.8 1.429-2.7 4-2.4 4-2.4v.769c0 .336.346.538.616.371z"></path>
                </svg>
                <svg class="bi bi-image" width="1em" height="1em" viewBox="0 0 20 20" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                  <path fill-rule="evenodd" d="M16.002 4h-12a1 1 0 00-1 1v10a1 1 0 001 1h12a1 1 0 001-1V5a1 1 0 00-1-1zm-12-1a2 2 0 00-2 2v10a2 2 0 002 2h12a2 2 0 002-2V5a2 2 0 00-2-2h-12z" clip-rule="evenodd"></path>
                  <path d="M12.648 9.646a.5.5 0 01.577-.093l3.777 1.947V16h-14v-2l2.646-2.354a.5.5 0 01.63-.062l2.66 1.773 3.71-3.71z"></path>
                  <path fill-rule="evenodd" d="M6.502 9a1.5 1.5 0 100-3 1.5 1.5 0 000 3z" clip-rule="evenodd"></path>
                </svg>

                <svg class="bi bi-three-dots-vertical"   width="1em" height="1em" viewBox="0 0 20 20" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                  <path fill-rule="evenodd" d="M11.5 15a1.5 1.5 0 11-3 0 1.5 1.5 0 013 0zm0-5a1.5 1.5 0 11-3 0 1.5 1.5 0 013 0zm0-5a1.5 1.5 0 11-3 0 1.5 1.5 0 013 0z" clip-rule="evenodd"></path>
                </svg>
            </div>
            <div class="titleArea">
                <!-- 主题 新增标题 修改标题-->
                <h1>这是今天的主题 你们还好吗</h1>
            </div>
            <div class="describeArea">
                <!-- 所属笔记分类  提醒 标记 详情-->
                <svg class="bi bi-stopwatch" width="1em" height="1em" viewBox="0 0 20 20" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                  <path fill-rule="evenodd" d="M10 17a6 6 0 100-12 6 6 0 000 12zm0 1a7 7 0 100-14 7 7 0 000 14z" clip-rule="evenodd"></path>
                  <path fill-rule="evenodd" d="M10 6.5a.5.5 0 01.5.5v4a.5.5 0 01-.5.5H6.5a.5.5 0 010-1h3V7a.5.5 0 01.5-.5zm-2.5-4A.5.5 0 018 2h4a.5.5 0 010 1H8a.5.5 0 01-.5-.5z" clip-rule="evenodd"></path>
                  <path d="M9 3h2v2H9V3z"></path>
                </svg>

                <svg class="bi bi-alert-square" width="1em" height="1em" viewBox="0 0 20 20" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                  <path fill-rule="evenodd" d="M16 3H4a1 1 0 00-1 1v12a1 1 0 001 1h12a1 1 0 001-1V4a1 1 0 00-1-1zM4 2a2 2 0 00-2 2v12a2 2 0 002 2h12a2 2 0 002-2V4a2 2 0 00-2-2H4z" clip-rule="evenodd"></path>
                  <rect width="2" height="2" x="9.002" y="12" rx="1"></rect>
                  <path d="M9.1 6.995a.905.905 0 111.8 0l-.35 3.507a.553.553 0 01-1.1 0L9.1 6.995z"></path>
                </svg>
            </div>
        </div>
        <div class='content'>
          <p>这是这条note 的内容  content</p>
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
export default {
    
}
</script>
<style scoped>
    .penBtu{
      /* float:right; */
      /* width: 50px;
        height: 50px;
        background: blue; */
        position: absolute;
        right: 35px;
        bottom: 35px;
    }
    .bi {
      font-size: 400%;
    }
    .bi-check{
      float :left;
      display: none;
      /* right: 2; */
      /* position:absolute; */
    }
    .bi-chevron-left{
      float:left;
    }
    .funArea{
        text-align: right;
        width: 100%;
        height: 25%;
        padding-right : 10px;

        /* border : solid 1px darkblue; */

    }
    .titleArea{
        width: 100%;
        height: 40%;
        /* border : solid 1px darkorchid; */

    }
    .titleArea  h1 {
      margin-top : 12px;
      padding-left: 10px; 
    }
    .describeArea{
        width: 100%;
        height: 25%;
        /* border : solid 1px slategrey; */
        text-align: right;
        padding-right : 30px;
    }
    .header {
        height: 20%;
        width: 100%;
        /* background-color: red; */
        border-bottom : solid 1px darkblue;
        position :absolute;
        /* padding :4px; */
        
    }
    .content{
        height: 75%;
        width: 100%;
        padding : 4px;
        /* background-color: rgb(94, 86, 73); */
        /* border : solid 1px darkgoldenrod; */
        position :absolute;
        bottom: 0;

    }
</style>
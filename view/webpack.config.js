//webpack  配置文件 
//指定 入口 entry 和出口 output

//操作路径 引入包 path
const  path   =  require('path')
//
const  webpack=  require('webpack')

//安装 htlm-webpck-plugin 插件实现html文件热部署  生成内存中提高修改查看效率
//当使用 htlm-webpack-plugin 插件后 不用手动的处理bundle.js引用 插件会自动在html下方生成一条
const  htmlWebpackPlugin = require('html-webpack-plugin')

//vue .vue项目执行不能加载
const  vueLoaderPlugin   = require('vue-loader/lib/plugin')

module.exports = {

    entry   : path.join(__dirname,'./src/main.js'),

    output  : {
        path :path.join(__dirname,'./dist'),
        filename : 'bundle.js'
    },

    devServer : {
        open : true, //自动打开浏览器   
        port : 3000,    //指定端口
        contentBase : 'src', //指定默认目录
        hot  : true, //  打开热部署  免刷新
        host : '192.168.2.104',
        // proxy: {
        //   '/api': {
        //     target: 'http://127.0.0.1:8080/',
        //     pathRewrite: {'^/api' : ''},
        //     changeOrigin: true,     // target是域名的话，需要这个参数，
        //     secure: false,          // 设置支持https协议的代理
        //   },
     },

     plugins : [ //配置插件节点
        new htmlWebpackPlugin ({
            template : path.join(__dirname,'./src/index.html'),
            filename : 'index.html'
        }),
        new vueLoaderPlugin(),
        //关于字体他
        // new ExtractTextPlugin({
        //   filename: utils.assetsPath('../[name].[contenthash].css'),
        //   allChunks: true,
        // }),
     ],

     module : { //配置所有第三方模块加载器
         rules : [//所有第三方模块的匹配规则
             {
                 test : /\.css$/,
                 use  : [
                     { loader : 'style-loader'},
                     {
                        loader : 'css-loader',
                        options: {
                            // modules : true
                        }
                     }
                 ]
             },
             
             {
                test: /\.less$/,
                use: [{
                    loader: "style-loader" // creates style nodes from JS strings
                }, {
                    loader: "css-loader" // translates CSS into CommonJS
                }, {
                    loader: "less-loader" // compiles Less to CSS
                }]
             },
             {
                test: /\.(png|jpg|gif)$/,
                use: [
                  {
                    loader: 'url-loader',
                    options: {
                      limit: 8192, // 当图片大小  大于这个会被生成base64流输出
                      name : '[path][name].[ext]',//图片路径不随机生成hash 默认hash.ext 
                    }
                  }
                ]
              },
              {
                test: /\.scss$/,
                use: [{
                    loader: "style-loader" // 将 JS 字符串生成为 style 节点
                }, {
                    loader: "css-loader" // 将 CSS 转化成 CommonJS 模块
                }, {
                    loader: "sass-loader" // 将 Sass 编译成 CSS
                }]
              },
              {//处理字体
                test: /\.(ttf|eot|svg|woff|woff2)$/,
                use: [
                  {
                    loader: 'url-loader',
                    options: {
                      limit: 8192, // 当图片大小  大于这个会被生成base64流输出
                      name : '[path][name].[ext]',//图片路径不随机生成hash 默认hash.ext 
                    }
                  }
                ]
              },
              //处理.vue 文件 webpack 不识别vue文件  开始组件化变成
              {
                test : /\.vue$/ ,
                use  : ['vue-loader']
              }
         ]
     },
     resolve : {
        alias: {
            'vue$' : "vue/dist/vue.js"
        }
     }
     

}
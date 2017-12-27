<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>品客</title>
    <style>
        @import "css/homepageCSS/style.css";
        @import "css/homepageCSS/header.css";
        @import "css/homepageCSS/section.css";
        @import "css/homepageCSS/blank.css";
        @import "css/homepageCSS/hot.css";
        @import "css/homepageCSS/new.css";
        @import "css/homepageCSS/footer.css";
    </style>
</head>
<body>
    <div class="backImg"></div>
    <div class="box">
        <!--背景图片部分-->


        <!--banner部分-->
        <div class="banner">

            <!--header-->
            <!-- header -->
            <div class="header">
                <!--弹出菜单-->
                <div class="menu left">
                    <!--左边按钮-->
                    <div class="open left">
                        <div class="bar1"></div>
                        <div class="bar2"></div>
                    </div>

                    <!--中间菜单内容-->
                    <ul class="menuList left">
                        <li><a href="index.jsp" class="active"> 首页</a></li>
                        <li><a href="topic_blogList.jsp"> 发现</a></li>
                        <li><a href="topicList.jsp">话题</a></li>
                        <li><a href="topic_blogList.jsp">专栏</a></li>
                        <li><a href="topicList.jsp">圆桌</a></li>
                    </ul>

                    <!--右边内容-->
                    <div class="close right"></div>
                </div>

                <!--调整大小-->
                <div  class="log right logAdjust2"><a href="contact.html"></a></div>
                <div  class="log right logAdjust1"><a href="contact.html"></a></div>

                <!--网站名字 登陆注册-->
                <div class="logoName adjustName"><span>品客</span></div>
                <div class="logoName" id="logIn"><a href="login.jsp">登录</a></div>
                <div class="logoName" id="regist"><a href="login.jsp">注册</a></div>

            </div>
            <!--Section-->
            <div class="section">

                <!--左右翻页-->
                <div id="bannerBox"><!-- 最外层部分 -->
                    <div id="banner"><!-- 轮播部分 -->
                        <ul class="imgList"><!-- 图片部分 -->
                            <li><a href="topic_blogList.jsp"><img src="images/homepageImages/1.jpg" alt="puss in boots1"></a></li>
                            <li><a href="topic_blogList.jsp"><img src="images/homepageImages/2.jpg" alt="puss in boots2"></a></li>
                            <li><a href="topic_blogList.jsp"><img src="images/homepageImages/3.jpg" alt="puss in boots3"></a></li>
                            <li><a href="topic_blogList.jsp"><img src="images/homepageImages/4.jpg" alt="puss in boots4"></a></li>
                            <li><a href="topic_blogList.jsp"><img src="images/homepageImages/5.jpg" alt="puss in boots5"></a></li>
                        </ul>
                        <!--前后按钮-->
                        <img src="images/homepageImages/arrowLeft.png" width="33px" height="68px" id="prev">
                        <img src="images/homepageImages/arrowRight.png" width="33px" height="68px" id="next">

                        <ul class="infoList"><!-- 图片中间文字信息部分 -->
                            <li class="infoOn">
                               <a href="topic_blogList.jsp">
                                   <div class="bannerTitile">标题1</div>
                                   <div class="bannerSection">文字描述文字描述文字描述文字描述文字描述<br>
                                       文字描述文字描述文字描述文字描述文字描述<br>文字描述文字描述文字描述文字描述文字描述<br>
                                       文字描述文字描述文字描述文字描述文字描述<br>文字描述文字描述文字描述文字描述文字描述<br>
                                       文字描述文字描述文字描述文字描述文字描述<br>文字描述文字描述文字描述文字描述文字描述<br>
                                   </div>
                               </a>
                            </li>
                            <li>
                                <a href="topic_blogList.jsp">
                                    <div class="bannerTitile">标题2</div>
                                    <div class="bannerSection">文字描述文字描述文字描述文字描述文字描述<br>
                                        文字描述文字描述文字描述文字描述文字描述<br>文字描述文字描述文字描述文字描述文字描述<br>
                                        文字描述文字描述文字描述文字描述文字描述<br>文字描述文字描述文字描述文字描述文字描述<br>
                                        文字描述文字描述文字描述文字描述文字描述<br>文字描述文字描述文字描述文字描述文字描述<br>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="topic_blogList.jsp">
                                    <div class="bannerTitile">标题3</div>
                                    <div class="bannerSection">文字描述文字描述文字描述文字描述文字描述<br>
                                        文字描述文字描述文字描述文字描述文字描述<br>文字描述文字描述文字描述文字描述文字描述<br>
                                        文字描述文字描述文字描述文字描述文字描述<br>文字描述文字描述文字描述文字描述文字描述<br>
                                        文字描述文字描述文字描述文字描述文字描述<br>文字描述文字描述文字描述文字描述文字描述<br>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="topic_blogList.jsp">
                                    <div class="bannerTitile">标题4</div>
                                    <div class="bannerSection">文字描述文字描述文字描述文字描述文字描述<br>
                                        文字描述文字描述文字描述文字描述文字描述<br>文字描述文字描述文字描述文字描述文字描述<br>
                                        文字描述文字描述文字描述文字描述文字描述<br>文字描述文字描述文字描述文字描述文字描述<br>
                                        文字描述文字描述文字描述文字描述文字描述<br>文字描述文字描述文字描述文字描述文字描述<br>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="topic_blogList.jsp">
                                    <div class="bannerTitile">标题5</div>
                                    <div class="bannerSection">文字描述文字描述文字描述文字描述文字描述<br>
                                        文字描述文字描述文字描述文字描述文字描述<br>文字描述文字描述文字描述文字描述文字描述<br>
                                        文字描述文字描述文字描述文字描述文字描述<br>文字描述文字描述文字描述文字描述文字描述<br>
                                        文字描述文字描述文字描述文字描述文字描述<br>文字描述文字描述文字描述文字描述文字描述<br>
                                    </div>
                                </a>
                            </li>
                        </ul>
                        <ul class="indexList"><!-- 滚动球 -->
                            <li class="indexOn"></li>
                            <li></li>
                            <li></li>
                            <li></li>
                            <li></li>
                        </ul>
                    </div>
                </div>



            </div>
        </div>

        <!--透明栏部分-->
        <div class="middle">
            <div class="blankLeft left">

                <ul>
                    <li>
                        <div class="sortImg"><img src="images/homepageImages/s1.jpg" style="width: 80px;height: 80px"></div>
                        <div class="sortTitle">1.运动</div>
                    </li>
                    <li>
                        <div class="sortImg"><img src="images/homepageImages/s2.jpg" style="width: 80px;height: 80px"></div>
                        <div class="sortTitle">2.游戏</div>
                    </li>
                    <li>
                        <div class="sortImg"><img src="images/homepageImages/s3.jpg" style="width: 80px;height: 80px"></div>
                        <div class="sortTitle">3.互联网</div>
                    </li>
                    <li>
                        <div class="sortImg"><img src="images/homepageImages/s4.jpg" style="width: 80px;height: 80px"></div>
                        <div class="sortTitle">4.艺术</div>
                    </li>
                    <li>
                        <div class="sortImg"><img src="images/homepageImages/s5.jpg" style="width: 80px;height: 80px"></div>
                        <div class="sortTitle">5.美食</div>
                    </li>
                    <li>
                        <div class="sortImg"><img src="images/homepageImages/s6.jpg" style="width: 80px;height: 80px"></div>
                        <div class="sortTitle">6.动漫</div>
                    </li>
                    <li>
                        <div class="sortImg"><img src="images/homepageImages/s7.jpg" style="width: 80px;height: 80px"></div>
                        <div class="sortTitle">7.汽车</div>
                    </li>
                    <li>
                        <div class="sortImg"><img src="images/homepageImages/s8.jpg" style="width: 80px;height: 80px"></div>
                        <div class="sortTitle">8.生活</div>
                    </li>
                    <li>
                        <div class="sortImg"><img src="images/homepageImages/s9.jpg" style="width: 80px;height: 80px"></div>
                        <div class="sortTitle">9.教育</div>
                    </li>
                    <li>
                        <div class="sortImg"><img src="images/homepageImages/s10.jpg" style="width: 80px;height: 80px"></div>
                        <div class="sortTitle">10.摄影</div>
                    </li>
                    <li>
                        <div class="sortImg"><img src="images/homepageImages/s11.jpg" style="width: 80px;height: 80px"></div>
                        <div class="sortTitle">11.文化</div>
                    </li>
                    <li>
                        <div class="sortImg"><img src="images/homepageImages/s12.jpg" style="width: 80px;height: 80px"></div>
                        <div class="sortTitle">12.历史</div>
                    </li>
                    <li>
                        <div class="sortImg"><img src="images/homepageImages/s13.jpg" style="width: 80px;height: 80px"></div>
                        <div class="sortTitle">13.旅行</div>
                    </li>
                    <li>
                        <div class="sortImg"><img src="images/homepageImages/s14.jpg" style="width: 80px;height: 80px"></div>
                        <div class="sortTitle">14.经济</div>
                    </li>
                    <li>
                        <div class="sortImg"><img src="images/homepageImages/s15.jpg" style="width: 80px;height: 80px"></div>
                        <div class="sortTitle">15.音乐</div>
                    </li>
                </ul>
            </div>

            <div class="blankRight left">
                <div>
                    <img src="images/homepageImages/s1big.jpg" style="width: 366px;height: 300px">
                </div>
            </div>
        </div>

        <!--最热话题-->dfdfdcsdcsdcgv56t
        <div class="hot">
            <div class="hotTitle">
                <h1>近 期 最 热 话 题</h1>
            </div>
            <div class="hotSection">

                <div class="examples_body">
                    <div class="examples_bg">

                        <div class="mune_thumb">
                            <ul>
                                <li>
                                    <a href="images/homepageImages/hot1.jpg">
                                        <img src="images/homepageImages/h1.jpg" alt="Image Name" style="width:110px;height: 110px" /></a>
                                    <div class="block left">
                                        <h4 class="title02">小图1</h4>
                                        <small>小图时间</small>
                                        <div class="desc">
                                            简短描述<br> 简短描述
                                        </div>
                                        <p>容内容内容内容内容内容内<br><br><br>容内容内容内容内容内容
                                            内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容
                                            内容内容内容内容内容内容内容内容内容内容</p>
                                    </div>
                                </li>

                                <li>
                                    <a href="images/homepageImages/hot2.jpg">
                                        <img src="images/homepageImages/h2.jpg" alt="Image Name" style="width:110px;height: 110px" /></a>
                                    <div class="block left">
                                        <h4 class="title02">小图2</h4>
                                        <small>小图时间</small>
                                        <div class="desc">
                                            简短描述<br> 简短描述
                                        </div>
                                        <p>容内容内容内容内容内容内容内容内容内容内容内容
                                            内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容
                                            内容内容内容内容内容内容内容内容内容内容</p>
                                    </div>
                                </li>

                                <li>
                                    <a href="images/homepageImages/hot3.jpg">
                                        <img src="images/homepageImages/h3.jpg" alt="Image Name" style="width:110px;height: 110px"  /></a>
                                    <div class="block left">
                                        <h4 class="title03">小图3</h4>
                                        <small>小图时间</small>
                                        <div class="desc">
                                            简短描述<br> 简短描述
                                        </div>
                                        <p>容内容内容内容内容内容内容内容内容内容内容内容
                                            内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容
                                            内容内容内容内容内容内容内容内容内容内容。</p>
                                    </div>
                                </li>
                                <li>
                                    <a href="images/homepageImages/hot4.jpg">
                                        <img src="images/homepageImages/h4.jpg" alt="Image Name" style="width:110px;height: 110px"  /></a>
                                    <div class="block left">
                                        <h4 class="title04">小图4</h4>
                                        <small>小图时间</small>
                                        <div class="desc">
                                            简短描述<br> 简短描述
                                        </div>
                                        <p>容内容内容内容内容内容内容内容内容内容内容内容
                                            内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容
                                            内容内容内容内容内容内容内容内容内容内容</p>
                                    </div>
                                </li>
                            </ul>
                        </div>

                        <div class="examples_image">
                            <img src="images/homepageImages/hot1.jpg" alt="" />
                            <div class="desc">
                                <a href="#" class="collapse"></a>
                                <div class="block">
                                    <h4>大图</h4>
                                    <small>时间</small>
                                    <p>大图内容大图内容大图内容大图内容大图内容大图内容大图内容大图内容大图内容
                                        大图内容大图内容大图内容大图内容大图内容</p>
                                </div>
                            </div>
                        </div>

                    </div>

                </div>

            </div>
        </div>

        <!--最新话题-->
        <div class="new">
            <div class="newTitle">
                <h1>近 期 最 新 话 题</h1>
            </div>
            <div class="newSection">
                <ul>
                    <li>
                        <a href="#">
                            <div><img src="images/homepageImages/new1.jpg" style="width: 390px;height: 250px" class="newImg"></div>
                            <div class="newText">标题<br>文字叙述文字叙述</div>
                            <div class="newTextBg"></div>
                        </a>
                    </li>

                    <li>
                        <a href="#">
                            <div><img src="images/homepageImages/new2.jpg" style="width: 390px;height: 250px" class="newImg"></div>
                            <div class="newText">标题<br>文字叙述文字叙述</div>
                            <div class="newTextBg"></div>
                        </a>
                    </li>

                    <li>
                        <a href="#">
                            <div><img src="images/homepageImages/new3.jpg" style="width: 390px;height: 250px" class="newImg"></div>
                            <div class="newText">标题<br>文字叙述文字叙述</div>
                            <div class="newTextBg"></div>
                        </a>
                    </li>

                    <li>
                        <a href="#">
                            <div><img src="images/homepageImages/new4.jpg" style="width: 390px;height: 250px" class="newImg"></div>
                            <div class="newText">标题<br>文字叙述文字叙述</div>
                            <div class="newTextBg"></div>
                        </a>
                    </li>

                    <li>
                        <a href="#">
                            <div><img src="images/homepageImages/new5.jpg" style="width: 390px;height: 250px" class="newImg"></div>
                            <div class="newText">标题<br>文字叙述文字叙述</div>
                            <div class="newTextBg"></div>
                        </a>
                    </li>

                    <li>
                        <a href="#">
                            <div><img src="images/homepageImages/new6.jpg" style="width: 390px;height: 250px" class="newImg"></div>
                            <div class="newText">标题<br>文字叙述文字叙述</div>
                            <div class="newTextBg"></div>
                        </a>
                    </li>

                </ul>
            </div>

        </div>

        <!--页脚部分-->
        <div class="foot">
            <div class="footLeft left">
                <br><h2>联系我们</h2>
                <img src="images/homepageImages/电话.png" style="width: 20px;height:20px;margin-right: 10px;" >
                XXX-XXX-XXXX<br>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;南京市雨花台区小行路16号
            </div>

            <div class="footMiddle left">
                   <br><h2>关注我们</h2>
                <img class="contact1" src="images/homepageImages/qq.png" style="width: 30px;height: 30px;margin-right: 30px;" >
                <img class="contact2" src="images/homepageImages/微信.png" style="width: 35px;height: 28px;margin-right: 20px;" >
                <img class="contact3" src="images/homepageImages/微博.png" style="width: 43px;height: 33px;" >

            </div>

            <div class="footRight left">
                <br><h2>合作网站</h2>
                <a href="https://www.zhihu.com/">知乎</a>&nbsp;&nbsp;&nbsp;
                <a href="https://www.baidu.com/">百度</a><br>
                <a href="https://www.wikipedia.org/">维基百科</a><br>
            </div>

            <div class="code left">
                <img src="images/homepageImages/二维码.png" id="code1">
                <img src="images/homepageImages/二维码.png" id="code2">
                <img src="images/homepageImages/二维码.png" id="code3">
                <div>
                    <ul>
                        <li><a href="#">首页</a></li>
                        <li><a href="#">发现</a></li>
                        <li><a href="#">品客话题</a></li>
                        <li><a href="#">品客专栏</a></li>
                        <li style="border: solid 1px black"><a href="#">品客圆桌</a></li>
                    </ul>
                </div>

            </div>

            <div class="footBottom left">
                Copyright &copy; 2017. Pinker NetWork All rights reserved.
            </div>
        </div>
    </div>

<!--jquery-->
<script src="js/jquery-1.7.2.js" type="text/javascript"></script>
<script type="text/javascript">

    $().ready(function () {
    /*---------展开导航条----------*/
        /*导航栏左边按钮*/
        $(".open").click(function () {
            $(".bar1").addClass("moveBar1");
            $(".bar2").addClass("moveBar2");
            $(".menu").css("width","1000px");
            $(".menuList").css("display","block");
            $(".logoName").css("display","none");

        });
        $(".close").click(function () {
            $(".bar1").removeClass("moveBar1");
            $(".bar2").removeClass("moveBar2");
            $(".menu").css("width","50px");
            $(".menuList").css("display","none");
            $(".logoName").css("display","block");
        });
        /*---------展开导航条----------*/

        /*---------二维码展开----------*/
        $(".contact1").mouseover(function () {
                $("#code1").css({ "display": "block"});
        })
        $(".contact2").mouseover(function () {
            $("#code2").css({ "display": "block"});
        })
        $(".contact3").mouseover(function () {
            $("#code3").css({ "display": "block"});
        })

        $(".contact1").mouseout(function () {
            $("#code1").css({ "display": "none"});
        })
        $(".contact2").mouseout(function () {
            $("#code2").css({ "display": "none"});
        })
        $(".contact3").mouseout(function () {
            $("#code3").css({ "display": "none"});
        })
        /*---------二维码展开----------*/




        /*---------点击切换大图----------*/
        $(".examples_image .desc").show();
        $(".examples_image .block").animate({ opacity: 0.85 }, 1 );

        //Click and Hover events for thumbnail list
        $(".mune_thumb ul li:first").addClass('active');
        $(".mune_thumb ul li").click(function(){
            //Set Variables
            var imgAlt = $(this).find('img').attr("alt");
            var imgTitle = $(this).find('a').attr("href");
            var imgDesc = $(this).find('.block').html();
            var imgDescHeight = $(".examples_image").find('.block').height();

            if ($(this).is(".active")) {
                return false;
            } else {
                //Animate
                $(".examples_image .block").animate({ opacity: 0, marginBottom: -imgDescHeight }, 250 , function() {
                    $(".examples_image .block").html(imgDesc).animate({ opacity: 0.85,	marginBottom: "0" }, 250 );
                    $(".examples_image img").attr({ src: imgTitle , alt: imgAlt});
                });
            }

            $(".mune_thumb ul li").removeClass('active');
            $(this).addClass('active');
            return false;

        }) .hover(function(){
            $(this).addClass('hover');
        }, function() {
            $(this).removeClass('hover');
        });

        $("a.collapse").click(function(){
            $(".examples_image .block").slideToggle();
            $("a.collapse").toggleClass("show");
        });
    })
</script>


<!--图片轮播js-->
    <script type="text/javascript" src="js/jquery-1.7.2.js"></script>
    <script type="text/javascript">
        var curIndex = 0, //当前index
            imgLen = $(".imgList li").length; //图片总数
        // 定时器自动变换2.5秒每次
        var autoChange = setInterval(function(){
            if(curIndex < imgLen-1){
                curIndex ++;
            }else{
                curIndex = 0;
            }
            //调用变换处理函数
            changeTo(curIndex);
        },2500);
        //左箭头滑入滑出事件处理
        $("#prev").hover(function(){
            //滑入清除定时器
            clearInterval(autoChange);
        },function(){
            //滑出则重置定时器
            autoChangeAgain();
        });
        //左箭头点击处理
        $("#prev").click(function(){
            //根据curIndex进行上一个图片处理
            curIndex = (curIndex > 0) ? (--curIndex) : (imgLen - 1);
            changeTo(curIndex);
        });
        //右箭头滑入滑出事件处理
        $("#next").hover(function(){
            //滑入清除定时器
            clearInterval(autoChange);
        },function(){
            //滑出则重置定时器
            autoChangeAgain();
        });
        //右箭头点击处理
        $("#next").click(function(){
            curIndex = (curIndex < imgLen - 1) ? (++curIndex) : 0;
            changeTo(curIndex);
        });
        //对右下角按钮index进行事件绑定处理等
        $(".indexList").find("li").each(function(item){
            $(this).hover(function(){
                clearInterval(autoChange);
                changeTo(item);
                curIndex = item;
            },function(){
                autoChangeAgain();
            });
        });
        //清除定时器时候的重置定时器--封装
        function autoChangeAgain(){
            autoChange = setInterval(function(){
                if(curIndex < imgLen-1){
                    curIndex ++;
                }else{
                    curIndex = 0;
                }
                //调用变换处理函数
                changeTo(curIndex);
            },4000);
        }
        function changeTo(num){
            var goLeft = num * 1366;
            $(".imgList").animate({left: "-" + goLeft + "px"},500);
            $(".infoList").find("li").removeClass("infoOn").eq(num).addClass("infoOn");
            $(".indexList").find("li").removeClass("indexOn").eq(num).addClass("indexOn");
        }
    </script>


</body>
</html>
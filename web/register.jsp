<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v3.8.6">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"/>
    <title>云学习</title>
    <style>
        body {
            padding-top: 50px;
            margin: 0px;
            padding: 0px;
            width: 100%;
            height: 100%;
        }

        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            -ms-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }

        #bg {
            position: fixed;
            width: 100%;
            height: 100%;
            z-index: -1;
        }

    </style>
    <link href="css/signin.css" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="http://www.clantrip.com/static/css/common.css" rel="stylesheet">
</head>
<body>
<img id='bg' src='img/beijing1.jpg'/>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header active">
            <a href="#" class="navbar-brand active"><strong>Cloud Learning</strong><small class="bottom">
                你的云学习网站</small></a>

        </div>
        <div id="navbar" class="collapse navbar-collapse navbar-right">
            <ul class="nav navbar-nav">
                <li class="nav-item"><a href="index.jsp" class="nav-link"><span class="glyphicon glyphicon-unchecked"
                                                                                aria-hidden="true"></span>主页</a></li>
                <li class="nav-item active"><a href="#" class="nav-link"><span class="glyphicon glyphicon-plus"
                                                                               aria-hidden="true"></span>注册</a></li>
                <li class="nav-item"><a href="login.jsp" class="nav-link"><span class="glyphicon glyphicon-log-in"
                                                                                    aria-hidden="true"></span> 登录</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container">
    <form action="RegisterServlet" class="form-horizontal img-rounded" style=" padding: 20px;" method="post">
        <div class="form-group">
            <label for="username" class="col-sm-2 control-label" style="color: white;font-size: 20px;">用户名</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="username" name="name" placeholder="用户名"
                       style="background-color: rgba(0,0,0,0.1);border-width: 0 0 2px 0;color: white;font-size: 20px; height:50px;">
            </div>
        </div>
        <div class="form-group">
            <label for="email" class="col-sm-2 control-label" style="color: white;font-size: 20px;">邮箱</label>
            <div class="col-sm-8">
                <input type="email" class="form-control" id="email" name="email" placeholder="电子邮箱"
                       style="background-color: rgba(0,0,0,0.1);border-width: 0 0 2px 0;color: white;font-size: 20px; height:50px;">
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-2 control-label" style="color: white;font-size: 20px;">密码</label>
            <div class="col-sm-8">
                <input type="password" class="form-control" id="password" name="password" placeholder="密码"
                       style="background-color: rgba(0,0,0,0.1);border-width: 0 0 2px 0;color: white;font-size: 20px; height:50px;">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <div class="checkbox">
                    <label style="color: white;font-size: 20px;">
                        <input type="checkbox"><strong>记住密码</strong>
                    </label>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <a href="https://account.aliyun.com/register/qr_register.htm?oauth_callback=https%3A%2F%2Fwww.aliyun.com%2F"
                   style="color: white;font-size: 20px;">还没有阿里云账号？点此跳转</a>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-lg btn-default">注册</button>
            </div>
        </div>
    </form>

</div>

<nav class="navbar navbar-inverse navbar-fixed-bottom" role="navigation">
    <div class="container">
        <div class="navbar-header active">
            <a href="#" class="navbar-brand active"><strong>Cloud Learning</strong><small class="bottom">
                你的云学习网站</small></a>
        </div>
        <div class="navbar-right ">
            <a href="#" class="navbar-brand">E-mail:cloudlearning@163.com</a>
        </div>
    </div>
</nav>

<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>
    (function (window, document, undefined) {
        var hearts = [];
        window.requestAnimationFrame = (function () {
            return window.requestAnimationFrame ||
                window.webkitRequestAnimationFrame ||
                window.mozRequestAnimationFrame ||
                window.oRequestAnimationFrame ||
                window.msRequestAnimationFrame ||
                function (callback) {
                    setTimeout(callback, 1000 / 60);
                }
        })();
        init();

        function init() {
            css(".heart{width: 10px;height: 10px;position: fixed;background: #f00;transform: rotate(45deg);-webkit-transform: rotate(45deg);-moz-transform: rotate(45deg);}.heart:after,.heart:before{content: '';width: inherit;height: inherit;background: inherit;border-radius: 50%;-webkit-border-radius: 50%;-moz-border-radius: 50%;position: absolute;}.heart:after{top: -5px;}.heart:before{left: -5px;}");
            attachEvent();
            gameloop();
        }

        function gameloop() {
            for (var i = 0; i < hearts.length; i++) {
                if (hearts[i].alpha <= 0) {
                    document.body.removeChild(hearts[i].el);
                    hearts.splice(i, 1);
                    continue;
                }
                hearts[i].y--;
                hearts[i].scale += 0.004;
                hearts[i].alpha -= 0.013;
                hearts[i].el.style.cssText = "left:" + hearts[i].x + "px;top:" + hearts[i].y + "px;opacity:" + hearts[i].alpha + ";transform:scale(" + hearts[i].scale + "," + hearts[i].scale + ") rotate(45deg);background:" + hearts[i].color;
            }
            requestAnimationFrame(gameloop);
        }

        function attachEvent() {
            var old = typeof window.οnclick === "function" && window.onclick;
            window.onclick = function (event) {
                old && old();
                createHeart(event);
            }
        }

        function createHeart(event) {
            var d = document.createElement("div");
            d.className = "heart";
            hearts.push({
                el: d,
                x: event.clientX - 5,
                y: event.clientY - 5,
                scale: 1,
                alpha: 1,
                color: randomColor()
            });
            document.body.appendChild(d);
        }

        function css(css) {
            var style = document.createElement("style");
            style.type = "text/css";
            try {
                style.appendChild(document.createTextNode(css));
            } catch (ex) {
                style.styleSheet.cssText = css;
            }
            document.getElementsByTagName('head')[0].appendChild(style);
        }

        function randomColor() {
            return "rgb(" + (~~(Math.random() * 255)) + "," + (~~(Math.random() * 255)) + "," + (~~(Math.random() * 255)) + ")";
        }
    })(window, document);
</script>
</body>
</html>
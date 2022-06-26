<%--
  Created by IntelliJ IDEA.
  User: pana
  Date: 2022/06/16
  Time: 23:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>


<head>
    <meta http-equiv="content-type" content="text/html;charset=utf-8">

    <meta charset="utf-8">
    <title></title>
    <link href="../jsp/static/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="../jsp/static/css/font-awesome.min.css" type="text/javascript" rel="stylesheet">
    <link href="../jsp/static/css/css.css" type="text/css" rel="stylesheet">
    <link href="../jsp/static/css/normalize.css" type="text/css" rel="stylesheet">
    <link href="../jsp/static/css/new_file.css" rel="stylesheet" type="text/css" />
</head>

<body style="">
<meta http-equiv="content-type" content="text/html;charset=utf-8">

<meta charset="utf-8">

<meta name="description" content="">
<meta name="viewport" content="width=device-width">
<link rel="stylesheet" href="../jsp/static/css/grid.css">
<link rel="stylesheet" href="../jsp/static/css/style.css">
<link rel="stylesheet" href="../jsp/static/css/normalize.css">
<style>
    .right_fbox {
        width: 50px;
        height: 50px;
        position: fixed;
        float: right;
        left: 92%;
        top: 30%;
        z-index: 999;
        background-color: rgb(200, 100, 100);
    }

    .btn {
        float: right;
        width: 400px;
        padding: 1px;
    }

    #login-box {
        width: 100%;
        height: auto;
        margin: 0 auto;
        margin-top: 5%;
        text-align: center;
        border: 2px solid #EEF0F5;
        padding: 28px 40px;
    }
</style>
<div id="top">
    <div class="container_12">
        <div class="grid_9">
            <nav>
                <ul>
                    <li>
                        <a href=" ">登録</a>
                    </li>
                    <li>
                        <a href=" ">ログイン</a>
                    </li>
                    <li>
                        <a href=" ">ログアウト</a>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</div>

<header>
    <div class="container_12">
        <div class="grid_9" style="border:0px solid red;width: 98%">
            <div class="top_header">
                <div class="welcome">
                    <a href="" style="font-size: 24px;text-decoration:none;">求職　求人システム</a>.
                </div>
            </div>
            <nav class="primary">
                <ul>
                    <li>
                        <a href="">トップページ</a>
                    </li>
                    <li>
                        <a href="">求職情報</a>
                    </li>
                    <li>
                        <a href="">求人情報</a>
                    </li>
                    <li>
                        <a href="">求人広告掲載</a>
                    </li>
                    <li>
                        <a href="">履歴書を作成</a>
                    </li>
                </ul>
            </nav>
        </div>
        <br />

        <div id="login-box" style="float: left;">
            <div style="font-size: 20PX; color: blue;">
                <h3>ログインしてください</h3>
                <br />
            </div>
            <div class="form">
                <div class="item">

                    <b style="font-size: 20px;">ユーザー名:</b> <input type="text" placeholder="ユーザー">
                </div>
                <br />
                <div class="item">

                    <b style="font-size: 20px;">パスワード:</b> <input type="text" placeholder="パスワード">
                </div>
                <br />
            </div>

            <div class="btn">
                <button style="width: 100px; float: left;">Login</button>
                <div style="width: 10px; float: left; padding: 10px;"></div>
                <button style="width: 100px; ">新規登録</button>
            </div>

        </div>
    </div>
</header>
</body>

</html>

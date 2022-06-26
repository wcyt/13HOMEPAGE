<%--
  Created by IntelliJ IDEA.
  User: pana
  Date: 2022/06/18
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta http-equiv="content-type" content="text/html;charset=utf-8">

    <meta charset="utf-8">
    <title></title>
    <link href="css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="css/font-awesome.min.css" type="text/javascript" rel="stylesheet">
    <link href="css/css.css" type="text/css" rel="stylesheet">
    <link href="css/normalize.css" type="text/css" rel="stylesheet">
    <link href="css/new_file.css" rel="stylesheet" type="text/css" />
</head>

<body id="zozotown">
<meta http-equiv="content-type" content="text/html;charset=utf-8">

<meta charset="utf-8">

<meta name="description" content="">
<meta name="viewport" content="width=device-width">
<link rel="stylesheet" href="css/grid.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/normalize.css">
<link rel="stylesheet" href="css/general.css" />
<link rel="stylesheet" href="css/s.css" />
<link rel="stylesheet" href="css/regist.css" />
<link rel="stylesheet" href="css/common.css" />
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

    .rg_layout {
        width: 900px;
        height: 400px;
        border: none;
        /*solid 定义实线*/
        background-color: white;
        margin: 20px 1px 2px 3px;
        padding: 30px 10px 20px 200px;
    }

    .rg_left {
        float: inherit;
        margin: 15px;
    }

    .rg_left>p:first-child {
        color: #FFD026;
        font-size: 20px;
    }

    .rg_left>p:last-child {
        color: #A6A6A6;
        font-size: 20px;
    }

    .rg_center {
        float: left;
    }

    .rg_right {
        float: right;
        margin: 15px;
        padding-left: 50px;
    }

    .rg_right p {
        font-size: 15px;
    }

    .rg_right p a {
        color: coral;
    }

    .td_left {
        width: 100px;
        text-align: right;
        height: 45px;
    }

    .td_right {
        padding-left: 50px;
    }

    #username,
    #password,
    #email,
    #name,
    #tel,
    #birthday,
    #checkcode {
        width: 251px;
        height: 32px;
        border: 1px solid #A6A6A6;
        /*设置边框圆角*/
        border-radius: 5px;
        padding-left: 10px;
    }

    #checkcode {
        width: 110px;
    }

    #img_check {
        height: 32px;
        vertical-align: middle;
        /*设置图片的位置垂直居中*/
    }

    #btn_sub {
        width: 100px;
        height: 40px;
        background-color: #FFD026;
        border: 1px solid #FFD026;
        padding-left: 10px;
    }

    .sectionInner {
        background: #f0f0f0;
        padding: 36px 48px 40px 48px;
        border: 1px solid #dcdcdc;
        border-radius: 4px;
    }

    .btn2 {
        width: 190px;
        padding: 20px;
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

        <div class="rg_layout">

            <div class="sectionInner">
                <div class="sectionHeader">
                    <h2><b>新規登録</b></h2>
                    <!-- /.sectionHeader -->
                </div>
                <div class="">
                    <form id="" name="" action="registconf.html" method="post" class="decorateForm">
                        <input type="hidden" name="c" value="MemberInput1">
                        <table>
                            <tbody>
                            <tr id="secSexType">
                                <th>類別</th>
                                <td class="sexTypeFrm">
                                    <div style="height: 40px; font-size: 10px;">
                                        &nbsp;<input type="radio" name="shinbunn" value="1" />&nbsp;個人&nbsp;
                                        <input type="radio" name="shinbunn" value="2" />&nbsp;企業&nbsp;
                                    </div>

                                </td>
                            </tr>

                            <tr id="secMailAdd">
                                <th>メールアドレス<br><span class="str">必須</span></th>

                                <td class="mailFrm">
                                    <div class="main clearfix">
                                        <input type="text" name="Email" value="" class="adress" placeholder="例 : 12345566@123.jp" autocomplete="email" data-email-input-form="">
                                    </div>
                                </td>

                            </tr>
                            <tr id="secMailAdd">
                                <th>ユーザー名<br><span class="str">必須</span></th>

                                <td class="mailFrm">
                                    <div class="main clearfix">
                                        <input type="text" name="Email" value="" class="adress" placeholder="" autocomplete="email" data-email-input-form="">
                                    </div>
                                </td>

                            </tr>
                            <tr id="secPassword">
                                <th>パスワード<span class="str">必須</span></th>
                                <td class="passFrm">
                                    <div class="main passwordInputWithIcon nonTarget" data-password-input-with-icon="">
                                        <input type="password" id="login_password1" name="Password" value="" size="16" maxlength="12" data-password-type="new">
                                    </div>
                                    <ul class="m-password-validation-list" data-password-validation-list="" aria-hidden="true">
                                        <li class="m-password-validation-list-item">
                                            8～12文字
                                        </li>
                                    </ul>
                                </td>
                            </tr>
                            <tr id="secPassword">
                                <th>確認パスワード<span class="str">必須</span></th>
                                <td class="passFrm">
                                    <div class="main passwordInputWithIcon nonTarget" data-password-input-with-icon="">
                                        <input type="password" id="login_password1" name="Password" value="" size="16" maxlength="12" data-password-type="new">
                                    </div>
                                    <ul class="m-password-validation-list" data-password-validation-list="" aria-hidden="true">
                                        <li class="m-password-validation-list-item">
                                            8～12文字
                                        </li>
                                    </ul>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                        <p class="btn"><input type="submit" value="登録する"></p>
                        <p>&nbsp;</p>

                    </form>
                    <!--/.contBody -->

                </div>
                <!-- /.sectionInner -->

            </div>
            <div id="note" class="zozoid">
                <p>&nbsp;</p>
                <!-- /#note -->
            </div>
        </div>
    </div>

</header>
</body>

</html>

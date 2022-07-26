<%--
  Created by IntelliJ IDEA.
  User: pana
  Date: 2022/06/18
  Time: 20:22
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
</head>

<body style="">
<meta http-equiv="content-type" content="text/html;charset=utf-8">

<meta charset="utf-8">

<meta name="description" content="">
<meta name="viewport" content="width=device-width">
<link rel="stylesheet" href="css/grid.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/normalize.css">
<style>
    table,tbody {
        display: block;
        height: 305px;
        border: 0;

    }

    tbody {
        overflow-y: scroll;
    }

    table thead,
    tbody tr {
        display: table;
        width: 100%;
        table-layout: fixed;
    }
    table thead {
        width: calc(100% - 1em)
    }

    table thead th {
        background: #84acde;
        width: 20%;
        text-align: center;
    }
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

    .icl-TextInput {
        border: 1px solid #949494;
        border-radius: .5rem;
        display: -ms-flexbox;
        display: flex;
        align-items: center;
        padding: .75rem 1rem;
    }

    .yosegi-InlineWhatWhere-primaryButton {
        float: right;
        font-size: .875rem;
        width: 100PX;
    }

    .jobsearch-Content {
        margin-top: 100PX;
    }

    .icl-TextInput-wrapper {
        width: 100PX;
        box-sizing: border-box;
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
                    <li class="curent">
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
        <br />
        <br />
        <br />
        <table class="jobCard_mainContent" cellpadding="0" cellspacing="0" role="presentation">
            <thead>
            <tr style="background-color: #ADADAD;">
                <th>　</th>
                <th>番号</th>
                <th>会社名</th>
                <th>職種</th>
                <th>給与</th>
                <th>勤務地　　</th>
                <th>電話番号　　</th>
                <th>メールアドレス</th>
                <th>その他</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="checkbox" name="" value=""></td>
                <td>1</td>
                <td>XXX株式会社</td>
                <td>JAVA開発</td>
                <td>17Ｋ~20K</td>
                <td>東京</td>
                <td>1234343</td>
                <td>1232@11.jp</td>
                <td>ASDASDAS</td>
            </tr>
            <tr>
                <td><input type="checkbox" name="" value=""></td>
                <td>1</td>
                <td>XXX株式会社</td>
                <td>JAVA開発</td>
                <td>17Ｋ~20K</td>
                <td>東京</td>
                <td>1234343</td>
                <td>1232@11.jp</td>
                <td>ASDASDAS</td>
            </tr>
            <tr>
                <td><input type="checkbox" name="" value=""></td>
                <td>1</td>
                <td>XXX株式会社</td>
                <td>JAVA開発</td>
                <td>17Ｋ~20K</td>
                <td>東京</td>
                <td>1234343</td>
                <td>1232@11.jp</td>
                <td>ASDASDAS</td>
            </tr>
            <tr>
                <td><input type="checkbox" name="" value=""></td>
                <td>1</td>
                <td>XXX株式会社</td>
                <td>JAVA開発</td>
                <td>17Ｋ~20K</td>
                <td>東京</td>
                <td>1234343</td>
                <td>1232@11.jp</td>
                <td>ASDASDAS</td>
            </tr>
            <tr>
                <td><input type="checkbox" name="" value=""></td>
                <td>1</td>
                <td>XXX株式会社</td>
                <td>JAVA開発</td>
                <td>17Ｋ~20K</td>
                <td>東京</td>
                <td>1234343</td>
                <td>1232@11.jp</td>
                <td>ASDASsssssssssDAS</td>
            </tr>
            <tr>
                <td><input type="checkbox" name="" value=""></td>
                <td>1</td>
                <td>XXX株式会社</td>
                <td>JAVA開発</td>
                <td>17Ｋ~20K</td>
                <td>東京</td>
                <td>1234343</td>
                <td>1232@11.jp</td>
                <td>ASDASDAS</td>
            </tr>
            </tbody>
        </table>
        <br /><br /><br />
        <div　style="background: chartreuse;">
        <span style="margin-left: 800PX; ">
						<input type="button" value="変更" style="width: 80PX; height: 20PX; background-color: #E0E0E0;"/>
					</span>

        <span>
						<input type="button" value="削除"  style="width: 80PX; height: 20PX; background-color: #E0E0E0; />
					</span>
			</div>
			<section id="main">
				<div class="container_12" align="center">

					<div class="pagination">
						<ul>
							<li class="prev">総数：6 &nbsp;&nbsp;&nbsp;&nbsp;第1/1頁&nbsp;&nbsp;&nbsp;&nbsp;
							</li>

							<li class="" style="border-right: 1px solid #E0E0E0">
								<a href="" style="font-family: 楷体;">
									<< </a>&nbsp;&nbsp;
							</li>

							<li style="border-right: 1px solid #E0E0E0">

								<a href="javascrip:void(0)" style="font-family: 楷体;">
									< </a>&nbsp;&nbsp;&nbsp;

							</li>

							<li style="border-right: 1px solid #E0E0E0">

								<a href="javascrip:void(0)" style="font-family: 楷体;"> > </a>&nbsp;&nbsp;&nbsp;

							</li>
							<li class="" style="border-right: 1px solid #E0E0E0">
								<a href="" style="font-family: 楷体;"> >> </a>&nbsp;&nbsp;
							</li>

						</ul>
					</div>

				</div>

            </section>
</header>
</body>

</html>

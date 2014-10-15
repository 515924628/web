<%--
  Created by IntelliJ IDEA.
  User: zpy
  Date: 14/10/15
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>货物入库</title>
    <link href="wuliu_back.css" type="text/css" rel="alternate">
</head>
<body>
<form name="ruku" action="ruku.action">
    <center>
        <table>
            <tr>
                <td>货主</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>货物名称</td>
                <td><input type="text" name="huoming"></td>
            </tr>
            <tr>
                <td>规格</td>
                <td><input type="text" name="guige"></td>
            </tr>
            <tr>
                <td>货物等级</td>
                <td><input type="text" name="dengji"></td>
            </tr>
            <tr>
                <td>接收数量</td>
                <td><input type="text" name="jieshoushuliang"></td>
            </tr>
            <tr>
                <td>破损数量</td>
                <td><input type="text" name="posunshuliang"></td>
            </tr>
            <tr>
                <td>搁置数量</td>
                <td><input type="text" name="gezhishuliang"></td>
            </tr>
            <tr>
                <td>货物重量</td>
                <td><input type="text" name="zhongliang"></td>
            </tr>
            <tr>
                <td>货物体积</td>
                <td><input type="text" name="tiji"></td>
            </tr>
            <tr>
                <td>生产日期</td>
                <td><input type="text" name="shengchanriqi"></td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"></td>
            </tr>

        </table>
    </center>
</form>
</body>
</html>

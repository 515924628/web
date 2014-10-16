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
    <table>
        <tr>
            <td><label for="name">货主</label></td>
            <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <td><label for="huoming">货物名称</label></td>
            <td><input type="text" name="huoming" id="huoming"></td>
        </tr>
        <tr>
            <td><label for="guige">规格</label></td>
            <td><input type="text" name="guige" id="guige"></td>
        </tr>
        <tr>
            <td><label for="dengji">货物等级</label></td>
            <td><input type="text" name="dengji" id="dengji"></td>
        </tr>
        <tr>
            <td><label for="jieshoushuliang">接收数量</label></td>
            <td><input type="text" name="jieshoushuliang" id="jieshoushuliang"></td>
        </tr>
        <tr>
            <td><label for="posunshuliang">破损数量</label></td>
            <td><input type="text" name="posunshuliang" id="posunshuliang"></td>
        </tr>
        <tr>
            <td><label for="gezhishuliang">搁置数量</label></td>
            <td><input type="text" name="gezhishuliang" id="gezhishuliang"></td>
        </tr>
        <tr>
            <td><label for="zhongliang">货物重量</label></td>
            <td><input type="text" name="zhongliang" id="zhongliang"></td>
        </tr>
        <tr>
            <td><label for="tiji">货物体积</label></td>
            <td><input type="text" name="tiji" id="tiji"></td>
        </tr>
        <tr>
            <td><label for="shengchanriqi">生产日期</label></td>
            <td><input type="text" name="shengchanriqi" id="shengchanriqi"></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>

    </table>
</form>
</body>
</html>

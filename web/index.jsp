<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <form  method="post" action="user33_register.action">
  <p style="color:red;">
    ${null==requestScope.msg?"":requestScope.msg}
  </p>
  <table>
        <tr><td>�û�����
        </td><td><input type="text" name="name" /></td>
        </tr>
        <tr><td>���룺
        </td><td><input type="password" name="pwd" /></td>
        </tr> 
        <tr><td colspan="2"><input type="submit" value="��¼" /></td>
        </tr>
       </table>
  </form><br>
  </body>
</html>

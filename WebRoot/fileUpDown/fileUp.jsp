<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>文件上传</title>
    
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
  	<!-- enctype设置multipart/form-data,该属性用来设置浏览器采用二进制方式来处理表单数据,上传文件时需要使用该属性 -->
    <s:form action="upLoad" enctype="multipart/form-data">
    	<s:textfield name="title" label="文件标题"></s:textfield><br/>
    	<!-- struts2使用拦截器fileUpload显示国际化信息，这里不必使用key值 -->
    	<s:file name="upload" label="选择文件"></s:file><br/>
    	<s:submit value="上传"></s:submit>
    </s:form>
  </body>
</html>

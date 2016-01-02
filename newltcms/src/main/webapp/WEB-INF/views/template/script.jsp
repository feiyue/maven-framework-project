<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link type="text/css" rel="stylesheet"
	href="<c:url value='/css/bootstrap.min.css'></c:url>">
<link type="text/css" rel="stylesheet"
	href="<c:url value='/css/bootstrap-theme.min.css'></c:url>">
<link type="text/css" rel="stylesheet"
	href="<c:url value='/css/metisMenu.min.css'></c:url>">
<link type="text/css" rel="stylesheet"
	href="<c:url value='/css/prism.min.css'></c:url>">
<link type="text/css" rel="stylesheet"
	href="<c:url value='/css/font-awesome.min.css'></c:url>">
<link type="text/css" rel="stylesheet"
	href="<c:url value='/css/demo.css'></c:url>">

<script type="text/javascript"
	src="<c:url value='/js/jquery-1.11.3.min.js'></c:url>"></script>
<script type="text/javascript"
	src="<c:url value='/js/bootstrap.min.js'></c:url>"></script>
<script type="text/javascript"
	src="<c:url value='/js/metisMenu.min.js'></c:url>"></script>
<script type="text/javascript"
	src="<c:url value='/js/prism.min.js'></c:url>"></script>
<script type="text/javascript"
	src="<c:url value='/js/admin.js'></c:url>"></script>

<style>
.none-padding {
	padding: 0 !important;
}
</style>
<script type="text/javascript">
/**
 * 处理bootstrap里面的padding
 */
 $(document).ready(function(){  
	/* $('.container-fluid').addClass('none-padding'); */	
	/* 初始化菜单 */
	 $('#menu').metisMenu();
}); 
</script>
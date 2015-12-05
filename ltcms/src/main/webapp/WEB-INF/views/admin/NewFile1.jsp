<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link type="text/css" rel="stylesheet"
	href='<c:url value="/resources/bootstrap/css/bootstrap.min.css"></c:url>'>
<link type="text/css" rel="stylesheet"
	href='<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css"></c:url>'>

<script type="text/javascript"
	src='<c:url value="/resources/jquery/jquery-1.11.3.min.js"></c:url>'></script>
<script type="text/javascript"
	src='<c:url value="/resources/bootstrap/js/bootstrap.min.js"></c:url>'></script>
</head>
<body>
	<div class="dropdown">
  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
    Dropdown
    <span class="caret"></span>
  </button>
  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
    <li><a href="#">Action</a></li>
    <li><a href="#">Another action</a></li>
    <li><a href="#">Something else here</a></li>
    <li><a href="#">Separated link</a></li>
  </ul>
</div>
</body>
</html>

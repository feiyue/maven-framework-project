<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<tiles:insertAttribute name="meta" />
<title><tiles:insertAttribute name="title" /></title>
<tiles:insertAttribute name="script" />
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<tiles:insertAttribute name="header" />
			</div>
		</div>
		<div class="row">
			<div class="col-md-2">
				<tiles:insertAttribute name="menu" />
			</div>
			<div class="col-md-10">
				<tiles:insertAttribute name="body" />
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<tiles:insertAttribute name="footer" />
			</div>
		</div>
	</div>
</body>
</html>
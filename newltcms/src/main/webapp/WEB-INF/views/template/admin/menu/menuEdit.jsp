<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<div>
	<form method="post" action="menu">
	    a: <input id="menuName" type="text"   name="menuName"/>
	    b: <input id="menuCode" type="text"   name="menuCode"/>
	    <input type="submit" value="Submit" />
 	</form>
 	<h1>${adminHome}</h1>
</div>
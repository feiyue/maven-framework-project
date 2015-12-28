<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.lostyue.com/ltcmstaglib"  prefix="lt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div>
	<sf:form modelAttribute="ltcms_user_" action="${pageContext.request.contextPath}/urconfig/newuser" >
		<sf:hidden path="userid" id="userid"/>
		<div class="form-group">
			<label for="screenname">用户登录名：</label>
			<sf:input path="screenname" id="screenname" type="text" class="form-control"  placeholder="Email"/>
		</div>
		<div class="form-group">
			<label for=password_>用户密码：</label>
			<sf:input path="password_" id="password_" type="password"  class="form-control"  placeholder="Password"/>
		</div>
		<c:out value=""></c:out>
		<%-- <div class="checkbox">
			<label>
				<sf:checkbox path="lockout" id="lockout"  value="1" />是否锁定	
			</label>
		</div>
		<div class="form-group">
			<label for=languageid>用户语言：</label>
			<sf:select path="languageid" id="languageid" class="form-control">
				<option value="1">aaaaaa</option>
				<option value="2">aaaaaab</option>
				<option value="3">aaaaaac</option>
			</sf:select>
		</div>
		<div class="form-group">
			<label for="contactid">用户语言：</label>
			<sf:select path="contactid" id="contactid" class="form-control" multiple="multiple">
				<option value="1">aaaaaa</option>
				<option value="2">aaaaaab</option>
				<option value="3">aaaaaac</option>
			</sf:select>
		</div>
		<div class="form-group">
			<label for=logindate>登录时间：</label>
			<sf:input path="logindate" id="logindate" type="password"  class="form-control"  placeholder="Password"/>
		</div> --%>
		<button type="submit" class="btn btn-default">new Acccout</button>
		<%-- <fieldset>
			<table>	
				<sf:hidden path="userid" id="userid"/>
				<tr>
					<th><label for="screenname">用户登录名：</label></th>
					<td>
						<sf:input path="screenname" id="screenname"/>
					</td>
				</tr>
				<tr>
					<th><label for="password_">登录密码：</label></th>
					<td>
						<sf:input path="password_" id="password_"/>
					</td>
				</tr>
				<tr>
					<th></th>
					<td>
						<input type="submit" name="commit" value="New Account">
					</td>
				</tr>
				<tr>
					<td>
						<lt:ltcmstagdate/>
					</td>
				</tr>
			</table>
		</fieldset> --%>	
	</sf:form>
</div>
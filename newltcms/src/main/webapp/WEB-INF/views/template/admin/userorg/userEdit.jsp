<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.lostyue.com/ltcmstaglib"  prefix="lt"%>

<div>
	<sf:form method="POST" modelAttribute="ltcms_user_">
		<fieldset>
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
		</fieldset>	
	</sf:form>
</div>
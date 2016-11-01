<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World PDF</title>
</head>
<body>
	<html:form action="/HelloWorld">
	Aqui está o resultado do ActionForm:<br>
		<br>
		<table align="center" width="800" border="0">
			<tr>
				<td><logic:iterate name="tipo" id="var">
						<bean:write name="var" property="nome" />
						<html:radio property="selectedItemIterate" idName="var" value="id" />
					</logic:iterate></td>
				<td><h1>
						<%
						    out.print(request.getAttribute("HelloWord2"));
						%>
					</h1></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="button" value="pdf" onclick="javascript:location='/pocpdf/HelloWorld.do" /></td>
				<td></td>
			</tr>

		</table>
	</html:form>
</body>
</html>
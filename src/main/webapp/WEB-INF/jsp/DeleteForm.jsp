<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
</head>
<body>
<h3 align="center">Delete person</h3>
<div align="center">
    <form:form method="POST"
               action="/del" modelAttribute="person">
        <table>
            <tr>
                <td><form:label path="id">Person id</form:label></td>
                <td><form:input path="id"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>
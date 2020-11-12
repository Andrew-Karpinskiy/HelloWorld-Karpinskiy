<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
</head>
<body>
<h3 align="center">Enter new person</h3>
<div align="center">
<form:form method="POST"
           action="/save" modelAttribute="person">
    <table>
        <tr>
            <td><form:label path="id">Person id</form:label></td>
            <td><form:input path="id"/></td>
        </tr>

        <tr>
            <td><form:label path="personName">Name</form:label></td>
            <td><form:input path="personName"/></td>
        </tr>

        <tr>
            <td><form:label path="personLastName">Surname</form:label></td>
            <td><form:input path="personLastName"/></td>
        </tr>

        <tr>
            <td><form:label path="personGender">Gender</form:label></td>
            <td><form:input path="personGender"/></td>
        </tr>

        <tr>
            <td><form:label path="personAge">Age</form:label></td>
            <td><form:input path="personAge"/></td>
        </tr>

        <tr>
            <td><form:label path="personPhoneNumber">Phone number</form:label></td>
            <td><form:input path="personPhoneNumber"/></td>
        </tr>

        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</div>
</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Person List</title>
</head>
<body>
<h1 align="center">Person List</h1>

<br/><br/>
<div align="center">
    <table border="1">
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Gender</th>
            <th>Age</th>
            <th>Phone number</th>
        </tr>
        <c:forEach  items="${persons}" var ="person">
            <tr>
                <td>${person.personName}</td>
                <td>${person.personLastName}</td>
                <td>${person.personGender}</td>
                <td>${person.personAge}</td>
                <td>${person.personPhoneNumber}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>

</html>
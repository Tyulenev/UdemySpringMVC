<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>
<h2>Employee, Please Enter your details</h2>
<br>
<br>

<form:form action = "showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <br>
    Surname <form:input path="surname"/>
    <br>
    salary <form:input path="salary"/>
    <br>
    <input type="submit" value="OK">

</form:form>

</body>

</html>
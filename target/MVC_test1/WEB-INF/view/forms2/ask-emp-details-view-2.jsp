<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>
<h2>Employee, Please Enter your details</h2>
<br>
<br>

<form:form action = "showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    salary <form:input path="salary"/>
    <br><br>
    Department <form:select path="department">
<%--        <form:option value="Information Technology" label="IT"/>--%>
<%--        <form:option value="Human resources" label="HR"/>--%>
<%--        <form:option value="Sales" label="Sales"/>--%>
        <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>
    Which car you want?
    <form:radiobuttons path="carBrend" items="${employee.carBrends}"/>
<%--    BMW <form:radiobutton path="carBrend" value="BMW"/>--%>
<%--    Audi <form:radiobutton path="carBrend" value="Audi"/>--%>
<%--    Mersedes <form:radiobutton path="carBrend" value="MB"/>--%>
    <input type="submit" value="OK">

</form:form>

</body>

</html>
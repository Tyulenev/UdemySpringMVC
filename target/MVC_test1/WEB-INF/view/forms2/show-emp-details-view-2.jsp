<!DOCTYPE html>
<html>

<body>
<h2>Dear Employee, you are welcome!</h2>
<br>
<br>
<%--Your name:${param.employeeName}--%>
<%--Your name: ${nameAttribute} (${description})--%>
Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Department: ${employee.department}

</body>

</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>


<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>

<form:form method="POST" commandName="user" action="check-user" class="box login">



        <form:label path="login">Login:</form:label>
        <form:input path="login" />
        <%--<form:errors path="login" cssClass="error"/>--%>


        <form:label path="password">Password:</form:label>
        <form:password path="password" />
        <%--<form:errors path="password" cssClass="error"/>--%>

    <footer>
        <input type="submit" class="btnLogin" value="Login" tabindex="4">
    </footer>

</form:form>

<form:form method="get" commandName="user" action="student" class="box reg">

    <footer>
        <input type="submit" class="btnReg" value="Registration" tabindex="4">
    </footer>

</form:form>
</body>
</html>
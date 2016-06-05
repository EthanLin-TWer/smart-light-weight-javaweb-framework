<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Customer Manage: List</title>
    </head>

    <body>
        <h1>Customer List</h1>
        <table>
            <tr>
                <th>customer name</th>
                <th>contacts</th>
                <th>phone number</th>
                <th>email address</th>
                <th>notes</th>
            </tr>

            <c:forEach var="customer" items="${customerList}">
                <tr>
                    <td>${customer.name}</td>
                    <td>${customer.contacts}</td>
                    <td>${customer.phoneNumber}</td>
                    <td>${customer.email}</td>
                    <td>${customer.notes}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
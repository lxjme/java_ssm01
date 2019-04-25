<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<html>
<body>
    <table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td>${c.c_name}</td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="3">
            
        </td>
    </tr>
</table>

<div style="text-align:center">
    <a href="?start=0">首页</a>
    <a href="?start=${page.start-page.count}">上一页</a> 
    <a href="?start=${page.start+page.count}">下一页</a> 
    <a href="?start=${page.last}">尾页</a> 
</div>
    

</body>
</html>



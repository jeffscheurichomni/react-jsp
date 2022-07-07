<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="../partials/taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="../partials/head.jsp"/>
    <link rel="stylesheet" href="/index.css">
    <title>Home</title>
</head>
<body>
<div class="container">
    <div class="nav">
        <h1>Spring-Boot-Prototype</h1>
    </div>
    <div class="post-container">
        <c:if test="${not empty lists}">
            <c:forEach var="listValue" items="${lists}">
                <div class="type-${listValue.type} post">
                    <a class="post-link" href="page/?id=${listValue.id}"><h2 class="post-title">${listValue.title}</h2></a>
                    <p class="post-desc">${listValue.desc}</p>
                    
                </div>
            </c:forEach>
        </c:if>
    </div>
</div>

</body>
</html>
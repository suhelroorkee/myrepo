<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link type="text/css" rel="stylesheet" href='<c:url value="/static/css/product.css"/>'/>
<script type="text/javascript" src='<c:url value="/static/js/jquery.js"/>'/></script>
<script type="text/javascript" src='<c:url value="/static/js/product.js"/>'/></script>

</head>
<body>

<c:if test="${products ne null}">

	<c:forEach var="product" items="products">
	
		<div class="product">
			<div class="productimage">
				<img src='<c:url value="/static/images/${product.image}"/>'/>
			</div>
			<div class="productname">
				${product.CompanyName} ${product.name}
			</div>
		</div>
	
	</c:forEach>

</c:if>
<c:if test="${products eq null}">
	No products found...
</c:if>



</body>
</html>
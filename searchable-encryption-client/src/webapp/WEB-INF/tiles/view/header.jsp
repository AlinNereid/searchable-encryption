<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<nav class="navbar navbar-default navbar-fixed-top customNavBar">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a id="cusomHeadTitle" class="navbar-brand text-uppercase" href="${pageContext.request.contextPath}">E-auction</a>
            
            <sec:authorize access="isAuthenticated() and hasRole('ROLE_SELLER')">
				<a id="addItemButton" class="navbar-brand text-uppercase"
					href="#">Sell Item</a>
			</sec:authorize>
        </div>

     	<sec:authorize access="isAuthenticated()">
     	<div id="onLogIn">
     	<p id="usernameHeader">Welcome, ${sessionScope.user.username} </p>
            <a id="logoutBtn" href="#" class="btn btn-primary">Logout</a>
     	</div>
           </sec:authorize> 
    </div>
</nav>
<script src="<c:url value="/resources/js/logout.js" />"></script>
<script src="<c:url value="/resources/js/addItemForSale.js" />"></script>
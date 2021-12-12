<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">AppVendas</a>
    </div>
    
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      
      <c:if test="${not empty user}">
      	<li><a href="/usuarios">Usuário</a></li>
      	<li><a href="/clientes">Cliente</a></li>
      	<li><a href="/utensilios">Utensilio</a></li>
      	<li><a href="/eletroportateis">Eletroportatil</a></li>
      	<li><a href="/churrascos">Churrasco</a></li>
      	<li><a href="/produtos">Produtos</a></li>
      	<li><a href="/vendas">Venda</a></li>
      </c:if>
    </ul>
    
    <ul class="nav navbar-nav navbar-right">
      <c:if test="${empty user}">
      	<li><a href="/usuario"><span class="glyphicon glyphicon-user"></span> Registrar</a></li>
      </c:if>
      
      <c:if test="${empty user}">
      	<li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Entrar</a></li>
	  </c:if>
	  
      <c:if test="${not empty user}">
      	<li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Sair, ${user.nome}</a></li>
      </c:if>
    </ul>
  </div>
</nav>
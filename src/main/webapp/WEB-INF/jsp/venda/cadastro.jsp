<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de Venda</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<c:set var="botao" value=""/>

	<div class="container">	
		<form action="/venda/incluir" method="post">	
			<div class="form-group">
		      <label>Informacao:</label>
		      <input value="Minha venda" type="text" class="form-control" placeholder="Digite a informacão da venda" name="informacao">
		    </div>			

			<div class="form-group">
			<c:if test="${not empty produtos}">
		      <label>Produtos:</label>
		      <c:forEach var="p" items="${produtos}">
				<div class="form-check-inline">
				  <label class="form-check-label">
				    <input type="checkbox" name="produtoIds" class="form-check-input" value="${p.id}"> ${p.nome}
				  </label>
				</div>
			  </c:forEach>
			</c:if>  			
			<c:if test="${empty produtos}">
		      <label>Não existem produtos cadastrados!!!</label>	
		      <c:set var="botao" value="disabled"/>		
			</c:if>
			</div>
			
			<div class="form-group">
		    <c:if test="${not empty clientes}">
		      <label>Cliente:</label>
				<select class="form-control" name="cliente.id">
				  <c:forEach var="s" items="${clientes}">
					<option value="${s.id}">${s.nome}</option>
				  </c:forEach>
				</select>
			</c:if>
		    <c:if test="${empty clientes}">
		      <label>Não existem clientes cadastrados!!!</label>
		      <c:set var="botao" value="disabled"/>
		    </c:if>
			</div>

			<button ${botao} class="btn btn-light" type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>
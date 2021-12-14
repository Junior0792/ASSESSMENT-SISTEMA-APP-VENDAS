<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
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

	<div class="container">	
		
		<c:if test="${not empty nome}">
			<div class="alert alert-success">
				 <strong>Confirmação!</strong> O produto ${nome} foi cadastrada com sucesso!!!
			</div>
		</c:if>
		
		<c:if test="${not empty mensagem}">
			<div class="alert alert-danger">
				 <strong>Atenção!</strong> ${mensagem}
			</div>
			
		</c:if>
		<c:if test="${not empty listaProdutos}">
		
			<h4>Listagem de produtos (${listaProdutos.size()}):</h4>		
			<table class="table table-striped">
			    <thead>
			      <tr>
			        <th>#</th>
			        <th>Nome</th>
			        <th>Preço</th>
			        <th>Marca</th>
			        <th></th>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach var="p" items="${listaProdutos}">
				      <tr>
				      	<td>${p.id}</td>
				        <td>${p.nome}</td>
				        <td>${p.preco}</td>
				        <td>${p.marca}</td>
				        <td><a href="/produto/${p.id}/excluir">Excluir</a></td>
				      </tr>
			      </c:forEach>
			    </tbody>
		  	</table>
	  	</c:if>
	  			
	  	<c:if test="${empty listaProdutos}">
	  		<h4>Não existem produtos cadastrados!</h4>
	  	</c:if>
	</div>
</body>
</html>
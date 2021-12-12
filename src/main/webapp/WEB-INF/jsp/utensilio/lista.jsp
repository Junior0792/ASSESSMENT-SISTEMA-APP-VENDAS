<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de Vendas</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">	
		
		<a href="/utensilio">Novo produto</a>
	
		<hr>
		
		<c:if test="${not empty nome}">
			<div class="alert alert-success">
				 <strong>Confirmação!</strong> O produto ${nome} foi cadastrado com sucesso!!!
			</div>
		</c:if>
		
		<c:if test="${not empty listaUtensilios}">
		
			<h4>Listagem de utensilios (${listaUtensilios.size()}):</h4>		
			<table class="table table-striped">
			    <thead>
			      <tr>
			        <th>#</th>
			        <th>Nome</th>
			        <th>Preço</th>
			        <th>Marca</th>
			        <th>Quantidade</th>
			        <th>Cor</th>
			        <th>Inox</th>
			        <th></th>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach var="b" items="${listaUtensilios}">
				      <tr>
				      	<td>${b.id}</td>
				        <td>${b.nome}</td>
				        <td>${b.preco}</td>
				        <td>${b.marca}</td>
				        <td>${b.quantidade}</td>
				        <td>${b.cor}</td>
				        <td>${b.inox}</td>
				        <td><a href="/utensilio/${b.id}/excluir">Excluir</a></td>
				      </tr>
			      </c:forEach>
			    </tbody>
		  	</table>
	  	</c:if>
	  			
	  	<c:if test="${empty listaUtensilios}">
	  		<h4>Não existem produtos cadastrados!</h4>
	  	</c:if>
	</div>
</body>
</html>
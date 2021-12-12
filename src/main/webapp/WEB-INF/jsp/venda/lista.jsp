<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="br.edu.infnet.appvendas.model.domain.Cliente"%>
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
		
		<a href="/venda">Nova venda</a>
	
		<hr>
		
		<c:if test="${not empty informacao}">
			<div class="alert alert-success">
				 <strong>Confirma��o!</strong> Venda ${informacao} cadastrado com sucesso!!!
			</div>
		</c:if>
		
		<c:if test="${not empty listaVendas}">
		
			<h4>Listagem de vendas (${listaVendas.size()}):</h4>		
			<table class="table table-striped">
			    <thead>
			      <tr>
			        <th>#</th>
			        <th>Informac�o</th>
			        <th>Desconto</th>
			        <th>Cliente</th>
			        <th>Produtos</th>
			        <th></th>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach var="p" items="${listaVendas}">
				      <tr>
				      	<td>${p.id}</td>
				        <td>${p.informacao}</td>
				        <td>${p.desconto}</td>
				        <td>${p.cliente.nome}</td>
				        <td>${p.produtos.size()}</td>
				        <td><a href="/venda/${p.id}/excluir">Excluir</a></td>
				      </tr>
			      </c:forEach>
			    </tbody>
		  	</table>
	  	</c:if>
	  			
	  	<c:if test="${empty listaVendas}">
	  		<h4>N�o existem vendas cadastradas!</h4>
	  	</c:if>
	</div>
</body>
</html>
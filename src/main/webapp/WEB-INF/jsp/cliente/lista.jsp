<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="br.edu.infnet.appvendas.model.domain.Cliente"%>
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
		
		<a href="/cliente">Novo cliente</a>
	
		<hr>
		
		<c:if test="${not empty mensagem}">
			<div class="alert alert-danger">
				 <strong>Atenção!</strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${not empty nome}">
			<div class="alert alert-success">
				 <strong>Confirmação!</strong> Cliente ${nome} cadastrado com sucesso!!!
			</div>
		</c:if>
		
		<c:if test="${not empty listaClientes}">
		
			<h4>Listagem de clientes (${listaClientes.size()}):</h4>		
			<table class="table table-striped">
			    <thead>
			      <tr>
			        <th>#</th>
			        <th>Nome</th>
			        <th>CPF</th>
			        <th>Email</th>
			        <th>Usuário</th>
			        <th></th>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach var="s" items="${listaClientes}">
				      <tr>
				      	<td>${s.id}</td>
				        <td>${s.nome}</td>
				        <td>${s.cpf}</td>
				        <td>${s.email}</td>
				        <td>${s.usuario.nome}</td>
				        <td><a href="/cliente/${s.id}/excluir">Excluir</a></td>
				      </tr>
			      </c:forEach>
			    </tbody>
		  	</table>
	  	</c:if>
	  			
	  	<c:if test="${empty listaClientes}">
	  		<h4>Não existem clientes cadastrados!</h4>
	  	</c:if>
	</div>
</body>
</html>
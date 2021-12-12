<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		<form action="/cliente/incluir" method="post">	
			<div class="form-group">
		      <label>Nome:</label>
		      <input value="Junior Roso" type="text" class="form-control" placeholder="Digite seu nome" name="nome">
		    </div>			
		
			<div class="form-group">
		      <label>E-mail:</label>
		      <input value="junior.aranguren@al.infnet.edu.br" type="email" class="form-control" placeholder="Digite seu e-mail" name="email">
		    </div>			
			
			<div class="form-group">
		      <label>CPF:</label>
		      <input value="12312312312" type="text" class="form-control" placeholder="Digite seu CPF" name="cpf">
		    </div>			

			<button class="btn btn-light" type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>
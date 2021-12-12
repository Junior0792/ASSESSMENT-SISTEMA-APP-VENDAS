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
		<form action="/utensilio/incluir" method="post">	
			<div class="form-group">
		      <label>Nome:</label>
		      <input value="Panela" type="text" class="form-control" placeholder="Digite o nome do produto" name="nome">
		    </div>			
		
			<div class="form-group">
		      <label>Preço:</label>
		      <input value="58.00" type="text" class="form-control" placeholder="Digite o preço do produto" name="preco">
		    </div>			

			<div class="form-group">
		      <label>Marca:</label>
		      <input value="Tramontina" type="text" class="form-control" placeholder="Digite o nome da marca" name="marca">
		    </div>			

			<div class="form-group">
		      <label>Quantidade:</label>
		      <input value="1" type="text" class="form-control" placeholder="Digite a quantidade desejada" name="quantidade">
		    </div>			

			<div class="form-group">
		      <label>Cor:</label>
		      <input value="cinza" type="text" class="form-control" placeholder="Digite o cor do produto" name="cor">
		    </div>			

			<div class="form-group">
		      <label>Opção:</label>
				<div class="form-check-inline">
				  <label class="form-check-label">
				    <input type="checkbox" name="inox" class="form-check-input" value="true"> Inox
				  </label>
				</div>			
			</div>

			<button class="btn btn-light" type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>
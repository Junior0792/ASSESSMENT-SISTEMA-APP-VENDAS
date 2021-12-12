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
		<form action="/eletroportatil/incluir" method="post">	
			<div class="form-group">
		      <label>Nome:</label>
		      <input value="Microondas" type="text" class="form-control" placeholder="Digite o nome do produto" name="nome">
		    </div>			
		
			<div class="form-group">
		      <label>Preço</label>
		      <input value="300" type="text" class="form-control" placeholder="Digite o preço do produto" name="preco">
		    </div>			

			<div class="form-group">
		      <label>Marca:</label>
		      <input value="electrolux" type="text" class="form-control" placeholder="Digite o nome da marca" name="marca">
		    </div>			

			<div class="form-group">
		      <label>Potencia:</label>
		      <input value="50" type="text" class="form-control" placeholder="Digite a potencia do produto" name="potencia">
		    </div>			

			<div class="form-group">
		      <label>Cor:</label>
		      <input value="azul" type="text" class="form-control" placeholder="Digite o cor do produto" name="cor">
		    </div>			

			<div class="form-group">
		      <label>Garantia:</label>
				<div class="form-check-inline">
				  <label class="form-check-label">
				    <input type="checkbox" name="garantia" class="form-check-input" value="true"> Garantia
				  </label>
				</div>			
			</div>

			<button class="btn btn-light" type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>
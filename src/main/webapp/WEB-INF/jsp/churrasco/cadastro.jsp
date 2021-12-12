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
		<form action="/churrasco/incluir" method="post">	
			<div class="form-group">
		      <label>Nome:</label>
		      <input value="frango" type="text" class="form-control" placeholder="Digite o nome do produto" name="nome">
		    </div>			
		
			<div class="form-group">
		      <label>Preço:</label>
		      <input value="58.00" type="text" class="form-control" placeholder="Digite o preço do produto" name="preco">
		    </div>			

			<div class="form-group">
		      <label>Marca:</label>
		      <input value="korin" type="text" class="form-control" placeholder="Digite o nome da marca" name="marca">
		    </div>			

			<div class="form-group">
		      <label>Tempero:</label>
		      <input value="Chimichurri" type="text" class="form-control" placeholder="Digite o nome do tempero" name="tempero">
		    </div>			

			<div class="form-group">
		      <label>Peso:</label>
		      <input value="500" type="text" class="form-control" placeholder="Digite o peso do produto" name="peso">
		    </div>			

			<div class="form-group">
		      <label>Opção:</label>
				<div class="form-check-inline">
				  <label class="form-check-label">
				    <input type="checkbox" name="picanha" class="form-check-input" value="true"> Picanha
				  </label>
				</div>			
			</div>

			<button class=""btn btn-light"" type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>
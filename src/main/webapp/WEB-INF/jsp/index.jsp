<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu incial</title>
<meta charset="ISO-8859-1">
<title>A casa do Chef</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">A casa do Chef</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="categorias.jsp">Produtos</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="carrinho.jsp">Meu carrinho</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Contatos</a>
        </li>
      </ul>
    </div>
  </div>
</nav>




 
      <div class="jumbotron" style="background-color:gray clear">
	  <h1 class="alert-heading"></h1>
	  <h3>Somos uma loja especializada em produtos de cozinha e eletroportáteis.</h3>
	  <h3>Aqui você encontra diversos tipos de utensílios, eletroportáteis e produtos para o seu churrasco.</h3>
	  <img src= "https://mueller.ind.br/uploads/imagens/lista-de-utensilios-domesticos-que-nao-podem-faltar-na-sua-casa-71-lg-55.jpg" width= "1300px"/>
	  </div>
	  <hr>
      <p class="mb-0"></p>    

  <div class="jumbotron" style="background-color:gray clear">
	  <h4 class="alert-heading">Login</h4>
	  
    <div class="form-group">
	  <label class="control-label col-sm-20">E-mail</label>
	  <input type="email"class="form-control" name="email"placeholder="Digite seu e-mail">
    </div> 
   
   <div class="form-group">
	  <label class="control-label col-sm-20">Senha</label>
	  <input type="password"name="password"class="form-control"placeholder="Digite sua senha">
    </div> 
    
    <p align="center"><input type="button" value="Entrar"class="btn btn-secondary onclick="location.href='./09_03_Tela_de_Ofertas.html'">
  
    </div>
  
  <div class="jumbotron" style="background-color:gray clear">
	  <h4 class="alert-heading">Não tem conta no nosso site?</h4>

  <font size="4"><a href="/cliente">Criar uma conta aqui!</a></font>
  </div>









</body>
</html>
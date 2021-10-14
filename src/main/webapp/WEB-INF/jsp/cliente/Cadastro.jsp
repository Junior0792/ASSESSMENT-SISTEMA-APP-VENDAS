<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
      <div class="jumbotron" style="background-color:gray clear">
      <h4>Cadastramento de Cliente</h4>
    </div>
     
    <div class="jumbotron" style="background-color:gray clear">
		<form class="form-horizontal" action="/cliente/incluir" method="post">

		    <div class="form-group">
		      <label class="control-label col-sm-20">Nome</label> 
		      <input value= "Kadu Moncada"type="text" name="nome"class="form-control">
	        </div> 
	        
	        <div class="form-group">
	          <label class="control-label col-sm-20">CPF</label>
        	  <input value= 06333454312 type="number"class="form-control" name="CPF">
            </div> 
	         
		     <div class="form-group">
	          <label class="control-label col-sm-20">Endereço</label>
	          <input value= "Rua diogenes Malacarne, 303" type="text"class="form-control" name="endereço">
            </div> 
            
            <div class="form-group">
	         <label class="control-label col-sm-20">Telefone</label>
	         <input value= 2199123456 type="number"class="form-control" name="telefone">
            </div>  
            
            <div class="form-group">
		      <label class="control-label col-sm-20">E-mail:</label>
		      <input value= "kaka@gmail.com" type="email"class="form-control" name="email"placeholder="Digite seu e-mail">
	        </div> 
            
            <div class="form-group">
	         <label class="control-label col-sm-20">Senha</label>
	         <input value= "1234"type="password"name="senha"class="form-control">
            </div> 
    
            <div class="form-group">
	         <label class="control-label col-sm-20">Confirmar Senha</label>
	         <input value="1234"type="password"name="confirmar senha"class="form-control">
            </div> 
            
            <div class="form-group">
		      <label class="control-label col-sm-20">Tipo de Conta</label>
		    </div>
		    <div class="form-group">        
	            <label><input checked type="radio"  name= "conta" value= "PF"> Pessoa fisica </label>
            </div>
		    <div class="form-group">        
	            <label><input type="radio"  name= "conta" value= "PJ"> Pessoa juridica </label>
            </div>
            
            <div class="form-group">
	         <label class="control-label col-sm-20">Razão social</label> 
	         <input type="text" name="razao social"class="form-control">
            </div> 
    
            <div class="form-group">
	         <label class="control-label col-sm-20">CNPJ</label> 
	         <input type="number" name="CNPJ"class="form-control">
            </div> 
            
		    <button type="submit" class="btn btn-primary">Cadastrar</button>
		    
	    </form>
    </div>
    </div>

</body>
</html>
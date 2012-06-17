function textoPadrao (elemento) {
  //element.defaultValue armazena o texto padr~ao.
  if (elemento.value == elemento.defaultValue) {
    elemento.value = ''; //Modifica o valor padr~ao.
  }
  else 
    if (elemento.value == '') {
      //A caixa de entrada est'a vazia, ent~ao devemos mostrar o texto padr~ao novamente..
      elemento.value = elemento.defaultValue;
    }
}  

function verificaCamposCadastro () {
  var resp = true;
    
  if (verificaNome () == false)
    resp = false;    
  if (verificaSobrenome () == false)
    resp = false;
  if (verificaEmail () == false)
    resp = false;
  if (verificaSenha () == false)
    resp = false;
  if (verificaCelular () == false)
    resp = false;
  if (verificaTelefone () == false)
    resp = false;
  
  return resp;
}  

function verificaNome () {
  var resp = true;
  var campo_nome = document.getElementById ("nome");
  
  if (campo_nome.value == campo_nome.defaultValue) {
    campo_nome.className = 'etradaPadraoObrigatoria';
    
    var texto = document.getElementById ("par_nome");
    texto.className = 'etradaPadraoObrigatoria';
    
    //var form  = document.getElementById("cadastro");
    //form.action = "";
    //form.method = "";
    
    resp = false;
  }
  
  return resp;
}

function verificaSobrenome () {
  var resp = true;
  var campo_sobrenome = document.getElementById ("sobrenome");
  
  if (campo_sobrenome.value == campo_sobrenome.defaultValue) {
    campo_sobrenome.className = 'etradaPadraoObrigatoria';
    
    var texto = document.getElementById ("par_sobrenome");
    texto.className = 'etradaPadraoObrigatoria';
    
//    var form  = document.getElementById("cadastro");
//    form.action = "";
//    form.method = "";
    
    resp = false;
  }
  
  return resp;
}

function verificaEmail () {
  var resp = true;
  var campo_email = document.getElementById ("email");
  
  if (campo_email.value.indexOf ("@") == -1) {
    campo_email.className = 'etradaPadraoObrigatoria';
    
    var texto = document.getElementById ("par_email");
    texto.className = 'etradaPadraoObrigatoria';
    
//    var form  = document.getElementById("cadastro");
//    form.action = "";
//    form.method = "";
    
    resp = false;
  }
  
  return resp;
}

function verificaSenha () {
  var resp = true;
  var campo_senha = document.getElementById ("senha");
  var campo_confsenha = document.getElementById ("confsenha");
  
  if ((campo_senha.value.length < 8) ||
      (campo_senha.value != campo_confsenha.value)) {   
    var texto = document.getElementById ("par_senha");
    texto.className = 'etradaPadraoObrigatoria';
    
    var texto = document.getElementById ("par_confsenha");
    texto.className = 'etradaPadraoObrigatoria';

//    var form  = document.getElementById ("cadastro");
//    form.action = "";
//    form.method = "";
    
    resp = false;
  }
  
  return resp;
}

function mascaraTelefone (elemento) { 
  if (elemento.value.length == 0)
    elemento.value = '+' + elemento.value;
  if (elemento.value.length == 3)
    elemento.value =  elemento.value + '(';
  if (elemento.value.length == 6)
    elemento.value = elemento.value + ')';
  if (elemento.value.length == 11)
    elemento.value = elemento.value + '-';
}

function verificaCelular () {
  var resp = true;
  var campo_celular = document.getElementById ("cel");
  
  if (campo_celular.value == "") {
    var texto = document.getElementById ("par_cel");
    texto.className = 'etradaPadraoObrigatoria';
    
//    var form  = document.getElementById ("cadastro");
//    form.action = "";
//    form.method = "";
    
    resp = false;
  }
  
  return resp;
}

function verificaTelefone () {
  var resp = true;
  var campo_telefone = document.getElementById ("tel");
  
  if (campo_telefone.value == "") {
    var texto = document.getElementById ("par_tel");
    texto.className = 'etradaPadraoObrigatoria';
//    
//    var form  = document.getElementById ("cadastro");
//    form.action = "";
//    form.method = "";
    
    resp = false;
  }
  
  return resp;
}

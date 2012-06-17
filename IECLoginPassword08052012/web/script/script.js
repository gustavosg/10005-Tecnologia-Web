function defaultText (element) {
    //element.defaultValue armazena o texto padr~ao.
    if (element.value == element.defaultValue) {
        element.value = ''; //Modifica o valor padr~ao.
    }
    else 
    if (element.value == '') {
        //A caixa de entrada est'a vazia, ent~ao devemos mostrar o texto padr~ao novamente..
        element.value = element.defaultValue;
    }
}  


/**
 * Verifica conteúdo do campo de Nome
 */
function onFocusNome(element){
    if (element.value.substring(0, 6) == "Insira")
        element.value= "";
}

function formatTel(element, e){
  
    length = element.value.length;
    if (length == 2){
        if (element.value.charAt(0)!="(")
            element.value = "(" + element.value + ")";
    }
    if (length == 3)
        if (element.value.charAt(0)=="(")
            element.value += ")";
    if (length == 8)
        element.value += "-";
}


function callValidateServlet(){
    
    
    var canRedirect = new Boolean();
    canRedirect = true;
    
    if (document.getElementById("inputNome").value.toString() == "")
    {
        canRedirect = false;
        document.getElementById("inputNome").value = "Insira seu nome";
        document.getElementById("inputNome").style.color = "red";
        document.getElementById("labelNome").style.color = "red";
    }
    else if(document.getElementById("inputNome").value.toString() == "Insira seu nome")
        canRedirect = false;
    
    if (document.getElementById("inputSobreNome").value.toString() == "")
    {
        canRedirect = false;
        document.getElementById("inputSobreNome").value = "Insira seu sobrenome";
        document.getElementById("inputSobreNome").style.color = "red";
        document.getElementById("labelSobreNome").style.color = "red";
    }
    if (document.getElementById("inputSenha").value.toString() == "")
    {
        canRedirect = false;
        document.getElementById("inputSenha").value = "";
        document.getElementById("inputSenha").style.color = "red";
        document.getElementById("labelSenha").style.color = "red";    
    }
    
    if (document.getElementById("inputConfirmarSenha").value.toString() == "")
    {
        canRedirect = false;
        document.getElementById("inputConfirmarSenha").value = "";
        document.getElementById("inputConfirmarSenha").style.color = "red";
        document.getElementById("labelConfirmarSenha").style.color = "red";    
    }
    
    if (document.getElementById("inputEmail").value.toString()== "")
    {
        canRedirect = false;
        document.getElementById("inputEmail").value = "Insira seu email";
        document.getElementById("inputEmail").style.color = "red";
        document.getElementById("labelEmail").style.color = "red";    
    }
        
    if (document.getElementById("inputTel").value.toString() == "")
    {
        canRedirect = false;
        document.getElementById("inputTel").value = "Insira seu telefone";
        document.getElementById("inputTel").style.color = "red";
        document.getElementById("labelTel").style.color = "red";        
    }
        
    if (document.getElementById("inputCel").value.toString() == "")
    {
        canRedirect = false;
        document.getElementById("inputCel").value = "Insira seu telefone";
        document.getElementById("inputCel").style.color = "red";
        document.getElementById("labelCel").style.color = "red";    
    }
    
    if (canRedirect == true)
    {
        window.open("newuser.java" );
    }
}
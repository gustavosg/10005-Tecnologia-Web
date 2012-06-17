/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

function somaValores(){
    value1 = prompt("Digite o primeiro valor: " );
    value2 = prompt("Digite o segundo valor: " );
    result = parseInt(value1) + parseInt(value2);
    alert("Resultado da soma:" + result);
}

function subtraiValores(){
    value1 = prompt("Digite o primeiro valor: " );
    value2 = prompt("Digite o segundo valor: " );
    result = parseInt(value1) - parseInt(value2);
    alert("Resultado da subtração:" + result);
}

function multiplicaValores(){
    value1 = prompt("Digite o primeiro valor: " );
    value2 = prompt("Digite o segundo valor: " );
    result = parseInt(value1) * parseInt(value2);
    alert("Resultado da multiplicação:" + result);
}

function divideValores(){
    value1 = prompt("Digite o primeiro valor: " );
    value2 = prompt("Digite o segundo valor: " );
    result = parseInt(value1) / parseInt(value2);
    alert("Resultado da divisão:" + result);
}

function validaCampos(){
	var result = String.empty;
	if (document.getElementById("Nome").value.toString() == "" )
		 result = "Por favor, preencha seu nome! <br>";
		 else
		 result = "Nome: "+document.getElementById("Nome").value+"<br>";
		 

	if (document.getElementById("Endereco").value.toString() == "" )
		result += document.getElementById("Texto").innerHTML = "Por favor, preencha seu endereco!<br> "	;
		else
		 result += "Endereco: "+document.getElementById("Endereco").value+"<br>";
	
	if (document.getElementById("DataNasc").value.toString() == "" )
		result += document.getElementById("Texto").innerHTML = "Por favor, preencha sua data de nascimento!"	;
		else
		 result += "DataNasc: "+document.getElementById("DataNasc").value+"<br>";
		
		document.getElementById("Texto").innerHTML = result;
		
}

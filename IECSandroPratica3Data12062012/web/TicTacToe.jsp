<%-- 
    Document   : TicTacToe
    Created on : 17/06/2012, 17:58:05
    Author     : Gustavo
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <script type="text/javascript" src="functions/jquery.js"></script>
        <script type="text/javascript" src="functions/script.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <form name="formTTT">
            <table border="2" rules="all">
                <tr id="111">
                    <td id="td1"><input type="button" id="1" value=""></input> </td>
                    <td id="td2"><input type="button" id="2" value=""></input> </td>
                    <td id="td3"><input type="button" id="3" value=""></input> </td>
                </tr>
                <tr id="222">
                    <td id="td4"><input type="button" id="4" value=""></input> </td>
                    <td id="td5"><input type="button" id="5" value=""></input> </td>
                    <td id="td6"><input type="button" id="6" value=""></input> </td>
                </tr>
                <tr id="333">
                    <td id="td7"><input type="button" id="7" value=""></input> </td>
                    <td id="td8"><input type="button" id="8" value=""></input> </td>
                    <td id="td9"><input type="button" id="9" value=""></input> </td>
                </tr>
            </table>
            <br />
            <input type="button" id="cleanAll" value="Limpar todos os botoes"></input>
            <br />

            <!-- Jogador atual -->
            <label>Vez do jogador: </label>
            <input type="label" id="player" value="O"></input>
            <br />

            <!-- Área de Debug -->
            <label>Debug:</label>
            <table border="2" rules="all">
                <tr>
                    <td><input type="text" id="debug1" value=""></input> </td>
                    <td><input type="text" id="debug2" value=""></input> </td>
                    <td><input type="text" id="debug3" value=""></input> </td>
                </tr>
                <tr>
                    <td><input type="text" id="debug4" value=""></input> </td>
                    <td><input type="text" id="debug5" value=""></input> </td>
                    <td><input type="text" id="debug6" value=""></input> </td>
                </tr>
                <tr>
                    <td><input type="text" id="debug7" value=""></input> </td>
                    <td><input type="text" id="debug8" value=""></input> </td>
                    <td><input type="text" id="debug9" value=""></input> </td>
                </tr>
            </table>

            <script type="text/javascript">
                $(document).ready(function(){

                    game = ["","","","","","","","","" ];
                    // guarda se teve alguma vitória
                    victory = false;
                    
                    // Tipos de vitória possível dentro de um tabuleiro de Jogo da Velha
                    victoryTypes=[ [1,2,3], [4,5,6], [7,8,9], [1,4,7], [2,5,8], [3,6,9], [1,5,9], [3,5,7] ];

                    // @ToDo ver link: http://thingsilearned.com/2009/06/02/tictactoe-in-jquery/

                    $("#1").click(function(){
                        nextTurn("#1");
                        debugValue(this.id, ($(this).val())) ;
                    });
                    $("#2").click(function(){
                        nextTurn("#2");
                    });
                    $("#3").click(function(){
                        nextTurn("#3");
                    });
                    $("#4").click(function(){
                        nextTurn("#4");
                    });
                    $("#5").click(function(){
                        nextTurn("#5");
                    });
                    $("#6").click(function(){
                        nextTurn("#6");
                    });
                    $("#7").click(function(){
                        nextTurn("#7");
                    });
                    $("#8").click(function(){
                        nextTurn("#8");
                    });
                    $("#9").click(function(){
                        nextTurn("#9");
                        
                    });
                    
                    /**
                     * faz a limpeza de todos os campos da tela
                     */
                    
                    if ($("#cleanAll").click(function(){
                        var buttonName = "#";
                        var inputs = document.getElementsByTagName("input");
                        for (var i = 1; i<=inputs.length; i++){
                            buttonName = "#"+i;
                            ($(buttonName).val(""));
                        }
                    }))
                  
                    /**
                     * Função que atribui o valor ao evento chamado.
                     * $param = objeto passado para receber tratamento.
                     */
                    function nextTurn(param){
                 
                        if ($(param).val() == "")
                        {
                            // guarda qual é o turno do jogador:
                            var playerTurn = "";
                            if ($("#player").val() == "O")
                                playerTurn = "X";
                            else
                                playerTurn = "O";
                            ($(param).val(playerTurn));
                            ($("#player").val(playerTurn));
                            ($(param).disabled());
                        }
                    }
                    
                    function debugValue(param, val){
                        var valorJogador = 0;
                        alert("parametro: " + param + " valor: " + val);
                        var linha = [0, 0, 0];
                        var coluna = [0, 0, 0];
                        if (param < 4)
                            linha = [param][val];
                        
                        alert(linha);
                    
                        var field = "#debug"+param;
                        //alert("Linha: "+ linha + " coluna" + coluna);
                    
                        ($(field).val(val));
                    }
                    
                    function endGame(){
                        if (this.victory == "Velha")
                            ($("#player").val("Deu jogo da velha!"));
                        else
                            ($("#player").val("O jogador "+ ($("#player")).val() + " ganhou!"));
                    }
                });
            
            </script>
        </form>
    </body>
</html>

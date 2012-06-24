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
                <tr >
                    <td id="td1"><input type="button" id="0" value=""></input> </td>
                    <td id="td2"><input type="button" id="1" value=""></input> </td>
                    <td id="td3"><input type="button" id="2" value=""></input> </td>
                </tr>
                <tr >
                    <td id="td4"><input type="button" id="3" value=""></input> </td>
                    <td id="td5"><input type="button" id="4" value=""></input> </td>
                    <td id="td6"><input type="button" id="5" value=""></input> </td>
                </tr>
                <tr >
                    <td id="td7"><input type="button" id="6" value=""></input> </td>
                    <td id="td8"><input type="button" id="7" value=""></input> </td>
                    <td id="td9"><input type="button" id="8" value=""></input> </td>
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
            <input type="text" id="debug" value=""></input>
            <br />
            <label>Victory:</label>
            <input type="text" id="victoryLabel" value=""></input>

            <script type="text/javascript">
                $(document).ready(function(){

                    // Definindo variável para jogador
                    var player = "";
                    var result = "";

                    game = ["","","","","","","","","" ];
                    
                    // guarda se teve alguma vitória
                    victory = false;

                    // @ToDo ver link: http://thingsilearned.com/2009/06/02/tictactoe-in-jquery/

                    if (!victory){
                        $("#0").click(function(){
                            nextTurn("#0");
                        });
                        $("#1").click(function(){
                            nextTurn("#1");
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
                    }
                    /**
                     * faz a limpeza de todos os campos da tela e do vetor que armazena quem fez as jogadas.
                     */
                    if ($("#cleanAll").click(function(){
                        this.game = ["","","","","","","","","" ];
                        var buttonName = "#";
                        var inputs = document.getElementsByTagName("input");
                        for (var i = 0; i<=inputs.length; i++){
                            buttonName = "#"+i;
                            ($(buttonName).val(""));
                        }
                        
                        debugValue();
                    }))
                  
                    /**
                     * Função que atribui o valor ao evento chamado.
                     * $param = objeto passado para receber tratamento.
                     */
                    function nextTurn(param){
                        if ($(param).val() == "")
                        {
                            // guarda qual é o turno do jogador:
                            
                            if ($("#player").val() == "O")
                                player= "X";
                            else
                                player= "O";
                            ($(param).val(player));
                            ($("#player").val(player));
                            
                            //Informa qual é o próximo jogador.
                            var value = param.replace("#", "");
                            playerMove(value);
                            
                            debugValue();
                            // Seta se já teve ganhador:
                            
                            result = hasWinner();
                            // Verifica se já teve um ganhador, e informa quem foi.
                            if (this.victory)
                                this.endGame();
                        }
                    }
                    
                    /**
                     * Verifica se é possível do jogador realizar a jogada.
                     */
                    function playerMove(id){
                        if (!this.game[id] && !this.victory) 
                            this.game[id] = player;
                    }
                    
                    // Tipos de vitória possível dentro de um tabuleiro de Jogo da Velha
                    victoryTypes: [ [0,1,2], [3,4,5], [6,7,8], [0,3,6], [1,4,7], [2,5,8], [0,4,8], [2,4,6] ];
                    
                    /**
                     * Verifica se já teve um ganhador.
                     */
                    function hasWinner(){
                        for (value in this.victoryTypes)
                        {
                            var search = this.victoryTypes[value];
                            var found = this.game[search[0]] + this.game[search[1]] + this.game[search[2]];
                            
                            alert(found);
                            if (found == "XXX")
                                return "X";
                            
                            else if (found == "OOO")
                                return "O";
                            
                            this.victory = true;
                        }
                        
                        // verifica se todos os campos foram preenchidos, se sim, então foi um jogo da velha.
                        var center = 0;
                        for (s in this.game) {
                            if (this.game[s]) 
                                center+=1; 
                        }
                        if (center == 9) {
                            this.result = "Velha";  
                            endGame();
                        }
                    }
                    
                    /**
                     * Verifica se ainda é possível executar o jogo.
                     */
                    function endGame(){
                        if (this.result == "Velha"){
                            ($("#player").val("Deu jogo da velha!"));
                            this.victory = true;
                        }
                        else{
                            ($("#player").val("O jogador "+ ($("#player")).val() + " ganhou!"));
                            this.victory = true;
                        }
                    }
                    
                    /**
                     *Faz o debug de valores:
                     *
                     */
                    function debugValue(){
                        ($("#debug").val(game));
                    }
                });
            
            </script>
        </form>
    </body>
</html>

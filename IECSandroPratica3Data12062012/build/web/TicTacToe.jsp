<%-- 
    Document   : TicTacToe
    Created on : 17/06/2012, 17:58:05
    Author     : Gustavo Souza Gonçalves 
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
            <input type="label" id="player" value="O" disabled="true"></input>
            <br />

            <!--             Área de Debug 
                        <label>Debug:</label>
                        <input type="text" id="debug" value=""></input>
                        <br />
                        <label>Victory:</label>
                        <input type="text" id="victoryLabel" value=""></input>-->

            <script type="text/javascript">
                $(document).ready(function(){

                    // Fields Region
                    
                    // Initializing player                    
                    if ($("#player").val() == ""){
                            ($("#player").val("X"));
                        }
                    
                    // Defining player
                    var player = "X";

                    // Types of victory. Represents which fields is a win situation
                    victoryTypes = [ [0,1,2], [3,4,5], [6,7,8], [0,3,6], [1,4,7], [2,5,8], [0,4,8], [2,4,6] ];

                    // Start the board with no field checked
                    game = ["","","","","","","","","" ];
                    
                    // Initializes with no victory
                    victory = false;

                    // End Fields Region

                    // Methods and Functions Region
                    
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
                    
                    /**
                     * Clean fields and board game. Also, tells than there's no victory yet.
                     */
                    if ($("#cleanAll").click(function(){
                        this.game = ["","","","","","","","","" ];
                        var buttonName = "#";
                        var inputs = document.getElementsByTagName("input");
                        for (var i = 0; i<=inputs.length; i++){
                            buttonName = "#"+i;
                            ($(buttonName).val(""));
                        }
                        victory = false;
                        
                    }))
                  
                    /**
                     * Attributes value to call button
                     * $param = assignature's object
                     */
                    function nextTurn(param){
                        if (($(param).val() == "") && !victory)
                        {
                            // who's actual player
                            ($("#player").val(player));
                        
                            if ($("#player").val() == "O")
                                player = "X";
                            else
                                player = "O";

                            //assign player
                            ($(param).val(player));
                          
                            //assign player into the board
                            var value = param.replace("#", "");
                            playerMove(value);
                              
                            // Check if there's a winner
                            this.player = hasWinner();
                            checkEndGame();
                            
                        }
                    }
                    
                    /**
                     * Check if player can make next move on the board
                     */
                    function playerMove(id){
                        if (!this.game[id] && !this.victory) 
                            this.game[id] = player;
                    }
                    
                    /**
                     * Check if there's a winner
                     */
                    function hasWinner(){
                        // if every board field is checked, then its an old lady game (Tic Tac Toe!)
                        var center = 0;
                        for (s in this.game) {
                            if (this.game[s]) 
                                center+=1; 
                        }
                        if (center == 9) {
                            return "Velha";
                            checkEndGame();
                        }
                        
                        for (value in victoryTypes)
                        {
                            var search = this.victoryTypes[value];
                            var found = this.game[search[0]] + this.game[search[1]] + this.game[search[2]];
                            
                            if (found == "XXX")
                            {
                                this.victory = true;
                                return "X";
                                checkEndGame();
                            }
                            else if (found == "OOO")
                            {
                                this.victory = true;
                                return "O";
                                checkEndGame();
                            }
                        }
                    }
                    
                    /**
                     * End this TTT game
                     */
                    function checkEndGame(){
                        if (this.player.toString() == "Velha")
                            result = "Deu jogo da velha!";
                        else
                            result = "O jogador "+ this.player.toString() + " ganhou!";
                        ($("#player").val(result));
                        alert(result);
                    }
                    
                    // End Region Methods and Functions 
                });
            
            </script>
        </form>
    </body>
</html>

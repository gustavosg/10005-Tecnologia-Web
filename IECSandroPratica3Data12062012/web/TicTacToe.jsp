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
                <tr>
                    <td><input type="button" id="button1" value="" onclick="disableThis (this)"></input> </td>
                    <td><input type="button" id="button2" value="" onclick="disableThis(this)"></input> </td>
                    <td><input type="button" id="button3" value=""></input> </td>
                </tr>
                <tr>
                    <td><input type="button" id="button4" value=""></input> </td>
                    <td><input type="button" id="button5" value=""></input> </td>
                    <td><input type="button" id="button6" value=""></input> </td>
                </tr>
                <tr>
                    <td><input type="button" id="button7" value=""></input> </td>
                    <td><input type="button" id="button8" value=""></input> </td>
                    <td><input type="button" id="button9" value=""></input> </td>
                </tr>
            </table>

            <!-- Jogador atual -->
            <label>Vez do jogador: </label>
            <input type="label" id="player" value="O"></input>

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
                    //var arr = [1,2,3,4,5,6,7,8,9];
                    $("#button1").click(function(){
                        attrValue("#button1");
                    });
                    $("#button2").click(function(){
                        attrValue("#button2");
                    });
                    $("#button3").click(function(){
                        attrValue("#button3");
                    });
                    $("#button4").click(function(){
                        attrValue("#button4");
                    });
                    $("#button5").click(function(){
                        attrValue("#button5");
                    });
                    $("#button6").click(function(){
                        attrValue("#button6");
                    });
                    $("#button7").click(function(){
                        attrValue("#button7");
                    });
                    $("#button8").click(function(){
                        attrValue("#button8");
                    });
                    $("#button9").click(function(){
                        attrValue("#button9");
                        
                    });
                   
                 
                 /**
                  * Função que atribui o valor ao evento chamado.
                  * 
                  * $param = objeto passado para receber tratamento.
                  */
                 function attrValue(param){
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
                        
                        }
                    }  
                });
            
            </script>
        </form>
    </body>
</html>

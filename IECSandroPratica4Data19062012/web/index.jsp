<%-- 
    Document   : index
    Created on : 19/06/2012, 20:17:43
    Author     : Gustavo

TODO Links Interessantes:
http://stackoverflow.com/questions/5868850/creating-list-of-objects-in-javascript
http://www.htmlgoodies.com/beyond/javascript/javascript-tutorial-functions-and-classes.html
http://www.phpied.com/3-ways-to-define-a-javascript-class/
                      
                     
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <script src="functions/jquery.js" type="text/javascript"></script>

        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <input type="text" id="Random" ></input>
        <button id="doClick">Hello</button>
        <script type="text/javascript">
            $(document).ready(function(){
                if ($("#doClick").click(
                function(){
                    // Valor Randomico de 1 à 6
                    ($("#Random").val("Random: " + Math.ceil(Math.random()*6))) ;
                    // Setando um jogador:
                    player1 = new Player(1, "Gustavo", null, 0, 0);
                    //alert(player1.toString());
                    // Criando uma lista de propriedades:
                    var properties = [];
                    // Setando cada Propriedade
                   
//                   var list = [
//    { date: '12/1/2011', reading: 3, id: 20055 },
//    { date: '13/1/2011', reading: 5, id: 20053 },
//    { date: '14/1/2011', reading: 6, id: 45652 }
//];

                    
                    properties.push({ id : 1, name : "Parque", Value: 1000, Rent: 100, Sell: 700 });
                    alert(properties.listProperties());
                })
            );
            });
            
            function listProperties(){
                with (this) return ("id: " + id + ", Name: "+ Parque + ", Valor: " + Value + ", Aluguel: " + Rent + ", Venda: " + Sell);
            }
            
            function Player(id, name, owner, money, position){
                this.id = id;
                this.name=name;
                this.owner = owner;
                this.money = money;
                this.position = position;
                this.toString = function(){
                    return ("ID: " + id + ", name: " + name + ", owner: "+ owner + ", money: "+ money + ", position: "+ position);
                }
                
            }

            
        </script>
    </body>
</html>

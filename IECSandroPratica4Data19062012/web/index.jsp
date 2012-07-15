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
                    // TODO Nomear as propriedades:
                    // Criando uma lista de propriedades:
                    var properties = [
                        { id: 1, Name: "Início", Value: 0, Rent: 0, Sell: 0 },
                        { id: 2, Name: "Residêncial Gameleira", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 3, Name: "Lanchonete Davi", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 4, Name: "Roubo do Governo", Value: 0, Rent: 10, Sell: 200},
                        { id: 5, Name: "Restaurante Almeida", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 6, Name: "Pousada Santo Descanso", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 7, Name: "Cinema Soho", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 8, Name: "Praça de Esportes Boa Saúde", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 9, Name: "Chance", Value: 0, Rent: 0, Sell: 0},
                        { id: 10, Name: "Parque Crianças Felizes", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 11, Name: "Prisão", Value: 0, Rent: 0, Sell: 0 },
                        { id: 12, Name: "Fina Decoração! Cama, Mesa e Banho", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 13, Name: "Supermercado Preço bom", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 14, Name: "Madeireira Amazônica", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 15, Name: "Igreja do Santo Dízimo", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7 },
                        { id: 16, Name: "Chance", Value: 0, Rent: 0, Sell: 0},
                        { id: 17, Name: "Cemig", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 18, Name: "Hospital Mater Dei", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 19, Name: "Parque Hopi Hare", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 20, Name: "Paint Ball Camper free!", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 21, Name: "Taxi", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 22, Name: "Casa da Carne Boi Feliz", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7 },
                        { id: 23, Name: "Chance", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7 },
                        { id: 24, Name: "Posto de Saúde", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 25, Name: "Mecânica Solamento", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 26, Name: "Ristorant Buon Giourno", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 27, Name: "Chance", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7 },
                        { id: 28, Name: "Lotérica boa sorte", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 29, Name: "Drogaria Santo Antônio", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 30, Name: "Loja de Games Virtual Plan", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 31, Name: "Vá para Prisão", Value: 0, Rent: 0, Sell: 0 },
                        { id: 32, Name: "Residêncial Bom Pastor", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 33, Name: "Lanchonete Guga's Delicatessen", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 34, Name: "Financie seu carro!", Value: 0, Rent: 10, Sell: 200},
                        { id: 35, Name: "Restaurante Comida Caseira", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 36, Name: "Pousada Retiro do José", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 37, Name: "Cinema Old Movies", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 38, Name: "Praça de Esportes Health First", Value: 1000, Rent: Value / 10, Sell: Value / 10 * 7},
                        { id: 39, Name: "Chance", Value: 0, Rent: 0, Sell: 0},

                        
                    ];
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

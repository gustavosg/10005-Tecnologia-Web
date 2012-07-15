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
                    var random = Math.ceil(Math.random()*39);
                    var properties = [
                        new Property(1, 'Início', 0, 0, 0 ),
                        new Property(2,"Residêncial Gameleira",1000,13,10),
                        new Property(3,"Lanchonete Davi",1000,10,10),
                        new Property(4,"Roubo do Governo",0,10,200),
                        new Property(5,"Restaurante Almeida",1000,15,10),
                        new Property(6,"Pousada Santo Descanso",1000,8,10),
                        new Property(7,"Cinema Soho",1000,10,10),
                        new Property(8,"Praça de Esportes Boa Saúde",1000,10,10),
                        new Property(9,"Chance",0,0,0),
                        new Property(10,"Parque Crianças Felizes",1000,10,10),
                        new Property(11,"Prisão",0,0,0),
                        new Property(12,"Fina Decoração! Cama, Mesa e Banho",1000,10,10),
                        new Property(13,"Supermercado Preço bom",1000,10,10),
                        new Property(14,"Madeireira Amazônica",1000,2,10),
                        new Property(15,"Igreja do Santo Dízimo",1000,10,10 ),
                        new Property(16,"Chance",0,0,0),
                        new Property(17,"Cemig",1000,10,10),
                        new Property(18,"Hospital Mater Dei",1000,10,10),
                        new Property(19,"Parque Hopi Hare",1000,100,10),
                        new Property(20,"Paint Ball Camper free!",1000,10,10),
                        new Property(21,"Taxi",1000,10,10),
                        new Property(22,"Casa da Carne Boi Feliz",1000,10,10 ),
                        new Property(23,"Chance",1000,10,10 ),
                        new Property(24,"Posto de Saúde",1000,10,10),
                        new Property(25,"Mecânica Solamento",1000,10,10),
                        new Property(26,"Ristorant Buon Giourno",1000,10,10),
                        new Property(27,"Chance",1000,10,10 ),
                        new Property(28,"Lotérica boa sorte",1000,10,10),
                        new Property(29,"Drogaria Santo Antônio",1000,10,10),
                        new Property(30,"Loja de Games Virtual Plan",1000,10,10),
                        new Property(31,"Vá para Prisão",0,0,0),
                        new Property(32,"Residêncial Bom Pastor",1000,10,10),
                        new Property(33,"Lanchonete Guga's Delicatessen",1000,10,10),
                        new Property(34,"Financie seu carro!",0,10,200),
                        new Property(35,"Restaurante Comida Caseira",1000,10,10),
                        new Property(36,"Pousada Retiro do José",1000,10,10),
                        new Property(37,"Cinema Old Movies",1000,10,10),
                        new Property(38,"Praça de Esportes Health First",1000,10,10),
                        new Property(39,"Chance",0,0,0)
                    ];
            
                    function Property(id, Name, Value, Rent, Sell){
                        this.id = id;
                        this.Name = Name;
                        this.Value = Value;
                        this.Rent = Value / Rent;
                        this.Sell = Sell;
                    }
                    
                    alert(properties[random].Rent);
                    //($("#Random").val("Random: " + random)) ;
                    //($("#Random").val(properties[random].Name)) ;
                    //alert(properties[random].listProperties());
                    // Setando um jogador:
                    //player1 = new Player(1, "Gustavo", null, 0, 0);
                    //alert(player1.toString());
                    // TODO Nomear as propriedades:
                    // Criando uma lista de propriedades:
                
                    // Setando cada Propriedade
                   
                    //                   var list = [
                    //    { date: '12/1/2011', reading: 3, id: 20055),
                    //    { date: '13/1/2011', reading: 5, id: 20053),
                    //    { date: '14/1/2011', reading: 6, id: 45652 }
                    //];

                    
                })
            );
            });
            
            /**
             * Teste
             */
          
            //            
            //            function Player(id, name, owner, money, position){
            //                this.id = id;
            //                this.name=name;
            //                this.owner = owner;
            //                this.money = money;
            //                this.position = position;
            //                this.toString = function(){
            //                    return ("ID: " + id + "," + name + ", owner: "+ owner + ", money: "+ money + ", position: "+ position);
            //                }
            //                
            //            }

            
        </script>
    </body>
</html>

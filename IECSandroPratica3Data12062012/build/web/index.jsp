<%-- 
    Document   : index
    Created on : 12/06/2012, 21:17:52
    Author     : Gustavo
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <script type="text/javascript"src="functions/jquery.js"></script>
        <title>JSP Page</title>
    </head>
    <body onload="document.getElementById('Nome').focus()">
        <form>
            <label>Nome:</label>
            <input type="text" id="Nome" value="ass" /><br />
            <label>Endereço</label>
            <input type="text" id="Endereco" value="Endereco"/><br />
            <button type="submit" value="Enviar" id="Enviar" >Enviar</button>
            <input type="hidden" id="dictionary" value="ass,asses,asshole,assholes,bastard ,beastial,beastiality,beastility,bestial,bestiality,bitch,bitcher
                   ,bitchers,bitches,bitchin,bitching,blowjob,blowjobs,clit,cock,cocks,cocksuck ,cocksucked ,cocksucker,cocksucking,cocksucks ,cum,cummer,cumming
                   ,cums,cumshot,cunilingus,cunillingus,cunnilingus,cunt,cuntlick ,cuntlicker ,cuntlicking ,cunts,cyberfuc,cyberfuck ,cyberfucked ,cyberfucker,cyberfuckers
                   ,cyberfucking ,damn ,dildo,dildos,dink,dinks,ejaculate,ejaculated,ejaculates ,ejaculating, ejaculatings,ejaculation,fag,fagging,faggot,faggs,fagot,fagots
                   ,fags,fart ,farted ,farting ,fartings ,farts,farty ,felatio ,fellatio,fingerfuck ,fingerfucked ,fingerfucker ,fingerfuckers,fingerfucking ,fingerfucks ,fistfuck
                   ,fistfucked ,fistfucker ,fistfuckers ,fistfucking ,fistfuckings ,fistfucks ,fuck,fucked,fucker,fuckers,fuckin,fucking,fuckings,fuckme ,fucks,fuk,fuks,gangbang,gangbanged 
                   ,gangbangs ,gaysex ,goddamn,hardcoresex ,hell ,horniest,horny,hotsex,jack-off ,jerk-off ,jism,jiz ,jizm ,kock,kondum,kondums,kum,kummer,kumming,kums,kunilingus,lust
                   ,lusting,mothafuck,mothafucka,mothafuckas,mothafuckaz,mothafucked ,mothafucker,mothafuckers,mothafuckin,mothafucking ,mothafuckings,mothafucks,motherfuck,motherfucked
                   ,motherfucker,motherfuckers,motherfuckin,motherfucking,motherfuckings,motherfucks,nigger,niggers ,orgasim ,orgasims ,orgasm,orgasms ,phonesex,phuk,phuked,phuking,phukked
                   ,phukking,phuks,phuq,piss,pissed,pisser,pissers,pisses ,pissin ,pissing,pissoff ,porn,porno,pornography,pornos,prick,pricks ,pussies,pussy,pussys ,shit,shited
                   ,shitfull,shiting,shitings,shits,shitted,shitter,shitters ,shitting,shittings,shitty ,slut,sluts,smut,spunk,twat" ></input>

            <script type="text/javascript" >
                $(document).ready(function() {
                    $("#Enviar").click(
                    function(){
                        if ($("#Nome").val() == "" )
                            alert("Campo nome vazio");
                        if ($("#Endereco:empty").val() == "")
                            alert("Campo endereço vazio");
                        var word = document.getElementById('dictionary').value;
                        var splitWord = word.split(",");
                        var arr = jQuery.makeArray(splitWord);
                        $.each(arr, function(index, item){
                            if ($("#Nome").val() == item.toString() )
                                alert("Campo não pode conter esta palavra");
                        });
                    })
                });
            </script>
        </form>
    </body>
</html>

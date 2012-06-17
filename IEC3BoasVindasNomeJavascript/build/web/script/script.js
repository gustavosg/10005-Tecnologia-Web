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



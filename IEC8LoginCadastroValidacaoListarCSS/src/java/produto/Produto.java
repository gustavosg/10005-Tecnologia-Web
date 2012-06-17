/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;

/**
 *
 * @author Wesley
 */
public class Produto {
  String nome = new String ();
  int unidade = 0;

  public Produto () {
  }

  public String getNome () {
    return nome;
  }

  public void setNome (String nome) {
    this.nome = nome;
  }

  public int getUnidade () {
    return unidade;
  }

  public void setUnidade (int unidade) {
    this.unidade = unidade;
  }  
}

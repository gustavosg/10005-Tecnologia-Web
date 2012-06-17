/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados;

import java.util.LinkedList;
import produto.Produto;

/**
 *
 * @author Wesley
 */
public class BancoDados {
  LinkedList tabela = new LinkedList ();
  
  public BancoDados () {
  }

  public LinkedList getTabela () {
    return tabela;
  }

  public void setTabela (LinkedList tabela) {
    this.tabela = tabela;
  }
  
  public void leProdutos () {
     int i;
     
     for (i = 0; i < 10; i++) {
       Produto p = new Produto ();
       p.setNome ("produto" + i);
       p.setUnidade (i);
       
       this.tabela.add (p);
     }
  }
  
}

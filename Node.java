//Representando Grafos com Lista Ligada (LinkedList)
import java.util.LinkedList;

public class Node {
 
  private int valor;  //valor do nó-vértice
  private LinkedList<Node> listaValoresAdj; //lista com os valores adjacêntes 
  
  public Node(int valor){
    this.valor = valor;
    this.listaValoresAdj = new LinkedList<>(); 
  }
  
  public int getValor(){
    return valor;
  }
  
  public void setValor(int valor){
    this.valor = valor;
  }
  
  public LinkedList<Node> getlistaValoresAdj (){
    return listaValoresAdj;
  }
  
  public void addAdjacentes(Node valorAdj){
    this.listaValoresAdj.add(valorAdj);
    
  }

}
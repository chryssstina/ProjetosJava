import java.util.LinkedList;

public class Grafo{
  
  private LinkedList<Node> listaAdj;
  
  //n representa a quantidade de vértices
  public Grafo (int n){
    listaAdj = new LinkedList<>();
    
    for(int i=0; i<n; i++){
        listaAdj.add(new Node(i));
    }
  }
  
  public void addAresta(int origem, int destino){
    //grafo não dirigido, logo origem e destino são os mesmo
    Node origemNode = listaAdj.get(origem);
    Node destinoNode = listaAdj.get(destino);
    
    origemNode.addAdjacentes(destinoNode);
    destinoNode.addAdjacentes(origemNode);
  }
  
  public void exibirGrafo(){
    //percorre todos os nós-vértices em listaAdj
    for (Node noAtual : listaAdj){
      System.out.println("Vértice "+noAtual.getValor()+ " ->");
      //laço para percorrer os vértices adjacentes ao noAtual
      for (Node adj : noAtual.getlistaValoresAdj()) {
          System.out.print(adj.getValor() + " ");
      }
      System.out.println();
    }
  }
}





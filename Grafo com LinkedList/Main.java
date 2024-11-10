
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
  
        Grafo grafo1 = new Grafo(4);
        
        grafo1.addAresta(0, 1);
        grafo1.addAresta(0, 3);
        grafo1.addAresta(1, 3);
        grafo1.addAresta(2, 0);
        
        grafo1.exibirGrafo();
        
        System.out.println("---------");
        
        Grafo grafo2 = new Grafo(6);
        
        grafo2.addAresta(0,1);
        grafo2.addAresta(0,3);
        grafo2.addAresta(1,2);
        grafo2.addAresta(3,4);
        grafo2.addAresta(3,5);
        
      
        grafo2.exibirGrafo();




  }
}
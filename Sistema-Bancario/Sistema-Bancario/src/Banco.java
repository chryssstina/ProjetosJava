import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nomeBanco;
    private List<Cliente> clientes;

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
        this.clientes = new ArrayList<>();
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void addClientes(Cliente cliente){
        clientes.add(cliente);
    }

    public void exibirListaClientes(){
        System.out.println("LISTA DE CLIENTES");
        for (Cliente clienteAtual : clientes) {
            System.out.println(clienteAtual.getNomeCliente());
        }
    }
    
}

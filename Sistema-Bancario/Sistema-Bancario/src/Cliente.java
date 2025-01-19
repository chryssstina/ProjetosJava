import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nomeCliente;
    private String cpfCliente;
    private List<Conta> contas;
    
    public Cliente(String nomeCliente, String cpfCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.contas = new ArrayList<>();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getCpfCliente() {
        return cpfCliente;
    }
    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void addNovaConta(Conta novaConta){
        contas.add(novaConta);
    }
    public void excluirConta(Conta excluirConta){
        contas.add(excluirConta);
    }
    
    public void contasDoCliente(){
        for (Conta contaAtual : contas) {
            System.out.println(contaAtual.getIdConta());
        }
    }

    public void informacoesCliente(){
        System.out.println("INFORMAÇÕES DO CLIENTE");
        System.out.println("Nome: " +getNomeCliente());
        System.out.println("CPF: " +getCpfCliente());
        System.out.println("Lista de Contas: ");
            contasDoCliente();

    }
}

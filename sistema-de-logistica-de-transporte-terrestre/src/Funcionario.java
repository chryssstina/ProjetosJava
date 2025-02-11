public class Funcionario {
    private String nome;
    private String cpf;
    private String cargo;

    public Funcionario(String nome, String cpf, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
    }

    // ---------- GETTERS e SETTERS --------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // ---------- OUTROS MÉTODOS --------
    public void podeGerenciar(){
        if(cargo.equalsIgnoreCase("Administrador do Sistema")){
            System.out.println("Responsável por organizar a frota disponível para transporte.");
  
        }else if(cargo.equalsIgnoreCase("Administrador")){
            System.out.println("Responsável por cadastrar motoristas vinculados aos veículos e organizar as viagens.");

        }else if(cargo.equalsIgnoreCase("Operador Logístico")){
            System.out.println("Responsável por organizar as operações de transporte, como cadastro e controle de mercadorias, além de cadastrar rotas.");

        }else if(cargo.equalsIgnoreCase("Gestor Financeiro")){
            System.out.println("Responsável por calcular o faturamento correto das operações.");

        }else if(cargo.equalsIgnoreCase("Gerente Operacional")){
            System.out.println("Responsável por gerar relatórios das viagens realizadas e status dos veículos para análise de desempenho.");

        }else if(cargo.equalsIgnoreCase("Gestor de Frota")){
            System.out.println("Responsável por registrar manutenções realizadas nos veículos.");

        }else if(cargo.equalsIgnoreCase("Desenvolvedor")){
            System.out.println("Responsável por representar a estrutura do sistema.");

        }else{
            System.out.println("Cargo inválido! Por favor, verifique.");
        }
    }


    public void exibirInformacoes(){
        System.out.println("Nome: "+getNome()+
                         "\nCPF: " +getCpf()+ 
                         "\nCargo: "+getCargo());
                            podeGerenciar();
    }


}

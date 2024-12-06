package escalonador;

public class Processo {
	
	int id;
	int tempoChegada;
	int tempoExecucao;
	int tempoConclusao;
	int tempoEspera;
	int tempoInicio;
	int tempoTurnArround;
	
	
	public Processo(int id, int tempoChegada, int tempoExecucao) {
		this.id = id;
		this.tempoChegada = tempoChegada;
		this.tempoExecucao = tempoExecucao;
	}
	
	
	
}

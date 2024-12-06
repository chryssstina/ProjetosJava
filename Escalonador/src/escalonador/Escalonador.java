package escalonador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Escalonador do tipo FCFS
//Usar o RANDON para gerar valores aleatórios 
public class Escalonador {

	public static void main(String args[]) {
		List<Processo> processos = new ArrayList<>(); 
		
		processos.add(new Processo(1, 2, 5));
		processos.add(new Processo(2, 6, 5));
		processos.add(new Processo(3, 10, 5));
		processos.add(new Processo(4, 3, 5));
		processos.add(new Processo(5, 7, 5));
		processos.add(new Processo(6, 1, 5));
		
		processos.sort(Comparator.comparingInt(p -> p.tempoChegada));
		
		int tempoAtual = 0;
		for(Processo processoAtual : processos) {
			processoAtual.tempoInicio = Math.max(processoAtual.tempoChegada, tempoAtual);
			processoAtual.tempoConclusao = processoAtual.tempoInicio + processoAtual.tempoConclusao;
			processoAtual.tempoEspera = processoAtual.tempoInicio - processoAtual.tempoChegada;
			processoAtual.tempoTurnArround = processoAtual.tempoConclusao - processoAtual.tempoChegada;
		}
		
		
		System.out.println
		("ID\tChegada\tExecução\tInício\tConclusão\tEspera\tTurnArround");
		int somaEspera = 0, somaTurnArround = 0;
		for(Processo processoAtual : processos) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\n", 
					processoAtual.id, 
					processoAtual.tempoChegada, 
					processoAtual.tempoExecucao,
					processoAtual.tempoInicio,
					processoAtual.tempoConclusao,
					processoAtual.tempoEspera,
					processoAtual.tempoTurnArround);
			
			somaEspera += processoAtual.tempoEspera;
			somaTurnArround += processoAtual.tempoTurnArround;
		}
		
		System.out.printf("\n Tempo médio de espera: " +(double) somaEspera/processos.size());
		System.out.printf("\n Tempo médio de TurnArround: " +(double) somaTurnArround/processos.size());
		
	}
}


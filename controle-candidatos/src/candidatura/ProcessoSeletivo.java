package candidatura;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {

        ArrayList<String> candidatosSelecionados = selecionarCandidatos(2000.0);

        imprimirCandidatos(candidatosSelecionados);
        ligar(candidatosSelecionados);
    }


    /**
     * Analisa a relação entre o salário base e o salário pretendido
     *  e exibe uma mensagem de acordo.
     *
     * @param salarioPretendido o salário pretendido pelo candidato
     */
    static void analisarCandidatos(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if(salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    static void imprimirCandidatos(ArrayList<String> candidatosSelecionados) {
        if(candidatosSelecionados != null) {
            System.out.println("LISTA DE CANDIDATOS SELECIONADOS: ");
            for (String candidato : candidatosSelecionados) {
                System.out.println(" - ".concat(candidato));
            }
        } else {
            System.out.println("SEM CANDIDATOS SELECIONADOS");
        }
    }

    /**
     * Seleciona os candidatos com base no salário base.
     *
     * @param salariobase o salário base
     * @return um ArrayList com os candidatos selecionados, ou null
     * se a lista estiver vazia
     */
    static ArrayList<String> selecionarCandidatos(double salariobase) {
        String [] candidatos = {"João", "Maria", "Pedro", "Ana"};
        ArrayList<String> candidatosSelecionados = new ArrayList<>();
        
        for (String candidato : candidatos) {
            double salarioPretendido = definirSalarioPretendido();

            if(candidatosSelecionados.size() == 4){
                break;
            }
            if(salariobase >= salarioPretendido) {
                candidatosSelecionados.add(candidato);
            }
        }

        if(!candidatosSelecionados.isEmpty()) {
            return candidatosSelecionados;
        } 
        return null;
    }

    /**
     * Gera um salário pretendido aleatório entre 1900 e 2100.
     * @return o salário pretendido
     */
    static double definirSalarioPretendido() {
        return ThreadLocalRandom.current().nextDouble(1900.0, 2100.0);
    }


    /**
     * Simula uma ligação para os candidatos e exibe se cada um
     * atendeu ou não.
     *
     * @param candidatos a lista de candidatos
     */
    static void ligar(ArrayList<String> candidatos) {
        
        if(candidatos != null) {
            System.out.println("LIGANDO PARA OS CANDIDATOS...");
            for(String candidato : candidatos) {
                for(int i = 1; i <= 3; i++) {
                    if(atender() == 1) {
                        System.out.println(candidato.concat(" atendeu na "+ i +"° tentativa"));
                        break;
                    } else if(i == 3){
                        System.out.println(candidato.concat(" NÃO atendeu"));
                    }
                }
            }
        }
    }

    /**
     * Simula o candidato atender ou não uma ligação.
     *
     * @return 1 se atendeu, 0 se não atendeu
     */
    static int atender() {
        return ThreadLocalRandom.current().nextInt(0, 2);
    }
}

import java.util.*;
import java.util.stream.Collectors;

public class MonitoramentoLogsAws {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Map<String, Long> eventosPorServico = new HashMap<>();
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1];
            //TODO: Utilize o mapa para registrar/incrementar o serviço em questão.
            eventosPorServico.put(servico, eventosPorServico.getOrDefault(servico, (long) 0) + 1);
        }
        scanner.close();

        //TODO: Identifique no mapa os serviços com maior e menor quantidade de logs.
        //      Dica: Utilize Java Streams para tornar essa tarefa mais simples.
        String servicoMaisLogado = eventosPorServico.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        String servicoMenosLogado = eventosPorServico.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();

        //TODO: Imprima a saída no padrão definido no enunciado deste desafio.
        System.out.println("Eventos por servico:");
        eventosPorServico.forEach((servico, quantidade) -> {
            System.out.println(servico + ":" + quantidade);
        });
        System.out.println("Maior:"+servicoMaisLogado);
        System.out.println("Menor:"+servicoMenosLogado);
    }
}
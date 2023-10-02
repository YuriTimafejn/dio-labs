import java.util.Scanner;

public class RegrasEKS {
    public static void main(String[] args) {
        // Definindo as regras básicas
        int podsPorNode = 10;
        int podsPorServidor = 4;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        int numeroTotalPods = scanner.nextInt();

        //TODO: Calcule o número mínimo de nodes necessários
        int numeroMinimoNodes = (int) Math.ceil((double)numeroTotalPods / podsPorNode);

        //TODO: Calcule o número mínimo de servidores necessários
        int numeroMinimoServidores = (int) Math.ceil((double)numeroTotalPods / podsPorServidor);
        //System.out.println(numeroMinimoServidores);

        //TODO: Exiba o resultado com as recomendações de quantidades de servidores e nodes.
        System.out.println(numeroMinimoNodes <= 1 ? "1.Recomendamos usar um unico node" : "1.Numero minimo de nodes:" + numeroMinimoNodes);
        System.out.println(numeroMinimoServidores <= 1 ? "2.Recomendamos usar um unico servidor" : "2.Numero minimo de servidores:" + numeroMinimoServidores);
    

        // Fechando o Scanner
        scanner.close();
    }
}
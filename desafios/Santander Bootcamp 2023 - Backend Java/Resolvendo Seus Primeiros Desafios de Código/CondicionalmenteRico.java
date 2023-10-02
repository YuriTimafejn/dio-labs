import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
    int saldoTotal = scanner.nextInt();
    int valorSaque = scanner.nextInt();
    
    int saldoFinal = saldoTotal - valorSaque;

    //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
    if (saldoFinal >= 0) 
      System.out.printf("Saque realizado com sucesso. Novo saldo: %d\n", saldoFinal);
    else
      System.out.println("Saldo insuficiente. Saque nao realizado!");
  }
}
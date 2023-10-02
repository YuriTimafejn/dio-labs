import java.util.Scanner;

public class AbrindoContas {

  public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);
    int numeroConta = scanner.nextInt();
    scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
    String nomeTitular = scanner.nextLine();
    double saldo = scanner.nextDouble();
    scanner.close();

    //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
    ContaBancaria novaConta = new ContaBancaria(numeroConta, nomeTitular, saldo);

    System.out.println("Informacoes:");
    System.out.println(novaConta);
    //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
  }
}

class ContaBancaria {
  int numero;
  String titular;
  double saldo;

  public ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }
  
  @Override
  public String toString() {
    return "Conta: " + numero + "\nTitular: " + titular + "\nSaldo: R$ " + saldo;
  }
}
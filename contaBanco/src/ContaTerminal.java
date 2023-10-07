import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite o número da sua conta e aperte a tecla ENTER");
      int conta = scanner.nextInt();

      System.out.println("Digite o código da sua agência e aperte a tecla ENTER");
      String agencia = scanner.next();

      System.out.println("Escreva seu nome completo e aperte a tecla ENTER");
      String nomeSobrenome = scanner.next();

      System.out.println("Digite o saldo que deseja sacar e aperte a tecla ENTER");
      double saldo = scanner.nextDouble();

      System.out.println("Olá, " + nomeSobrenome + "! " + "Agradecemos por criar uma conta em nosso banco. " + "Sua agência é " + agencia + " e o número de sua conta é " + conta + ". " + "Seu saldo de " + "R$"+ saldo + " já está disponível para saque.");
    }
}

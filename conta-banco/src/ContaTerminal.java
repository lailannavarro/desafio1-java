import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o numero da agência: (123-8)");
        agencia = sc.next();

        System.out.println("Por favor, digite o numero da conta: (1234)");
        numero = sc.nextInt();

        System.out.println("Por favor, informe seu nome: ");
        nomeCliente = sc.next();
        sc.nextLine();

        System.out.println("Informe seu saldo atual: ");
        saldo = sc.nextDouble();

        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco! Sua agencia é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
    
        sc.close();
    }
}

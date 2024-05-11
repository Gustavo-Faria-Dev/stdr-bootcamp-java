import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero = scanner.nextInt();

        System.out.println("Digite a agencia:");
        String agencia = scanner.next();

        System.out.println("Digite o nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é"
                + agencia + ", conta " + numero + "  e seu saldo" + saldo + " já está disponível para saque");

    }

}

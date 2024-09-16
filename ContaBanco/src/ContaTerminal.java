import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int agencia = 0;
        int numero = 0;
        String nomeCliente = "";
        double saldo = 0.0d;
        try {
            System.out.println("Obrigado por escolher o Banco DIO");
            System.out.println("Por favor, digite o número da Agência !");
            agencia = scanner.nextInt();

            System.out.println("Digite o número da conta");
            numero = scanner.nextInt();

            System.out.println("Digite seu nome");
            nomeCliente = scanner.next();

            System.out.println("Digite seu saldo/depósito inicial");
            saldo = scanner.nextDouble();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}

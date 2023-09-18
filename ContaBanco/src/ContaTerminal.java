import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número da agência: ");
        String agencia = scanner.next();
        
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();
        
        System.out.print("Digite o saldo da conta: ");
        double saldoConta = scanner.nextDouble();
        
        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de $" + saldoConta + " já está disponível para saque.");
    }
}
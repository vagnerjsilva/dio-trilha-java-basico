import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        Double saldo;

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = sc.nextLine();
        System.out.print("Por favor, digite o número da conta: ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = sc.nextLine();
        
        System.out.print("Por favor, digite o Saldo: ");
        saldo = sc.nextDouble();

        
        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é" 
                            + agencia +", conta " + numero + " e seu saldo " + saldo 
                            + " já esta disponivel para saque.");

    }
}

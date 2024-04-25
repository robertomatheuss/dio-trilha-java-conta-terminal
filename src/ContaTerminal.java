import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite a agencia da conta: ");
        String agencia = scanner.nextLine();
        
        System.out.println("Digite o numero da conta: ");
        Integer numero = scanner.nextInt();

        System.out.println("Digite o saldo da conta: ");
        Double saldo = scanner.nextDouble();

        Conta conta = new Conta(numero, agencia, nome, saldo);
        
    }
}

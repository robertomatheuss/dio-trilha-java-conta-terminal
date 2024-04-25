import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in).useLocale(Locale.US)){
            System.out.println("Digite o nome: ");
            String nome = scanner.nextLine();
            
            System.out.println("Digite a agencia da conta: ");
            String agencia = scanner.nextLine();
            
            System.out.println("Digite o numero da conta: ");
            Integer numero = scanner.nextInt();
    
            System.out.println("Digite o saldo da conta: ");
            Double saldo = scanner.nextDouble();
    
            Conta conta = new Conta(numero, agencia, nome, saldo);    
            System.out.println("Olá "+conta.getNome()+", obrigado "+
                "por criar uma conta em nosso banco, sua agência é "+ conta.getAgencia()+
                ",conta é "+conta.getNumero()+" e seu saldo de R$" +conta.getSaldo()+" já está disponível para saque");
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }
    }
}

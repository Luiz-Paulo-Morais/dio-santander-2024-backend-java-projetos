import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        
        //inserir informacoes

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.next();        
        
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();
               
        System.out.println("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();              

                
        //exibir informacoes inseridas
        
       System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo R$ "+saldo+" já está disponível para saque");



    }
}

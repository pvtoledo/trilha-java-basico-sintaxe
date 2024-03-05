import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        conta.numero = scanner.nextInt();

        System.out.println("Por favor, digite a Agência:");
        conta.agencia = scanner.next();
        scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do cliente:");
        conta.nomeCliente = scanner.nextLine();
        

        System.out.println("Por favor, digite o saldo:");
        conta.saldo = scanner.nextDouble();
        

        System.out.println(
            "Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + ", conta " + conta.numero + 
            " e seu saldo " + conta.saldo + " já está disponível para saque.");
        scanner.close();
    }
}
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seus dados aqui em baixo : ");
        System.out.printf("Qual numero da conta  : ");
        int conta = scan.nextInt();
        scan.nextLine();

        System.out.printf("Qual é  a agencia : ");
        String agencia = scan.next();
        scan.nextLine();

        System.out.printf("Qual é o seu nome : ");
        String nome = scan.nextLine();

        System.out.printf("Qual é seu saldo : ");
        double saldo = scan.nextDouble();

        System.out.printf("Olá [%s], obrigado por criar uma conta em nosso banco, sua agência é [%s], conta [%d] e seu saldo [%.2f] já está disponível para saque",nome,agencia,conta,saldo);



    }
}
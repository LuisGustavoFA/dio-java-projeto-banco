import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();

        sc.nextLine();
        System.out.print("Digite a agência da conta: ");
        String agencia = sc.nextLine();

        System.out.print("Digite o nome do proprietário da conta: ");
        String nome = sc.nextLine();

        System.out.print("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}

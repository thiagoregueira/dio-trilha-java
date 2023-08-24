import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        ContaTerminal conta = new ContaTerminal();
        System.out.println("Digite o numero da conta: ");
        conta.setNumero(sc.nextInt());
        sc.nextLine();
        System.out.println("Digite a agencia: ");
        conta.setAgencia(sc.nextLine());
        System.out.println("Digite seu nome: ");
        conta.setNomeCliente(sc.nextLine().toUpperCase());
        System.out.println("Deseja abrir com algum valor inicial?: ");
        conta.setSaldo(sc.nextDouble());

        sc.close();

        System.err.println("Olá " + conta.getNomeCliente()
                + " obrigado por criar uma conta em nosso banco, sua agência eh " + conta.getAgencia()
                + " e seu numero eh " + conta.getNumero() + " e o seu saldo eh " + conta.getSaldo());
    }
}

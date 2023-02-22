import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência!");
        int Numero = sc.nextInt();
        System.out.println("Por favor, digite a Agência!");
        String Agencia = sc.next();
        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = sc.next();
        System.out.println("Por favor, digite seu sobrenome!");
        String sobrenomeCliente = sc.next();
        System.out.println("Por favor, digite o seu saldo.");
        double Saldo = sc.nextDouble();
        sc.close();
        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente +  ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo, de " + Saldo + " já está disponível para saque.");
}
}

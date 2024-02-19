import java.util.Scanner;

public class contaTerminal {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        String age,nome;
        double saldo;
        System.out.println("Por favor, digite o número da Agência !");
        num = sc.nextInt();
        System.out.println("Por favor, digite a sua Agência !");
        age = sc.next();
        System.out.println("Por favor, digite o seu Nome !");
        nome = sc.next();
        System.out.println("Por favor, digite o seu Saldo !");
        saldo = sc.nextDouble();
        sc.close();
        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é " + age + ", conta "+ num +" e seu saldo " + saldo + "já está disponível para saque");
    }
}
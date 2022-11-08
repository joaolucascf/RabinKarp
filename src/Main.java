import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o texto a ser analisado");
        String text = sc.nextLine();
        System.out.println("Digite o padrão a ser analisado no texto");
        String pattern = sc.nextLine();
        sc.close();
        RabinKarp test = new RabinKarp(pattern, text);
        test.check();
    }
}
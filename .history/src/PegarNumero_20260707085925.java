import java.util.Scanner;
public class PegarNumero {
    Scanner scanner = new Scanner(System.in);
    double n1;
    double n2;

    public void PegarNumero(){
    System.out.println("Primeiro número: ");
    n1 = scanner.nextInt();
    System.out.println("Segundo número: ");
    n2 = scanner.nextInt();
    }
}

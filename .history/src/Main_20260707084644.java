import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 char continuar = 'S';
 int opcao;
 do {
     // 1. Exibir Menu Principal
    System.out.println("=================================");
    System.out.println(" SISTEMA APRENDA & CALCULE");
    System.out.println("=================================");
    System.out.println("1. Menu Calculadora");
    System.out.println("2. Guia de Conceitos");
    System.out.println("3. Sair do Sistema");
    System.out.println("=================================");
    System.out.println("Escolha uma opção:");
    opcao = scanner.next().toUpperCase().charAt(continuar)



 // 2. Capturar opção com Switch-Case
 // 3. Executar a lógica escolhida
 // 4. Perguntar se deseja continuar
 System.out.print("\nDeseja ir menu principal? (S/N): ");
 continuar = scanner.next().toUpperCase().charAt(0);

 } while (continuar == 'S');
 System.out.println("Sistema encerrado. Bons estudos!");
 scanner.close();
 }
}

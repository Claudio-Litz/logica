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

    // 2. Capturar opção com Switch-Case
    opcao = scanner.nextInt();
    switch (opcao) {
        case 1:
            System.out.println("=================================");
            System.out.println("    Escolha uma operação");
            System.out.println("=================================");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potencia");
            System.out.println("6 - raiz");
            System.out.println("");
            System.out.println("9 - Funções especiais");
            System.out.println("=================================");
            opcao1


            break;
        case 2:

        case 3:

    }

 
 // 3. Executar a lógica escolhida
 // 4. Perguntar se deseja continuar
 System.out.print("\nDeseja ir menu principal? (S/N): ");
 continuar = scanner.next().toUpperCase().charAt(0);

 } while (continuar == 'S');
 System.out.println("Sistema encerrado. Bons estudos!");
 scanner.close();
 }
}

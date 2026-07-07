import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
    Calculadora C;
    Diversao D;
     try (Scanner scanner = new Scanner(System.in)) {
         char continuar = 'S';
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
             switch (scanner.nextInt()) {
                 case 1:
                     System.out.println("");
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
                     switch (scanner.nextInt()) {
                         case 1:
                            C = new Calculadora();
                            System.out.println("Resultado: " + C.somar());
                            break;
                         case 2:
                            C = new Calculadora();
                            System.out.println("Resultado: " + C.Subtracao());
                            break;
                         case 3:
                            C = new Calculadora();
                            System.out.println("Resultado: " + C.Multiplicacao());
                            break;
                         case 4:
                            C = new Calculadora();
                            System.out.println("Resultado: " + C.Divisao());
                            break;
                         case 5:
                            C = new Calculadora();
                            System.out.println("Resultado: " + C.Potencia());
                            break;
                         case 6:
                            C = new Calculadora();
                            System.out.println("Resultado: " + C.Raiz());
                            break;
                         case 9:
                            System.out.println("");
                            System.out.println("=================================");
                            System.out.println("           Diversão");
                            System.out.println("=================================");
                            System.out.println("1 - Logs");
                            System.out.println("2 - Arcos trigonométricos");
                            System.out.println("3 - Aritimética");
                            System.out.println("4 - Trigonométricas");
                            System.out.println("5 - Exponenciais");
                            System.out.println("6 - Equação");
                            System.out.println("7 - Inequação");
                            System.out.println("8 - Sair");
                            System.out.println("=================================");
                            switch (scanner.nextInt()) {
                                case 1:
                                    System.out.println("1° base");
                                    System.out.println("2° logaritmando");
                                    D = new Diversao();
                                    System.out.println("Resultado: " + D.log());
                                    break;
                                case 2:
                                    System.out.println("=================================");
                                    System.out.println("1 - Arco");
                                    System.out.println("1° base");
                                    break;
                                case 3:
                                    
                                    break;
                                case 4:
                                    
                                    break;
                                case 5:
                                    
                                    break;
                                case 6:
                                    
                                    break;
                                case 7:
                                   
                                    break;
                                case 8:
                                    
                                    break;
                            }

                            break;
                     }
                     break;
                 case 2:
                     // Preguiça de fazer
                 case 3:
                    continuar = 'N';
                    continue;       
             }
             System.out.print("\nDeseja ir menu principal? (S/N): ");
             continuar = scanner.next().toUpperCase().charAt(0);
         } while (continuar == 'S');
         System.out.println("Sistema encerrado. Bons estudos!");
     }
 }
}

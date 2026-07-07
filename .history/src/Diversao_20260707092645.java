import java.util.Scanner;

public class Diversao {
    Scanner scanner = new Scanner(System.in);
    // Atributos privados (Encapsulamento)
    private double numero1;
    private double numero2;

    // Construtor
    public Diversao() {
    System.out.println("Primeiro número: ");
    this.numero1 = scanner.nextDouble();

    System.out.println("Segundo número: ");
    this.numero2 = scanner.nextDouble();
    }

    // Métodos Getters e Setters
    public double getNumero1() { 
        return numero1; 
    }
    
    public void setNumero1(double numero1) { 
        this.numero1 = numero1;  
    }
    
    public double getNumero2() { 
        return numero2; 
    }

    public void setNumero2(double numero2) { 
        this.numero2 = numero2; 
    }


    // Métodos de Operações (Exemplo)
    public double log() {
        return Math.log10(this.numero2)/Math.log10(this.numero1);
    }


}

    import java.util.Scanner; //Biblioteca
    public class Jogo {

    public static void main(String[] args){

    double numeroRandomico = (int)(Math.random() * 100);
    int tentativas = 1; 
    
    System.out.println("Tente adivinhar o numero de 0 a 100!");
    Scanner scanner = new Scanner(System.in); 
    int numeroJogador = scanner.nextInt();

    while (numeroJogador != numeroRandomico){
    tentativas = tentativas + 1;

    if (numeroJogador < numeroRandomico){
    System.out.println("Incorreto! Numero menor que o gerado!");
    numeroJogador = scanner.nextInt();}

    else {
    System.out.println("Incorreto! Numero maior que o gerado!");
    numeroJogador = scanner.nextInt();}    
    }

    System.out.println("Parabens! Voce acertou em "+tentativas);
    
    }
    }
    

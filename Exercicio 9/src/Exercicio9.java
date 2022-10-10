import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[]  args){

        //1) Ação do usuario : Temperatura Fahrenheit 
        //2) Tarefa do programa : Transformar F em Celsius 
        //3) Resposta do programa : Mostrar a temperatura em graus Celsius

        double temperaturaF;
        double temperaturaC;

        System.out.println("Programa de Temperatura. Bem Vindo!");

        Scanner teclado = new Scanner(System.in);
        temperaturaF = teclado.nextDouble();
        teclado.close();

        temperaturaC = 5 * ((temperaturaF-32)/9);

        System.out.print("A temperatura em Celsius é ");
        System.out.print(temperaturaC);

    }
}
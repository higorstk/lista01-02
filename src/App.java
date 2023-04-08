import java.util.Scanner;
class Main{
public static void main(String[] args){
//Passo1:Mostrar variável
double numero;
  System.out.println("Digite o numero");
//Passo2:Entrada de dados
Scanner teclado = new Scanner(System.in);
numero = teclado.nextDouble();
//Passo3:Mostrar resultado
System.out.println("O numero informado foi" +numero);
 }
}

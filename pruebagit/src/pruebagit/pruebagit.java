package pruebagit;


import java.util.Scanner;
public class pruebagit {

public static void main(String[] args){
	int numero=0;
	Scanner teclado=new Scanner(System.in);
	System.out.println("Escribir un n�mero");
	numero=teclado.nextInt();
	System.out.println("El cuadrado del n�mero"+numero+"es: "+numero*numero);
}
}
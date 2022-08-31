/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Miguel
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada	= new Scanner (System.in);
		
		System.out.println("Selecciona que operación deseas hacer... ");
		System.out.println("1 Sumar");
		System.out.println("2 Restar");
		System.out.println("3 Multiplicar");
		System.out.println("4 Dividir");
		
		int valor = entrada.nextInt();
		
		if (valor == 1){
			
			System.out.println("Vamos a sumar...");
			
			Operaciones sumar = new Operaciones ();
			
			System.out.println("Ingrese el primer número: ");
					
			int numeroUno = entrada.nextInt();
			
			System.out.println("Ingrese el segundo número: ");
			
			int numeroDos = entrada.nextInt();
			
			System.out.println("Resultado: " + sumar.suma(numeroUno,numeroDos));	
			
		}else { 
			if (valor == 2) {
				System.out.println("Vamos a restar...");
				
				Operaciones restar = new Operaciones ();
				
				System.out.println("Ingrese el primer número: ");
						
				int numeroUno = entrada.nextInt();
				
				System.out.println("Ingrese el segundo número: ");
				
				int numeroDos = entrada.nextInt();
				
				System.out.println("Resultado: " + restar.resta(numeroUno,numeroDos));
				
			} else {
				if(valor == 3) {
					System.out.println("Vamos a Multiplicar...");
					
					Operaciones multi = new Operaciones ();
					
					System.out.println("Ingrese el primer número: ");
							
					int numeroUno = entrada.nextInt();
					
					System.out.println("Ingrese el número de veces a multiplicar: ");
					
					int numeroDos = entrada.nextInt();
					
					System.out.println("Resultado: " + multi.multiplicacion(numeroUno,numeroDos));
				}else {
					System.out.println("Vamos a Dividir...");
					
					Operaciones dividir = new Operaciones ();
					
					System.out.println("Ingrese el primer numerador: ");
							
					int numeroUno = entrada.nextInt();
					
					System.out.println("Ingrese el denomidanor: ");
					
					int numeroDos = entrada.nextInt();
					
					System.out.println("Resultado: " + dividir.divicion(numeroUno,numeroDos));
				}
			}
		}
		
		
			 
		
	}

}


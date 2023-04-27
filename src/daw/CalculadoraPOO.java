package daw;

//import es.daw.util.Utilidades;
//import es.daw.util.Operaciones;
import daw.util.*;
import java.util.Scanner;

public class CalculadoraPOO {
    
    static Scanner sc = new Scanner(System.in);
    static float num1, num2;

    public static void main(String[] args) {

        //Variable donde almacenamos el valor seleccionado del menú

        int opcion;
        //Por ahora, es normal si no se comprenden estas dos líneas de código.

        do {
            //1 pintar menu
            Utilidades.pintaMenu();
          
            //Estas líneas de código nos permiten leer del teclado y transformar el valor leído de String a int
            // 1) Recoger el valor escrito en el teclado
            // 2) Transformar esa cadena de caracteres en un valor entero
            //opcion = Integer.parseInt(sc.nextLine());
            opcion =sc.nextInt();

            //Si la opcion es menor que 0 o mayor que 5, no es una opción válida
            if (opcion < 0 || opcion > 5) {
                String ERROR = "Opción no válida. Vuelva a poner otra correcta (del 0 al 5 incluidos)";
				System.out.println(ERROR);
                
            //Si la opcion es diferente a cero, solicitamos los dos operandos             
            } else if (opcion != 0) {
            	   System.out.print("Introduzca el primer operando: ");
				   num1 =sc.nextFloat();
				
				   System.out.print("Introduzca el segundo operando: ");
				   num2 =sc.nextFloat();
				
				   System.out.println("\n");
				   System.out.println("\n"); 
                   
                switch (opcion) {
                    case 1: //Suma
                        System.out.println("El resultado de la suma es " + Operaciones.sumar(num2,num1));
                        break;  
                        
                    case 2: //Resta
                        System.out.println("El resultado de la resta es " + Operaciones.restar(num1 , num2));
                        break;
                        
                    case 3: //Multiplicación
                        System.out.println("El resultado de la multiplicación es " + Operaciones.multiplicar(num1 , num2));
                        break;
                        
                    case 4: //División
                        System.out.println("El resultado de la división es " + Operaciones.dividir(num1, num2));
                        break;
                        
                    case 5: //Resto
                        System.out.println("El resto de dividir " + num1 + " entre " + num2 + " es " + daw.util.Operaciones.resto(num1 , num2));
                        break;
                }
            }
        } while (opcion != 0);

        sc.close();

        System.out.println("Saliendo de la calculadora");

    }
    
}
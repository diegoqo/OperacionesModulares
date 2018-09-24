package Entradas;

import Operaciones.Multiplicacion;
import Operaciones.OperacionesEnum;
import Operaciones.Resta;
import Operaciones.Suma;
import validaciones.Validaciones;

import java.util.Scanner;

public class Entradas {
    public int PintarOperaciones(){
        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println("Operaciones Modulares");
        System.out.println("-------------------------\n");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División\n\n");
        System.out.println("Ingrese el número de la operación: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        return choice;
    }
    public void Entrada1(int operacion){
        String codOperacion = Integer.toString(operacion);
        String descripcionOperacion = OperacionesEnum.getOperacion(codOperacion).get().getDescripcion();
        System.out.println("Ingrese el primer valor para la " + descripcionOperacion + ": \n");
        Scanner scannerS = new Scanner(System.in);
        int a = scannerS.nextInt();
        Validaciones validacion1 = new Validaciones();
        if(validacion1.validacionNegativo(a)){
            Entrada2(a, descripcionOperacion);
        }
        else{
            System.out.println("El valor ingresado es menor que 0 \n");
            Entrada1(operacion);
        }
    }

    public void Entrada2(int a, String descripcionOperacion){
        System.out.println("Ingrese el segundo valor para la "+ descripcionOperacion + ": \n");
        Scanner scannerS = new Scanner(System.in);
        int b = scannerS.nextInt();
        Validaciones validacion1 = new Validaciones();
        if(validacion1.validacionNegativo(a)){
           EntradaZn(a,b, descripcionOperacion);
        }
        else{
           System.out.println("El valor ingresado es menor que 0 \n");
           Entrada2(a, descripcionOperacion);
        }
    }

    public void EntradaZn(int a, int b, String descripcionOperacion){
        System.out.println("Ingrese el Zn: \n");
        Scanner scannerS = new Scanner(System.in);
        int z = scannerS.nextInt();
        Validaciones validaZ = new Validaciones();
        if(validaZ.validacionZn(a,b,z)){
            if(descripcionOperacion.equals("suma")){
                Suma suma = new Suma();
                int resultado = suma.Sumar(a, b, z, descripcionOperacion);
                System.out.println("-------------------> Resultado <------------------- \n");
                System.out.println(a +" " + descripcionOperacion+ " modular " + b + " = " + resultado);
            }
            else if(descripcionOperacion.equals("resta")){
                Resta resta = new Resta();
                int resultado = resta.Restar(a, b, z, descripcionOperacion);
                System.out.println("-------------------> Resultado <------------------- \n");
                System.out.println(a +" " + descripcionOperacion+ " modular " + b + " = " + resultado);
            }
            else if(descripcionOperacion.equals("multiplicación")){
                Multiplicacion multiplicacion = new Multiplicacion();
                int resultado = multiplicacion.Multiplicar(a, b, z, descripcionOperacion);
                System.out.println("-------------------> Resultado <------------------- \n");
                System.out.println(a +" " + descripcionOperacion+ " modular " + b + " = " + resultado);
            }
            else if(descripcionOperacion.equals("división")){
                Multiplicacion multiplicacionReciproco = new Multiplicacion();
                int resultadoReciproco = multiplicacionReciproco.MultiplicarReciproco(b, z);
                if(resultadoReciproco != -1){
                    System.out.println("---------* El reciproco de "+ b +" es: "+ resultadoReciproco +" *---------\n");
                    Multiplicacion multiplicacionAConReciproco = new Multiplicacion();
                    System.out.println(a +" " + descripcionOperacion+ " modular " + b + " = " +
                             a +" multiplicación modular "+ resultadoReciproco);
                    int resultadoAConReciproco = multiplicacionAConReciproco.Multiplicar(
                            a,resultadoReciproco,z,descripcionOperacion);
                    System.out.println("---------* "+ a +" multiplicación modular "+ resultadoReciproco + " = " +
                            resultadoAConReciproco + " *---------\n\n");
                    System.out.println("-------------------> Resultado <------------------- \n");
                    System.out.println(a +" " + descripcionOperacion+ " modular " + b + " = " + resultadoAConReciproco);
                }
                else{
                    System.out.println("\033[0;1m"+"-------------------> Resultado <------------------- \n");
                    System.out.println(b +" no tiene un elemento invertible dentro de Zn = "+ z +" por lo cual la división" +
                            " no tiene solución");
                }

            }
        }
        else{
            System.out.println("----> En valor de Zn debe ser mayor a 0 y cumplir la propiedad: \n");
            System.out.println("----> mod n => Zn = {0,1,2,..., n-1} \n");
            EntradaZn(a,b, descripcionOperacion);
        }
    }
}

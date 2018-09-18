package operacionesmodulares;

import Entradas.Entradas;

import java.util.InputMismatchException;

public class ProcesoGeneral {
    public void ProcesoOperaciones() {
        try {
            switch (new Entradas().PintarOperaciones()) {
                case 1:
                    Entradas entradaSuma = new Entradas();
                    entradaSuma.Entrada1(1);
                    break;
                case 2:
                    Entradas entradaResta = new Entradas();
                    entradaResta.Entrada1(2);
                    break;
                case 3:
                    Entradas entradaMultiplicacion = new Entradas();
                    entradaMultiplicacion.Entrada1(3);
                    break;
                default:
                    System.out.println("Entrada no valida \n\n");
                    ProcesoGeneral procesoGeneral = new ProcesoGeneral();
                    procesoGeneral.ProcesoOperaciones();
                    break;
            }
        }
        catch (InputMismatchException in){
            System.out.println("El caracter ingresado no es válido \n\n");
            ProcesoGeneral procesoGeneral = new ProcesoGeneral();
            procesoGeneral.ProcesoOperaciones();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author Estudiante
 */
public class Multiplicacion {
    public int Multiplicar(int a, int b, int zs, String descripcionOperacion){
        System.out.println(a +" " + descripcionOperacion+ " modular " + b +"\n");
        System.out.println(a +" " + descripcionOperacion+ " modular " + b +" = " +
                + (a*b) +" mod "+ zs +"\n");
        System.out.println((a*b) +" = q" + zs + " + r \n");
        for(int i=0; i<zs; i++ ){
            int res = ((a*b) - i) % zs;
            System.out.println("    Iterando con r = "+ i +"\n");
            System.out.println("    "+((a*b) - i) +" / "+ zs +" = q \n");
            System.out.println("    q = "+ res +"\n");
            if(res == 0){
            return i;
            }
            res=0;            
        }
        System.out.println("-------------------------------------- \n");
        return a;
    }

    public int MultiplicarReciproco(int b, int zs){
        for(int i=0; i<zs; i++ ){
            System.out.println(b +" multiplicación modular " + i +" = " +
                    + (b*i) +" mod "+ zs +"\n");
            for(int j=0; j<=zs; j++){
                int res = ((b*i) - j) % zs;
                System.out.println("    Iterando con r = "+ j +"\n");
                System.out.println("    "+ ((b*i) - j) +" / "+ zs +" = q \n");
                System.out.println("    q = "+ res +"\n");
                if(res == 0){
                    System.out.println("    "+ (b*i) +" mod "+ zs +" = "+ j +"\n");
                    if(j == 1){
                        return i;
                    }
                    break;
                }
                res=0;
            }
        }
        return -1;
    }
    
}

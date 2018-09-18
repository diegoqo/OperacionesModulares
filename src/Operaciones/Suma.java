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
public class Suma {
    public int Sumar(int a, int b, int zs, String descripcionOperacion){
        System.out.println(a +" " + descripcionOperacion+ " modular " + b +"\n");
        System.out.println(a +" " + descripcionOperacion+ " modular " + b +" = " +
                + (a+b) +" mod "+ zs +"\n");
        System.out.println((a+b) +" = q" + zs + " + r \n");
        for(int i=0; i<zs; i++ ){
            int res = ((a+b) - i) % zs;
            System.out.println("Iterando con r = "+ i +"\n");
            System.out.println(((a+b) - i) +" / "+ zs +" = q \n");
            System.out.println("q = "+ res +"\n");
            if(res == 0){
            return i;
            }
            res=0;            
        }
        return a;
    }
    
}

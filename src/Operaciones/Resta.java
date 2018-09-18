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
public class Resta {
    public int Restar(int a, int b, int zs, String descripcionOperacion){
        System.out.println(a +" " + descripcionOperacion+ " modular " + b +"\n");
        System.out.println(a +" " + descripcionOperacion+ " modular " + b +" = " +
                + (a-b) +" mod "+ zs +"\n");
        System.out.println((a-b) +" = q" + zs + " + r \n");
        for(int i=0; i<zs; i++ ){
            int res = ((a-b) - i) % zs;
            System.out.println("Iterando con r = "+ i +"\n");
            System.out.println(((a-b) - i) +" / "+ zs +" = q \n");
            System.out.println("q = "+ res +"\n");
            if(res == 0){
            pruebaResta(a,b,zs);
            return i;
            }
            res=0;            
        }
        return a;
    }
    
    public void pruebaResta(int a, int b, int zs){
        System.out.println("-------------------> PRUEBA RESTA<----------------------\n\n");
        System.out.println("    x = a - b \n");
        System.out.println("    x = "+ a +" - "+ b +" \n");
        System.out.println("Comprobar que: -----------> a = b suma modular x \n");
        System.out.println("Comprobar que: -----------> "+a + " = " + b +" suma modular "+ (a-b) +" \n");
        int m = a - b;
        for(int i=0; i<zs; i++ ){
            int res = ((b+m) - i) % zs;
            System.out.println("Iteración con r = "+ i +":  \n");
            System.out.println((a-i) +"/ "+ zs +" = q\n");
            System.out.println("q = "+ res +"\n");
            if(res == 0){
            System.out.println(a +" mod "+ zs +" = "+ i +"\n");
            System.out.println(a +" = "+ b +" suma modular "+ (a-b) +"\n");
            System.out.println("-------------------> PRUEBA RESTA<----------------------\n\n");
            break;
            }
            res=0;            
        }
    }
    
}

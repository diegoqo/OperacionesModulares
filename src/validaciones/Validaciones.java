package validaciones;

public class Validaciones {
    public boolean validacionNegativo(int a){
        if(a < 0){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean validacionZn(int a, int b, int z){
        if(z < 0){
            return false;
        }
        else if(a < z && b < z){
            return true;
        }
        else {
        return false;}
    }
}

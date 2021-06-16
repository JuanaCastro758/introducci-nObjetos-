package src;
import java.util.*;
public class Ejercicio2 {
    private float lado=0;
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese lado del cuadrado");
        float l=scanner.nextFloat();
        if(l>0){
            Ejercicio2 a=new Ejercicio2(l);
            System.out.println("Area: "+a.Area(a.getLado()));
            System.out.println("Perimetro: "+a.Perimetro(a.getLado()));
        }else{
            System.out.println("Medida negativa");
        }
    }
    public Ejercicio2(float lado){
        this.lado=lado;
    }
    public float getLado(){
        return lado;
    }
    public float Area(float l){
        float area=l*l;
        return area;
    }
    public float Perimetro(float l){
        float perimetro=4*l;
        return perimetro;
    }
}

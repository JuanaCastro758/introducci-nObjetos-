package src;
public class Ejercicio1 {
    private int i=0;
    public static void main(String[] args){
        //por defecto
        Ejercicio1 a=new Ejercicio1();
        a.decremento1(a);
        a.incremento1(a);
        //por parametro
        Ejercicio1 b=new Ejercicio1(10);
        b.decremento(b.getI());
        b.incremento(b.getI());
        
    }
    //Constructor por defecto
    public Ejercicio1(){
        this.i=5;
    }
    //metodo incremento por defecto
    public void incremento1(Ejercicio1 a){
        i++;
        System.out.println("Incremento: "+i);
    }
    //metodo decremento por defecto
    public void decremento1(Ejercicio1 a){
        i--;
        System.out.println("Decremento: "+i);
    }
    
    //constructor por parametro
    public Ejercicio1(int i){
        this.i=i;
    }
    //get y setter
    public int getI(){
        return i;
    }
    public void setI(int i){
        this.i=i;
    }
    //metodo incremento
    public void incremento(int i){
        i++;
        System.out.println("Incremento: "+i);
    }
    //metodo decremento
    public void decremento(int i){
        i--;
        System.out.println("Decremento: "+i);
    }
    
    //constructor copia
    public Ejercicio1(Ejercicio1 ejer){
        this.i=ejer.i;
    }
    
}

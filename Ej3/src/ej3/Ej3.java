package ej3;
/**
 *
 * @author Fran
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche  miCoche = new Coche();
        miCoche.AgregarPuerta();
       
        suma(3,4,1);
        
        System.out.println("Cantidad de puertas : "+miCoche.puertas);
    }
    
    public static void suma (int n1 ,int n2,int n3)
    {
         int resultado =n1+n2+n3;
        System.out.println("La suma es : "+resultado);
     }
    
}

class Coche {
    public int puertas =0;
    public void AgregarPuerta(){
        this.puertas++;
    }
}
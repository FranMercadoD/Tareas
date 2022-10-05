/*
Por último, para el Switch, deberás crear la variable estacion,
y distintos case para las cuatro estaciones del año. Dependiendo 
del valor de la variable estacion se deberá mandar un mensaje por 
consola informando de la estación en la que está. También habrá que poner
un default para cuando el valor de la variable no sea una estación.
 */
package ej4;

/**
 *
 * @author Fran
 */
public class Ej4 {

    
    public static void main(String[] args) {
         
        
        int numeroIf =0;
         int numeroWhile=-3;
         int numeroDoWhile = 2;
        
        if (numeroIf==0)
            System.out.println("Es igual a 0");
        else if (numeroIf<0){
            System.out.println("Es negativo");
             }
        else if (numeroIf>0)
        {
                        System.out.println("Es positivo");
        }
        
       while(numeroWhile<3)
       {
           numeroWhile++;
           System.out.println(numeroWhile);
       }
       
       do {
           System.out.println("Prueba DoWHILE"+numeroDoWhile);
           numeroDoWhile++;
           
       }while(numeroDoWhile<3);
       System.out.println("Prueba DoWHILE"+numeroDoWhile);
       
       for(int numeroFor =0;numeroFor<=3;numeroFor++)
       {
           System.out.println(numeroFor);
    }
    
       String estacion = "VERANO";
       switch(estacion)
       {
           case "VERANO":
               System.out.println("es verano");
               break;
            case "OTOÑO":
                System.out.println("es otoño");
                   break;
                 case "INVIERNO":
                     System.out.println("es invierno ");
                        break;
                      case "PRIMAVERA":
                          System.out.println("es primavera");
                             break;
                      default:
                          System.out.println("no es una estacion ");
                             break;
                          
       }
}
}
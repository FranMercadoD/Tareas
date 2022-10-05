 
package ej8;

/**
 *
 * @author Fran
 */
public class Ej8 {

    /**
    ara practicar la encapsulación:

Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
     * @param args
     */
    public static void main(String[] args) {
        
        Persona p = new Persona();
        p.setEdad(20);
        p.setNombre("Pepito");
        p.setTelefono(222);
        
        System.out.println("Nombre: " + p.getNombre()+"\nEdad:"+ p.getEdad()+"\nTelefono:"+ p.getTelefono());
    }
    
}
    class Persona {
        private int edad;
        private String nombre;
        private int telefono;
        
        
        
        public void setEdad(int edad)
        {
            this.edad = edad;
        }
         public int getEdad()
        {
           return  this.edad ;
        }
         
          public void setNombre(String nombre)
        {
            this.nombre = nombre;
        }
         public String getNombre()
        {
           return  this.nombre;
        }
          public void setTelefono(int telefono)
        {
            this.telefono = telefono;
        }
         public int getTelefono()
        {
           return  this.telefono ;
        }
    }


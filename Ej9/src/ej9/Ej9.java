/*
 *Crea una clase Persona con las siguientes variables:

La edad

El nombre

El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades
la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de 
Persona, y con una variable salario que solo tenga la clase Trabajador.
 */
package ej9;

/**
 *
 * @author Fran
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Cliente c = new Cliente();
         c.credito = 1200;
         c.edad = 20;
         c.nombre= "Pepe";
         c.telefono= 123234;
         
         Trabajador t = new Trabajador();
         t.nombre = "JUAN";
         t.edad= 45;
         t.telefono= 4540;
         t.salario= 900000;
         
         System.out.println("Nombre:" +c.getNombre()+ "\nEdad: "+c.getEdad()+"\nTel:"+c.getTelefono()+"\nCredito: "+c.getCredito());
         System.out.println("Nombre:" +t.getNombre()+ "\nEdad: "+t.getEdad()+"\nTel:"+t.getTelefono()+"\nSalario: "+t.getSalario());
    }
    
}

class Persona {
    
      int edad;
      String nombre;
      int telefono;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
      
      
      
}


class Cliente extends Persona 
{
      int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
    
      
}

class Trabajador extends Persona 
{
    int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
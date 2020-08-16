package Referencia.model;

public class User {

    private String nombre;


    public User(String nombre) {
        this.nombre = nombre;
    }

    public static void referenciaMethodStatic(){
        System.out.println("Probando referencia a metodo statico");
    }


    public void referencaiMethodParticualar(){
        System.out.println("Probadno referencia a metodo de objeto particular");
    }

    public void mostrarNombre(){
        System.out.println(nombre);
    }

}

package Referencia;

import Referencia.interfaces.IUser;
import Referencia.interfaces.Trabajo;
import Referencia.interfaces.TrabajoString;
import Referencia.model.User;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Con metodo de referencia statico
        Trabajo trabajo1 = () -> User.referenciaMethodStatic();
        Trabajo trabajo2 = User::referenciaMethodStatic;
        trabajo1.accion();


        //Con referencia de metodo particular
        User user = new User("Ariel");
        Trabajo trabajo = user::referencaiMethodParticualar;
        Trabajo trabajo3 = () -> user.mostrarNombre();
        trabajo.accion();



        TrabajoString trabajoString = (palabra) -> palabra.toUpperCase();
        TrabajoString trabajoString1 = String::toUpperCase;
        System.out.println(trabajoString1.accion("casa"));



        List<User> users = new ArrayList<>();
        users.add(new User("Ariel"));
        users.add(new User("Juan"));
        users.add(new User("MArio"));
        users.add(new User("Ricardo"));

        //users.forEach(k -> k.mostrarNombre());
        users.forEach(User::mostrarNombre);


        //Metodos por constructor
        IUser iUser = (nombre) -> new User(nombre);
        IUser iUser1 = User::new;




    }
}

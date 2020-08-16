package Lambda;

public interface PorDefecto {

    void mostrarNombre(String name);

    default String nombrePorDefector(String name){
        return name + " Default";
    }
}

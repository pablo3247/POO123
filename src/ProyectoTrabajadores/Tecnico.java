package ProyectoTrabajadores;

public class Tecnico extends Operario{

    Tecnico(String nombre){
        super(nombre);
    }


    @Override
    public String toString(){
        return "Nombre Tecnico: "+ getNombre();
    }

}

package ProyectoTrabajadores;

public class Oficial extends Operario{

    Oficial(String nombre){
        super(nombre);
    }

    @Override
    public String toString(){
        return "Nombre Oficial: "+ getNombre();
    }


}

package ProyectoTrabajadores;

public class Operario extends Empleado{

    Operario(String nombre){
        super(nombre);
    }



    @Override
    public String toString(){

        return "Nombre Operario: "+getNombre()  ;
    }

}

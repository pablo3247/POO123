package ProyectoTrabajadores;

public class Directivo extends Empleado{

    Directivo(String nombre){
        super(nombre);
    }


    @Override
    public String toString(){
        return "Nombre Directivo: "+getNombre()  ;
    }


}

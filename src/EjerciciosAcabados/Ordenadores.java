package EjerciciosAcabados;

public class Ordenadores {

   final  private String name;
    private double precio;
    private String procesador;
    private String ram;
    private String grafica;
    private String tipo;

    public Ordenadores (String name, double precio, String procesador, String ram, String grafica, String tipo ){
        this.name = name;
        this.precio = precio;
        this.procesador = procesador;
        this.ram = ram;
        this.grafica = grafica;
        this.tipo =  tipo;
    }

    public String getSpecs(){
        return "Specs: \n"+"- "+procesador+"\n" + "- "+ram+"\n"+"- "+ grafica;
    }


    public void setPrecio(double precio){
        this.precio =precio;
    }

    public void setProcesador(String procesador){
        this.procesador = procesador;
    }

    public void setRam(String ram){
        this.ram = ram;
    }

    public void setGrafica(String grafica){
        this.grafica = grafica;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return "Nombre: "+name+",\nTipo: "+tipo+",\nPrecio: "+precio+"$, \nCPU: "+procesador+", \nRAM: "+ram+",\nGrafica "+grafica;

    }


}

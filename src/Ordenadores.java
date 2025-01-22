public class Ordenadores {

    private String name;
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


    @Override
    public String toString(){
        return "Nombre: "+name+",\nTipo: "+tipo+",\nPrecio: "+precio+"$, \nCPU: "+procesador+", \nRAM: "+ram+",\nGrafica "+grafica;

    }


}

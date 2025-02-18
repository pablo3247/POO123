package EjerciciosAcabados;

public class Aire {

    private String name;
    private int temperatura;
    private int minTemp;
    private int maxTemp;

    public Aire(String name,int temperatura, int minTemp, int maxTemp){

        this.name = name;
        this.temperatura = temperatura;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }


    public void subirTemp(){
        if(temperatura >= maxTemp){
            System.out.println("PELIGRO! TEMPERATURA MAXIMA ALCANZADA!");
        }else {
            temperatura++;
        }


    }
    public void bajarTemp(){
        if(temperatura <= minTemp){
            System.out.println("PELIGRO! TEMPERATURA MINIMA ALCANZADA!");

        }else {
            temperatura--;
        }


    }


    @Override

    public String toString(){

        return "Nombre : "+name+"\n"+"Temperatura actual: "+temperatura;

    }


}

public class Aire {

    private String name;
    private int temperatura;

    public Aire(String name){

        this.name = name;
        this.temperatura = 5;
    }


    public void subirTemp(){
        if(temperatura == 10){
            System.out.println("PELIGRO! TEMPERATURA MAXIMA ALCANZADA!");
        }else {
            temperatura++;
        }


    }
    public void bajarTemp(){
        if(temperatura == 1){
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

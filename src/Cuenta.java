public class Cuenta {

    private String titular;
    private double cantidad;


     public Cuenta(String titular, double cantidad){
         this.titular = titular;
         this.cantidad = cantidad;
     }

     public Cuenta(String titular){
         this.titular = titular;
     }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void ingresar(double cantidad){
         if(cantidad >0){
             this.cantidad =this.cantidad + cantidad;
         }
    }

    public void retirar(double cantidad){
         if(cantidad>0) {


             if (this.cantidad - cantidad < 0) {
                 this.cantidad = 0;
             } else {
                 this.cantidad = this.cantidad - cantidad;
             }
         }
    }

    @Override
    public String toString(){

         return titular+"\n"+ cantidad+"$";
    }

}

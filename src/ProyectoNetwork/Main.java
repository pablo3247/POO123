package ProyectoNetwork;

public class Main {
    public static void main(String[] args) {

        usuario juan = new usuario("juan");

        usuario pepe = new usuario("pepe");

        pepe.CrearMensaje("Hola a todos!");

//        pepe.CrearMensaje("OOOOOOOOOOlEEEEEE");
//
//        pepe.CrearMensaje("EEEEEE");
//
//
        pepe.CrearMensaje("Ultimo post!!");

        pepe.Comentar(0,"Buen post, no lo borres!");


        System.out.println("////////////");

        pepe.CrearMensaje("HOLA CHAT!!!");




        juan.CrearMensaje("SOy juean");



        pepe.VerTodosMensajes("juan");

//        pepe.VerTodosMensajes();




//
//
//        juan.CrearMensaje("Hola soy JUan :D");
//
//        juan.VerTodosMensajes();



    }
}
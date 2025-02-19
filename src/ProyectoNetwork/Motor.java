package ProyectoNetwork;

import java.util.ArrayList;
import java.util.HashMap;


public abstract class Motor{

    String autor;
    mensaje prueba;
     static Integer like=1;
    private  static Integer contador=0;
    private static ArrayList<String > mensajitos = new ArrayList<>();

    private static ArrayList<String> comentarios = new ArrayList<>();

    private static HashMap<Integer,ArrayList<String>> ListaComentarios = new HashMap<>();

    private static HashMap<Integer,Integer> likes = new HashMap<>();


    //Asociar autor con id de sus publicaciones!

    private static HashMap<String,ArrayList<Integer>> AutorID = new HashMap<>();

    private static ArrayList<Integer> IDs = new ArrayList<>();




    public Motor(String nombre){
        this.autor = nombre;

    }

    public void CrearMensaje(String mensaje){
        int contadorGlobal = contador++;

        prueba = new mensaje(contadorGlobal,autor ,mensaje);
        mensajitos.add(mensaje);


        IDs = AutorID.computeIfAbsent(autor,k -> new ArrayList<Integer>());
        IDs.add(contadorGlobal);


    }

    public void VerMensaje(int ID){
        System.out.println(" ID: "+ mensajitos.indexOf(mensajitos.get(ID))+" Mensaje: "+mensajitos.get(ID));

    }


    public void EliminarMensaje(int ID){
        mensajitos.remove(ID);
    }

    public void Comentar(int ID,String comentario){

        comentarios = ListaComentarios.computeIfAbsent(ID,k -> new ArrayList<>());
        comentarios.add(comentario);

    }

    public void DarLike(int ID){

        like = likes.get(ID);

        if(like == null){
            likes.put(ID,1);
        }
        else {
            likes.put(ID,like +1);
        }

    }

    public void VerLikes(int ID){

        if(likes.get(ID) == null){
            System.out.println("0");
        }else {
            System.out.println(likes.get(ID));
        }

    }


    public void VerTodosMensajes(String name){
        System.out.println("/////////Mensajes de "+name);

        for(int i: AutorID.get(name)){
            System.out.println(mensajitos.get(i));
        }


    }


    public void VerCometarios(int ID){
        System.out.println(ListaComentarios.get(ID));

    }


}
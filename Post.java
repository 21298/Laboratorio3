import java.util.*;

public class Post {
    Scanner ScanString = new Scanner(System.in);
    Scanner ScanInt = new Scanner(System.in);
    protected String fecha;
    protected String Hour;
    protected int Likes = 0;
    protected String User;
    protected String Comment;
    protected String HashTags;

    public String hashtags(){
        return HashTags;
    }

    public void setHashtags(String a){
        this.HashTags = a;
    }
    
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String a){
        this.fecha = a;

    }
    public String getHour(){
        return Hour;

    }
    public void setHour(String a){
        this.Hour = a;
    }
    
    public void User(){
        System.out.println("Escriba su Nombre de Usuario:");
        User = ScanString.nextLine();
        System.out.println("Escriba la fecha de su publicacion en foramto (DIA/MES/AÑO):");
        fecha = ScanString.nextLine();
        System.out.println("Escriba la hora de publicación en formato de 24hrs (HORA:MINS):");
        Hour = ScanString.nextLine();
    }
    
    public void Escribir(){
        System.out.println("Ingrese su comentario");
        Comment = ScanString.nextLine();
        Publicacion();
        System.out.println("Comentarios:");
        System.out.println(Comment);
    }
    
    public String getUser(){
        return User;
    }
    public String setUser(String Comment){
        this.User = Comment;
        return Comment;
    }
    
    public void commented(){
        System.out.println("Ésta es el área de comnetarios");
        System.out.println("------------------------------");
       
        if (Comment == null){
            System.out.println("-No se encontró ningún comentario-");
        }
        else{
            System.out.println(Comment);
        }               
        System.out.println("------------------------------");

    }
    
    public void Publicacion(){  
        System.out.println("------------------------------------------------");
        System.out.println("Usuario: "+User);
        System.out.println("Fecha: "+fecha);
        System.out.println("Hora: "+Hour);
        System.out.println("No. Likes: "+Likes);
        System.out.println("HashTags: "+HashTags);
        System.out.println("------------------------------------------------");
    }
    
    public void Likes(){
        Likes ++;
    }



}

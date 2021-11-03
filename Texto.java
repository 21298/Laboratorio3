import java.util.*;

public class Texto extends Post{
    Scanner ScanInt = new Scanner(System.in);
    Scanner ScanString = new Scanner(System.in); 

    public void publicar(){
        System.out.println("¿Cuál es el texto que desea ingresar?: ");
        System.out.println("Ingrese sus Hasstags (en caso contrario omitir)");
        String texto = ScanString.nextLine();
        if (texto.length()<=20){
            System.out.println("Publicación realizada correctamente");
        }
        else{
            System.out.println("ERROR: Su mensaje supera el limite de 20 caracteres");
        }
        Publicacion();
        System.out.println("Texto: "+texto);
    }
}

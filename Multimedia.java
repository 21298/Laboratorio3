import java.util.Scanner; 
import java.util.*;

public class Multimedia extends Post{
    Scanner ScanInt = new Scanner(System.in);
    Scanner ScanString = new Scanner(System.in);
    
    public void Video(){
        System.out.println("Ingresa el URL del Video: ");
        String videoLink = ScanString.nextLine();
        System.out.println("Ingresa el tamaño del video (KB): ");
        int tamanoVideo = ScanInt.nextInt();
        System.out.println("Ingrese los 'FPS' del video: ");
        String FPSVideo = ScanString.nextLine();
        Publicacion();
        
        System.out.println("Video: "+videoLink+"\n"+tamanoVideo+" KB, " + FPSVideo+"fps"); 
        commented();
    }
    
    public void Audio(){
        System.out.println("Ingresa el URL del Audio:");
        String audioLink = ScanString.nextLine();
        System.out.println("Ingresa el tamaño en KB del Audio");
        int tamanoAudio = ScanInt.nextInt();
        System.out.println("Ingrese el SampleRate del Audio (Khz)");
        String muestra = ScanString.nextLine();
        System.out.println("Ingrese el BitDepth del Audio");
        int BitAudio = ScanInt.nextInt();
        Publicacion();  
 
        System.out.println("Audio: "+audioLink+"\n"+tamanoAudio+" KB, SampleRate: " + muestra + ", BitDepth: "+BitAudio);
        commented();
    }
    
    public void Imagen(){
        System.out.println("Ingrese el URL de la imagen:");
        String ImagenLink = ScanString.nextLine();
        System.out.println("Ingresa el tamaño de imagen (KB)");
        System.out.println("ERROR. Debes de ingresar Strings");
        
        int tamanoImagen = ScanInt.nextInt();
        System.out.println("Ingrese el tipo de la Imagen");
        String ImagenType = ScanString.nextLine();
        System.out.println("Ingrese la resolución en Megapixeles");
        int pixels = ScanInt.nextInt();
        Publicacion();  
        
        System.out.println("Imagen: "+ImagenLink+"\n"+tamanoImagen+" KB," + ImagenType + ", "+pixels+" Megapixeles");
        commented();
    }
    
    public void eleccion(){
        System.out.println("----------------------------");
        System.out.println("¿Que opción desea ejecutar? ");
        System.out.println("(1). Publicar Video");
        System.out.println("(2). Publicar Audio");
        System.out.println("(3). Publicar Imagen");
        
        int opcion = ScanInt.nextInt();
        switch(opcion){
            case 1: // Video 
                Video();
                break;
            case 2: // Audio
                Audio();
                break;
            case 3: // Imagen
                Imagen();
                break;
            default:
                System.out.println("ERROR: no es una opción valida");
        }
    }
}

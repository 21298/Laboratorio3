import java.util.ArrayList;
import java.util.Scanner;

public class QueOndaMano {
    //Scanners
    private Scanner ScanInt = new Scanner(System.in);
    private Scanner ScanString = new Scanner(System.in);
    
    Multimedia media = new Multimedia();
    Texto texto = new Texto();
    Post publicacion = new Post();
    Emoji emote = new Emoji();
    
    
    ArrayList<Post> PublicacionArray = new ArrayList<>();
   
    
    public void menu(){
        
        System.out.println("------------------------------------------------");
        System.out.println("----------|Bienvenido a 'QueOndaMano'|----------");
        System.out.println("------------------------------------------------");
        
        publicacion.User();
        boolean repeticion = true;
        while(repeticion){
            
        System.out.println("¿Cómo podemos ayudarte? ");
        System.out.println("(1). Nueva Publicación");
        System.out.println("(2). Like a publicación");
        System.out.println("(3). Comentar Post");
        System.out.println("(4). Siguiente publicación");
        System.out.println("(5). Ver Post's por Fechas");
        System.out.println("(6). Ver Post's por HashTags");
        System.out.println("(7). Salir");
        
        int opcion = Selectio();
        
            switch (opcion) {
                case 1:
                    // nueva publicacion
                    boolean advance = true;
                    while(advance){
                        
                        System.out.println("¿Cuales son las caracteristicas de tu nuevo Post?");
                        System.out.println("-------------------------------------------------");
                        System.out.println("(1). Tipo Texto");
                        System.out.println("(2). Tipo Multimedia");
                        System.out.println("(3). Emojis");
                        
                        int option = ScanInt.nextInt();
                        switch(option){
                            case 1:
                                texto.setUser(publicacion.getUser());
                                texto.publicar();
                                PublicacionArray.add(texto);
                                advance = false;

                                
                            case 2:
                                media.setUser(publicacion.getUser());
                                media.eleccion();
                                PublicacionArray.add(media);
                                advance = false;
                                
                            case 3:
                                emote.setUser(publicacion.getUser());
                                emote.reacciones();
                                PublicacionArray.add(emote);
                                advance = false;
                                
                            default:
                                System.out.println("ERROR: opción inválida");
                                
                        }
                        repeticion = true;
                        
                    }   break;
                case 2:
                    // like a publicacion
                    System.out.println("Te ha gustado esta publicación");
                    publicacion.Likes();
                    publicacion.commented();
                    publicacion.Publicacion();
                    repeticion = true;
                    break;
                case 3:
                    // comentar post
                    publicacion.Escribir();
                    repeticion = true;
                    break;
                case 4:
                    // siguiente publicación
                    for (int i=0; i<PublicacionArray.size();i++){
                        System.out.println(PublicacionArray.get(i));
                        repeticion = true;
                    }   break;
                case 5:// Ver Post's por fechas
                    
                    System.out.println("Ingrese la fecha en formato 'DÍA/MES/AÑO'");
                    String fecha = ScanString.nextLine();
                    if (!(PublicacionArray.isEmpty())){

                        for (Post publicacion:PublicacionArray){
                            if (fecha.equals(publicacion.getFecha())){
                                publicacion.Publicacion();

                            }
                        }
                    }
                    
                    repeticion = true;
                    break;
                
                case 6: // ver Post's por HashTags

                    break;

                case 7:
                    System.exit(0);
                default:
                    System.out.println("ERROR: opción inválida");
                    repeticion = true;
                    break;
            }
        }
    }
    private int Selectio(){
    return ScanString.nextInt();
}

}

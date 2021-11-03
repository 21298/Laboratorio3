import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class Emoji extends Post{
    Scanner ScanInt = new Scanner(System.in);
    Scanner ScanString = new Scanner(System.in);

    public void reacciones(){
        
        String MeGusta = "(｡◕‿◕｡)";
        String MeEnoja = "(╬ ಠ益ಠ)";
        String MePela = "¯\\_(ツ)_/¯";
        String MeEntristece = "(´･_･`)";
        String MeConfunde = "(⊙_◎)";
        String MePrende = "ԅ(≖‿≖ԅ)";
        
        System.out.println("------------------------------------------------");
        System.out.println("-- ¿Que Emoji deseas utilizar en tu reacción? --");
        System.out.println("------------------------------------------------");
        System.out.println("(1). |Me Gusta   | (｡◕‿◕｡)");
        System.out.println("(2). |Me Enoja   | (╬ ಠ益ಠ)");
        System.out.println("(3). |Me Pela    | ¯\\_(ツ)_/¯");
        System.out.println("(4). |Me Pone Mal| (´･_･`)");
        System.out.println("(5). |Me Confunde| (⊙_◎)");
        System.out.println("(6). |Me Prende  | ԅ(≖‿≖ԅ)");
        
        
        int EmojiEleccion = ScanInt.nextInt();
        
            
        switch(EmojiEleccion){
            case 1:         
                System.out.println("Me gusta: "+MeGusta);
                commented();
                break;
            case 2:
                System.out.println("Me enoja: "+MeEnoja);
                commented();
                break;
            case 3: 
                System.out.println("Me pela: "+MePela);
                commented();
                break;
            case 4:
                System.out.println("Me pone triste: "+MeEntristece);
                commented();
                break;
            case 5: 
                System.out.println("Me confunde: "+MeConfunde);
                commented();
                break;
            case 6:
                System.out.println("Me prende: "+MePrende);
                commented();
                break;
            default:
                System.out.println("ERROR: opcion invalida");
                commented();
            }
    }
}

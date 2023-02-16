import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Collections;
public class Odczytywanie{
    File f = new File("C:/Users/kacpe/Desktop/PROGRAMOWANIE/obiektowe/KoloFortuny/Pytanka.txt");
    public ArrayList<Pytanie> zaczytaj(){
        ArrayList<Pytanie> list = new ArrayList<>();
        String kategoria = "";
        String trudnosc = "";
        String tresc = "";
        String podpowiedz = "";
        try{
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                String linia = sc.nextLine();
                if(linia.contains("@")){
                    trudnosc = linia.replaceAll("@", "");
                } else if(linia.contains("~")){
                    kategoria = linia.replaceAll("~", "");
                } else{
                    String dane[] = linia.split("/");
                    tresc = dane[0];
                    podpowiedz = dane[1];
                    list.add(new Pytanie(kategoria, trudnosc, tresc, podpowiedz));
                }
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KoloFortuny.class.getName()).log(Level.SEVERE, null, ex);
        }
        Collections.shuffle(list);
        return list;
    }
}
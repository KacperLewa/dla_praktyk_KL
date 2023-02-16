import java.util.ArrayList;
import java.util.List;
public class KoloFortuny{
    public static void main(String[] args){
        Odczytywanie od = new Odczytywanie();
        LogikaGry lg = new LogikaGry();
        ArrayList<Pytanie> list = od.zaczytaj();
        /*for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }*/
        lg.losujPytanie(list);
        if(lg.zgadywanie()==true){
            System.out.println("Brawo! Wygrałeś :)");
        } else{
            System.out.println("Niestety, przegrałeś :()");
        }

    }
}
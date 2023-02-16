import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.StringBufferInputStream;
import java.util.Date;
public class LogikaGry extends Pytanie{
    private int gracze = 2;
    private String[] kategorie = {"ZWIERZETA", "GRY KOMPUTEROWE"};
    private String[] trudnosci = {"LATWE", "SREDNIE", "TRUDNE"};
    private Random r = new Random();
    private Scanner sc = new Scanner(System.in);
    private String tresc = "";
    private String podpowiedz = "";
    private int punkty = 0;

    public void setGracze(int gracze){
        this.gracze = gracze;
    }

    public void losujPytanie(ArrayList<Pytanie> list){
        for(int i=0; i<3; i++){
            animacja();
        }
        int q = r.nextInt(2);
        String kategoria = kategorie[q];
        q = r.nextInt(3);
        String trudnosc = trudnosci[q];
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getKategoria().equals(kategoria) && list.get(i).getTrudnosc().equals(trudnosc)){
                tresc = list.get(i).getTresc();
                podpowiedz = list.get(i).getPodpowiedz();
            }
        }
        System.out.println(podpowiedz);
    }

    public boolean zgadywanie(){
        String szyfr = "";
        char[] slowo = tresc.toCharArray();
        for(int i=0; i<slowo.length; i++){
            if(slowo[i] == ' '){
                szyfr = szyfr.concat(" ");
            } else{
                szyfr = szyfr.concat("-");
            }
        }
        StringBuilder szyfr2 = new StringBuilder(szyfr);
        StringBuilder tresc2 = new StringBuilder(tresc);
        System.out.println(szyfr);
        while(true){
            if(szyfr2.toString().equals(tresc2.toString())){
                System.out.println("Zgadłeś");
                return true;
            } else {
                String podane = sc.next();
                if(podane.toUpperCase().equals(tresc2.toString())){
                    return true;
                } else{
                    char literka = podane.charAt(0);
                    literka = Character.toUpperCase(literka);
                    for(int i=0; i<slowo.length; i++){
                        if(slowo[i] == literka){
                            szyfr2.setCharAt(i, literka);
                            System.out.println(szyfr2);
                        } else if(!(new String(slowo).contains(Character.toString(literka)))){
                            System.out.println(tresc2);
                            return false;
                        }
                    }
                }
            }
        }
    }
    
    public void animacja(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("===============");
        System.out.println("=      |      =");
        System.out.println("=      |      =");
        System.out.println("=      |      =");
        System.out.println("=             =");
        System.out.println("=             =");
        System.out.println("===============");

        try {
            Thread.sleep(400);
        } catch(InterruptedException e) {
            System.out.println("Błąd!");
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("===============");
        System.out.println("=             =");
        System.out.println("=             =");
        System.out.println("=      -------=");
        System.out.println("=             =");
        System.out.println("=             =");
        System.out.println("===============");

        try {
            Thread.sleep(400);
        } catch(InterruptedException e) {
            System.out.println("Błąd!");
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("===============");
        System.out.println("=             =");
        System.out.println("=             =");
        System.out.println("=      |      =");
        System.out.println("=      |      =");
        System.out.println("=      |      =");
        System.out.println("===============");

        try {
            Thread.sleep(400);
        } catch(InterruptedException e) {
            System.out.println("Błąd!");
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("===============");
        System.out.println("=             =");
        System.out.println("=             =");
        System.out.println("=-------      =");
        System.out.println("=             =");
        System.out.println("=             =");
        System.out.println("===============");

        try {
            Thread.sleep(400);
        } catch(InterruptedException e) {
            System.out.println("Błąd!");
        }
    }
}
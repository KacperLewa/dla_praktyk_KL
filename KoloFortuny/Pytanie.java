public class Pytanie{
    private String tresc;
    private String trudnosc;
    private String podpowiedz;
    private String kategoria;

    public Pytanie(){}

    public Pytanie(String kategoria, String trudnosc, String tresc, String podpowiedz){
        this.kategoria = kategoria;
        this.trudnosc = trudnosc;
        this.tresc = tresc;
        this.podpowiedz = podpowiedz;
    }

    public String getPodpowiedz(){
        return podpowiedz;
    }

    public String getTresc(){
        return tresc;
    }

    public String getKategoria(){
        return kategoria;
    }

    public String getTrudnosc(){
        return trudnosc;
    }
    @Override
    public String toString(){
        return "Pytanie{"+"kategoria='"+kategoria+'\''+", trundosc='"+trudnosc+'\''+", tresc='"+tresc+'\''+", podpowiedz='"+podpowiedz+'\''+'}';
    }
}
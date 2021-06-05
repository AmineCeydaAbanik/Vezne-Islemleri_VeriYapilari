
package VeriYapilari;

import java.util.ArrayList;

/**
 Amine Ceyda ABANİK
 * 1721221024
 * VERİ YAPILARI ÖDEV 1
 */
public class Musteri {
    
    String isim;
    int oncelik;
    long islemSuresi;
    static ArrayList <Musteri> musteriList  = new ArrayList<>();

    public Musteri() {
    }
  
    public Musteri(String isim, int oncelik,long islemSuresi) {
        this.isim = isim;
        this.oncelik = oncelik;
        this.islemSuresi=islemSuresi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getOncelik() {
        return oncelik;
    }

    public void setOncelik(int oncelik) {
        this.oncelik = oncelik;
    }

    public long getIslemSuresi() {
        return islemSuresi;
    }

    public void setIslemSuresi(int islemSuresi) {
        this.islemSuresi = islemSuresi;
    }

    public static ArrayList<Musteri> getMusteriList() {
        return musteriList;
    }

    public static void setMusteriList(ArrayList<Musteri> musteriList) {
        Musteri.musteriList = musteriList;
    }

   

    

    
}

package code;

public class tabung {
    public int jari, tinggi;
    
    public tabung(int r, int t){
        jari = r; 
        tinggi = t;
    }
    public double volume(){
        return 3.14*(jari*jari)*tinggi;
    }
    public double luasPermukaan(){
        return 2*3.14*jari*(jari+tinggi);
    }
}

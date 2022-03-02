package code;

public class setengahBolaPejal {
    public int jari;

    public setengahBolaPejal(int r){
        jari = r; 
    }

    public double volume(){
        return 0.67*3.14*(jari*jari*jari);
    }
    
    public double luasPermukaan() {
        return 3*3.14*(jari*jari);
    }

}

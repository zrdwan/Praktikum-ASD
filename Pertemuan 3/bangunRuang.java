package code;

import java.util.Scanner;

public class bangunRuang {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak bangun ruang setengah bola : ");
        int setBol = sc.nextInt();
        int r;
        setengahBola[] brSetBola = new setengahBola[setBol];
        System.out.println("----------------------------");
        for(int i = 0 ; i < brSetBola.length; i++){
            System.out.print("Masukkan jari jari "+(i+1)+ ": ");
            r = sc.nextInt();
            brSetBola[i]= new setengahBola(r);  
        }
        for (int i = 0 ; i <brSetBola.length; i++){
            System.out.println();
            System.out.println("Setengah Bola ke-" + (i+1));
            System.out.println("jari jari ke-" +(i+1)+": " + brSetBola[i].jari);
            System.out.println("Volume ke-"+(i+1)+" :" + brSetBola[i].volume());
            System.out.println("Luas permukaan ke-" + (i+1) + " : " + brSetBola[i].luasPermukaan());

        }

        System.out.print("Masukkan banyak bangun ruang setengah bola pejal : ");
        int setBolPejal = sc.nextInt();
        int r2;
        setengahBolaPejal[] brSetBolaPejal = new setengahBolaPejal[setBolPejal];
        System.out.println("----------------------------");
        for(int i = 0 ; i < brSetBolaPejal.length; i++){
            System.out.print("Masukkan jari jari "+(i+1)+ ": ");
            r2 = sc.nextInt();
            brSetBolaPejal[i]= new setengahBolaPejal(r2);  
        }
        for (int i = 0 ; i <brSetBolaPejal.length; i++){
            System.out.println();
            System.out.println("Setengah Bola Pejal ke-" + (i+1));
            System.out.println("jari jari : " + brSetBolaPejal[i].jari);
            System.out.println("Volume ke-"+ (i+1) +" :" + brSetBolaPejal[i].volume());
            System.out.println("Luas permukaan ke-" + (i+1) + " : " + brSetBolaPejal[i].luasPermukaan());

        }

        System.out.print("Masukkan banyak bangun ruang tabung : ");
        int tbg = sc.nextInt();
        int r3,t;
        tabung[] tabungAr = new tabung[tbg];
        System.out.println("----------------------------");
        for(int i = 0 ; i < tabungAr.length; i++){
            System.out.print("Masukkan jari jari "+(i+1)+ ": ");
            r3 = sc.nextInt();
            System.out.print("Masukkan tinggi "+(i+1)+ ": ");
            t = sc.nextInt();
            tabungAr[i]= new tabung(r3, t);  
        }
        for (int i = 0 ; i <tabungAr.length; i++){
            System.out.println();
            System.out.println("Tabung  ke-" + (i+1));
            System.out.println("jari jari : " + tabungAr[i].jari);
            System.out.println("tinggi    : " + tabungAr[i].tinggi);
            System.out.println("Volume ke-"+(i+1)+" :" + tabungAr[i].volume());
            System.out.println("Luas permukaan ke-" + (i+1) + " : " + tabungAr[i].luasPermukaan());

        }
    }
    
}

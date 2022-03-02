package code;

import java.util.Scanner;

public class mahasiswaMain {
    public static void main(String[] args){
        mahasiswa[] mhAr = new mahasiswa[3];

        //input data
        for (int i=0; i<mhAr.length; i++) {
            mhAr[i] = new mahasiswa();
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            mhAr[i].input();
            System.out.println();
        }
        System.out.println();

        //output
        for (int i=0; i<mhAr.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            mhAr[i].display();
        }
    }
}
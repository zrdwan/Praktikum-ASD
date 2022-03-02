package code;

import java.util.Scanner;

public class mahasiswa {
    Scanner sc = new Scanner(System.in);
    String nama;
    int nim;
    char jenisKelamin;
    double nilaiIPK;

    void display() {
        System.out.println("nama : " + nama);
        System.out.println("nim : " + nim);
        System.out.println("Jenis kelamin : " + jenisKelamin);
        System.out.println("Nilai IPK : " + nilaiIPK);
    }

    void input() {
        System.out.print("Masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan nim : ");
        nim = sc.nextInt();
        System.out.print("Masukkan jenis kelamin : ");
        jenisKelamin = sc.next().charAt(0);
        System.out.print("Masukkan Nilai IPK : ");
        nilaiIPK = sc.nextDouble();
    }
}
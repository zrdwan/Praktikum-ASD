public class tugas1 {
    String namaBarang;
    int hargaSatuan, jumlah;

    int hitungHargaTotal(int a,int b){
        int total = a * b;
        return total;
    }

    int hitungDiskon(int n){
        int dis = 0;
        if (n > 100000){
            dis = n * 10/100;
        }else if ((n > 50000) && (n < 100000)){
            dis = n * 5/100;
        }else {
            dis = 0;
        }
        return dis;
    }

    int hitungHargaBayar(int p,int q){
        int totalHarga = 0;

        totalHarga = p - q;

        return totalHarga;

    }
}
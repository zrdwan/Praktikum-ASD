public class tugas1Main{
    public static void main(String[] args){
        tugas1 barang = new tugas1();
        barang.namaBarang = "Headphone JBL";
        barang.hargaSatuan = 750000;
        barang.jumlah = 4;

        System.out.println("Nama Barang  : " + barang.namaBarang);
        System.out.println("Harga Satuan : Rp." + barang.hargaSatuan);
        System.out.println("Jumlah       : " + barang.jumlah +" pcs");
        System.out.println("Harga Total  : Rp." + barang.hitungHargaTotal(barang.hargaSatuan, barang.jumlah));
        System.out.println("Diskon       : Rp." + barang.hitungDiskon(barang.hitungHargaTotal(barang.hargaSatuan, barang.jumlah)));
        System.out.println("Harga Bayar  : Rp." + barang.hitungHargaBayar(barang.hitungHargaTotal(barang.hargaSatuan, barang.jumlah), barang.hitungDiskon(barang.hitungHargaTotal(barang.hargaSatuan, barang.jumlah))));
    }
}
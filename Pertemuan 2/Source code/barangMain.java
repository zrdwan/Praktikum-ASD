public class barangMain {
    public static void main(String[] args) {
        barang b1 = new barang();
        b1.namaBarang = "Corsair 2 GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 10;
        b1.tambahStok(1);
        b1.kurangiStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.totalHarga(4);
        System.out.println("Harga 4 buah = "+ hargaTotal);
        barang b2 = new barang("Logitech", "Wireless Mouse", 25, 150000);
        b2.tampilBarang();
        barang b3 = new barang("Casablanca", "Parfum" , 17, 23000);
        b3.tampilBarang();
        int hargaTotal2= b3.totalHarga(9);
        System.out.println("Harga 9 buah = "+ hargaTotal2);
    }
}

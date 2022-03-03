public class barang {
        String namaBarang, jenisBarang;
        int stok,hargaSatuan, total;
    
        barang(){
        }
        barang(String nm, String jn, int st, int hs){
            namaBarang = nm;
            jenisBarang = jn;
            stok = st;
            hargaSatuan = hs;
        }
        void tampilBarang() {
            System.out.println("Nama = "+ namaBarang);
            System.out.println("Jenis = "+ jenisBarang);
            System.out.println("Stok = "+stok);
            System.out.println("Harga Satuan = "+hargaSatuan);
        }
    
        void tambahStok(int n) {
            stok=stok+n;
        }
    
        void kurangiStok(int n) {
            stok=stok-n;
        }
    
        int totalHarga(int jumlah){
            return total = jumlah * hargaSatuan;
        }
    }
    


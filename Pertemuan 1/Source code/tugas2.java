import java.util.Scanner;
public class tugas2{
	public static void main (String[] args){
		int menu; 
		do{
		Scanner sc = new Scanner(System.in);
            System.out.println("\n===========================================");
            System.out.println("SELAMAT DATANG DI MENU PEMILIHAN RUMUS KECEPATAN, JARAK, DAN WAKTU");
            System.out.println("===========================================");
            System.out.println("Silahkan Pilih Menu :");
            System.out.println("1. Rumus Kecepatan");
            System.out.println("2. Rumus Jarak");
            System.out.println("3. Rumus Waktu");
            System.out.println("4. Keluar Dari Program");
            System.out.print("Pilihan Menu Anda(1 / 2 / 3 / 4) : ");
            menu = sc.nextInt();
            switch(menu){
                case 1 : {
                    System.out.println("Menu 1. Menampilkan Perhitungan Rumus Kecepatan");
                    kecepatan();
                }break;
                case 2 : {
                    System.out.println("Menu 2. Menampilkan Perhitungan Rumus Jarak");
                    jarak();
                }break;
                case 3 : {
                    System.out.println("Menu 3. Menampilkan Perhitungan Rumus Waktu");
                    waktu();
                }break;
                case 4 : {
                    System.out.println("Exit");
                }
            }
		}while(menu > 0 && menu <= 3);	
	}

		public static void kecepatan() {
		double v,s,t, hasil;
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan jarak (dalam satuan km) : " );
		s = sc.nextDouble();
		System.out.print("Masukkan waktu (dalam satuan jam) : " );
		t = sc.nextDouble();
		hasil = s/t;
		System.out.println("Kecepatan yang ditempuh adalah " + hasil + " km/jam");
		System.out.println("");
		
		}
		
		public static void jarak(){
		double v,s,t, hasil;
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan kecepatan (dalam satuan km/jam) : " );
		v = sc.nextDouble();
		System.out.print("Masukkan waktu (dalam satuan jam) : " );
		t = sc.nextDouble();
		hasil = v*t;
		System.out.println("Jarak yang ditempuh adalah " + hasil + " km");
		System.out.println("");	
		
		}
		
		public static void waktu(){
		double v,s,t, hasil;
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan jarak (dalam satuan km) : " );
		s = sc.nextDouble();
		System.out.print("Masukkan kecepatan (dalam satuan km/jam) : " );
		v = sc.nextDouble();
		hasil = s/v;
		System.out.println("Waktu yang ditempuh adalah " + hasil + " jam");
		System.out.println("");
		
		}
	}	
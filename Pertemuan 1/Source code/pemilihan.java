import java.util.Scanner;
public class pemilihan{
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("\nPROGRAM MENGHITUNG NILAI");
	System.out.println("==========================");
	System.out.print("Nilai tugas : ");
	int tugas = sc.nextInt();
	System.out.print("Nilai uts : ");
	int uts = sc.nextInt();
	System.out.print("Nilai uas : ");
	int uas = sc.nextInt();
	System.out.println("==========================");
	System.out.println("==========================");
	double nilaiAkhir = (double) ((0.2*tugas)+(0.35*uts)+(0.45*uas));
	String nilaiHuruf;
	System.out.println("Nilai akhir = " + nilaiAkhir);
	if (nilaiAkhir > 80 && nilaiAkhir <=100){
            nilaiHuruf = "A";
        }
    else if (nilaiAkhir > 73 && nilaiAkhir <= 80){
            nilaiHuruf = "B+";
        }
    else if (nilaiAkhir > 65 && nilaiAkhir <= 73){
            nilaiHuruf = "B";
        }
    else if (nilaiAkhir > 60 && nilaiAkhir <= 65){
            nilaiHuruf = "C+";
        }
	else if (nilaiAkhir > 50 && nilaiAkhir <= 60){
            nilaiHuruf = "C";
		}
	else if (nilaiAkhir > 39 && nilaiAkhir <= 50){
            nilaiHuruf = "D";
		}
    else { nilaiHuruf = "E"; }
	System.out.println("Nilai Huruf = " +nilaiHuruf);
	
	System.out.println("==========================");
	    if (nilaiHuruf == "A" || nilaiHuruf == "B+" || nilaiHuruf == "B" || nilaiHuruf == "C+" || nilaiHuruf == "C"){
            System.out.println("Selamat anda Lulus");
        }
        else {
		System.out.println("Mohon maaf anda tidak lulus"); }
	
	}
}	
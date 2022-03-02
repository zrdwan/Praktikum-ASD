package code;
import java.util.Scanner;

public class tanahMain {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan jumlah tanah : ");
		int t = sc.nextInt();
		jualBeliTanah[] tanahArray = new jualBeliTanah[t];
		System.out.println();
		for(int i = 0; i < t; i++){
			tanahArray[i] = new jualBeliTanah();
			System.out.println("Tanah " + (i+1)); 
			System.out.print("Panjang : ");
			tanahArray[i].panjang = sc.nextInt();
			System.out.print("Lebar : ");
			tanahArray[i].lebar = sc.nextInt();
		}
		System.out.println();
		for(int i = 0; i < t; i++){
			System.out.println("Luas tanah " +(i+1)+" : " + tanahArray[i].luasTanah());
		}
		System.out.println();
		int y = 0; 
		int luas[] = new int[t];
		for (int i = 0; i < t; i++){
			luas[i] = tanahArray[i].luasTanah();
		}
		y = tanahArray[0].tanahTerluas(luas);
		System.out.println("Tanah terluas : Tanah " + (y+1));
	}
}
    
import java.util.Scanner;
public class perulangan{
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Masukkan NIM anda (10 digit) : ");
	int nim = sc.nextInt();
	System.out.println("===============================");
	int digit = nim % 100;
	System.out.print("n = ");
	if(digit < 10){
	   digit += 10;
	   }
	System.out.println(digit);
	for(int i=0; i<digit; i++){
            int hari = i%7;
            switch (hari) {
                case 0:
                    System.out.print("Senin ");
                    break;
                case 1:
                    System.out.print("Selasa ");
                    break;
                case 2:
                    System.out.print("Rabu ");
                    break;
                case 3:
                    System.out.print("Kamis ");
                    break;
                case 4:
                    System.out.print("Jum'at ");
                    break;
                case 5:
                    System.out.print("Sabtu ");
                    break;
                case 6:
                    System.out.print("Minggu ");
                    break;
                default:
                    break;
            }
	}
  }
}
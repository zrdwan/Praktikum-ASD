public class tugas1{
	public static void main (String[] args){
	int ani = 4, budi = 15, bina = 6, cita = 11;
	float total;
	System.out.println("\nHarga per customer : ");
	System.out.println("Ani  = Rp " +(4*4500));
	System.out.println("Budi = Rp " +(15*4500*0.05));
	System.out.println("Bina = Rp " +(6*4500));
	System.out.println("Cita = Rp " +(11*4500*0.05));
	
	total = (float)((4*4500) + (15*4500*0.05) + (6*4500) + (11*4500*0.05)) ; 
	System.out.println("Total pendapatan smile laundry per hari adalah Rp." + total);
	
	}
}
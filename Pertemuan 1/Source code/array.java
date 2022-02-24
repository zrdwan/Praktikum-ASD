public class array{
	public static void main (String[] args){
	System.out.println("\nToko Bunga Royal Garden");
	System.out.println("=======================");
	System.out.println("Laporan Stock Bunga");
	System.out.println("=======================");
	int [][] bunga = {
		{10, 5, 15, 7},
		{6, 11, 9, 12},
		{2, 10, 10, 5},
		{5, 7, 12, 9 }
	};

	int aglonema = 0, keladi = 0, alocasia = 0, mawar = 0,pendapatan, totalBunga;
	for (int i = 0; i < 4; i++){
		for(int j = 0;j < 4;j++){
			if(j==0){
				aglonema += bunga[i][j];
			}else if(j==1){
				keladi += bunga[i][j];
			}else if(j==2){
				alocasia += bunga[i][j];
			} else {
				mawar+= bunga[i][j];
			}
		}
	}
	
	totalBunga = (aglonema + keladi + alocasia + mawar);
	
	System.out.println("Jumlah Bunga seluruh cabang : " + totalBunga);
	System.out.println("Jumlah Bunga aglonema	    : " + aglonema);
	System.out.println("Jumlah Bunga keladi         : " + keladi);
	System.out.println("Jumlah Bunga alocasia       : " + alocasia);
	System.out.println("Jumlah Bunga mawar          : " + mawar);
	
	pendapatan = ((10-1)*75000) + ((5-2)*50000) + (15*60000) + ((7-5)*10000);
	System.out.println("\nTotal Pendapatan Royal Garden 1 jika semua bunga terjual habis adalah Rp: " + pendapatan);
	
	}
}	
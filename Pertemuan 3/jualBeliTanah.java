package code;

public class jualBeliTanah {
    int panjang, lebar;
	
	int luasTanah(){
		return panjang*lebar;
	}
	
	int tanahTerluas(int luas[]){
		int terluas = 0;
		int x = 0;
		for(int i = 0; i < luas.length; i++){
			if(luas[i] > terluas){
				terluas = luas[i];
				x = i;
			}
		}
		return x;
	}
}

package code;

public class setengahBola{
	int jari; 
	
	public setengahBola(int r){
		jari = r;
	}
	
	public double volume(){
		return 0.67*3.14*(jari*jari*jari);
	}
	
	public double luasPermukaan(){
		return 3.14*2*(jari*jari);
	}
}

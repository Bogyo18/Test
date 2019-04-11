package csomag;

public class allat{
	private int x;
	private int y;
	
	//x koordináta lekérése
	public int get_x(){
		return this.x;
	}
	
	//y koordináta lekérése
	public int get_y(){
		return this.y;
	}
	
	//lépés
	public void lep1et(int x, int y){
		this.x+=x;
		this.y+=y;
	}
	
	
	//elhelyezés
	public void elhelyez(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public allat(){
		
	}
}

package csomag;

public class allat{
	private int x;
	private int y;
	
	//x koordin�ta lek�r�se
	public int get_x(){
		return this.x;
	}
	
	//y koordin�ta lek�r�se
	public int get_y(){
		return this.y;
	}
	
	//l�p�s
	public void lep1et(int x, int y){
		this.x+=x;
		this.y+=y;
	}
	
	
	//elhelyez�s
	public void elhelyez(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public allat(){
		
	}
}

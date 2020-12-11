
import processing.core.PApplet;

public class Bala {
	
	private int x;
	private int y;
	private int dir; //0-abajo,1-derecha,2-izquierda,3-arriba
	

	public Bala(int x, int y, int dir) {
		
		this.x = x;
		this.y = y;
		this.dir = dir;
		
	}
	
	public void pintar(PApplet app) {
		app.fill(0);
		app.ellipse(x,y,10,10);
	 
		
	}
	
	public void mover() {
		switch (dir) {
		case 0:
			y+=5;
			break;
		case 1:
			x+=5;
			break;
		case 2:
			x-=5;
			break;
		case 3:
			y-=5;
			break;
			

		default:
			break;
		}
	}

}

package ejercicio4_Dibujos;

public class Punto{

	int x;
	int y;
	
	public Punto(int x, int y) {
		setX(x);
		setY(y);
	}
	


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}
	
	public void definirX() {
		this.x= x+x;
	}
	
	public void definirY() {
		this.y= y+y;
	}


	public void setY(int y) {
		this.y = y;
	}
	public void invertir() {
		int temp=x;
		x=y;
		y=temp;
	}
}


	

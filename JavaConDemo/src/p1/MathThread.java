package p1;

public class MathThread extends Thread{

	private int x,y;
	private int result;
	
	public MathThread(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	@Override
	public void run() {
		this.result = x+y;
		System.out.print(x);
		System.out.print(" + ");
		/*try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		System.out.print(y);
		System.out.println("= "+(x+y));
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


	public void setY(int y) {
		this.y = y;
	}


	public int getResult() {
		return result;
	}


	public void setResult(int result) {
		this.result = result;
	}

	
}

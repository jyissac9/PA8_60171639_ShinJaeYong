public class Circle extends Shape{
	//Circle Class�� Instance variable���̴�.
	public int x;
	public int y;
	public int radius;
	public int tx;
	public int ty;
	
	//Circle Class�� �������̸� ���� ���� parameter���� ���� �������ش�
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.tx = x;
		this.ty = y;
	}
	
	//getArea method�� Shape Class���� ��ӹ��� method�̰� circle�� ���̸� ���Ѵ�.
	public double getArea() {
		double area = radius*radius*(Math.PI);
		return area;
	}
	
	//getLength method�� Shape Class���� ��ӹ��� method�̰� circle�� �ѷ��� ���Ѵ�.
	public double getLength() {
		double length = 2*(Math.PI)*radius;
		return length;
	}
	
	//draw() method�� Drawable Interface���� ��ӹ޾ƿ´�.
	public void draw() {
		System.out.println("Circle center (" + (double) x + "," + (double) y + ")-radius(" + (double) (radius) +")" );
	}
	
	//move() method�� Movable Interface���� ��ӹ޾ƿ´�.
	public void move(double dx, double dy) {
		//tx,ty���ٰ� dx,dy�� �ڽŵ鿡 ���� ������ �ʱ�ȭ ��Ų��.
		tx = tx + (int) dx;
		ty = ty + (int) dy;
		
		System.out.println("Circle center moved to (" + (double) tx + "," + (double) ty + ")-radius(" + (double) (radius) +")");
	}
}

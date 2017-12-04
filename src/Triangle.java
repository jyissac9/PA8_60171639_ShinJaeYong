//Triangle class�� Shape�� ��ӹ޴´�
public class Triangle extends Shape {
	//Square Class�� Instance variable���̴�.
	public int x;
	public int y;
	public int width;
	public int bottom;
	
	//Triangle Class�� �������̸� ���� ���� parameter���� ���� �������ش�
	public Triangle(int x, int y, int width, int bottom) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.bottom = bottom;
	}
	//getArea method�� Shape Class���� ��ӹ��� method�̰� triangle�� ���̸� ���Ѵ�.
	public double getArea() {
		int area = width*bottom/2;
		return area;
	}
		
	//getLength method�� Shape Class���� ��ӹ��� method�̰� triangle�� �ѷ��� ���Ѵ�.
	public double getLength() {
		double c = Math.sqrt(width*width + bottom*bottom/4);
		double length = bottom + 2*c ;
		return length;
	}
			
	//draw() method�� Drawable Interface���� ��ӹ޾ƿ´�.
	public void draw() {
		System.out.println("Triangle (" + (double) x + "," + (double) y + ")-(" + (double) (x - bottom/2) + "," + (double) (y - width) +")-("+ (double) (x + bottom/2) + "," + (double) (y - width) +")" );
	}
	
	
	public void move(double dx, double dy) {}
}

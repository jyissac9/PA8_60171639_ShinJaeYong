//Square class�� Shape�� ��ӹ޴´�
public class Square extends Shape {
	//Square Class�� Instance variable���̴�.
	public int x;
	public int y;
	public int width;
	
	//Square Class�� �������̸� ���� ���� parameter���� ���� �������ش�
	public Square(int x, int y, int width) {
		this.x = x;
		this.y = y;
		this.width = width;
	}
	//getArea method�� Shape Class���� ��ӹ��� method�̰� square�� ���̸� ���Ѵ�.
	public double getArea() {
		int area = width*width;
		return area;
	}
		
	//getLength method�� Shape Class���� ��ӹ��� method�̰� square�� �ѷ��� ���Ѵ�.
	public double getLength() {
		int length = (width + width) * 2 ;
		return length;
	}
		
	//draw() method�� Drawable Interface���� ��ӹ޾ƿ´�.
	public void draw() {
		System.out.println("Square (" + (double) x + "," + (double) y + ")-(" + (double) (x + width) + "," + (double) (y - width) +")" );
	}
	
	public void move(double dx, double dy) {}
}

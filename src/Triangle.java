//Triangle class는 Shape를 상속받는다
public class Triangle extends Shape {
	//Square Class의 Instance variable들이다.
	public int x;
	public int y;
	public int width;
	public int bottom;
	
	//Triangle Class의 생성자이며 전달 받은 parameter들을 새로 정의해준다
	public Triangle(int x, int y, int width, int bottom) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.bottom = bottom;
	}
	//getArea method는 Shape Class에서 상속받은 method이고 triangle의 넓이를 구한다.
	public double getArea() {
		int area = width*bottom/2;
		return area;
	}
		
	//getLength method는 Shape Class에서 상속받은 method이고 triangle의 둘레를 구한다.
	public double getLength() {
		double c = Math.sqrt(width*width + bottom*bottom/4);
		double length = bottom + 2*c ;
		return length;
	}
			
	//draw() method는 Drawable Interface에서 상속받아온다.
	public void draw() {
		System.out.println("Triangle (" + (double) x + "," + (double) y + ")-(" + (double) (x - bottom/2) + "," + (double) (y - width) +")-("+ (double) (x + bottom/2) + "," + (double) (y - width) +")" );
	}
	
	
	public void move(double dx, double dy) {}
}

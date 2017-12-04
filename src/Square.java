//Square class는 Shape를 상속받는다
public class Square extends Shape {
	//Square Class의 Instance variable들이다.
	public int x;
	public int y;
	public int width;
	
	//Square Class의 생성자이며 전달 받은 parameter들을 새로 정의해준다
	public Square(int x, int y, int width) {
		this.x = x;
		this.y = y;
		this.width = width;
	}
	//getArea method는 Shape Class에서 상속받은 method이고 square의 넓이를 구한다.
	public double getArea() {
		int area = width*width;
		return area;
	}
		
	//getLength method는 Shape Class에서 상속받은 method이고 square의 둘레를 구한다.
	public double getLength() {
		int length = (width + width) * 2 ;
		return length;
	}
		
	//draw() method는 Drawable Interface에서 상속받아온다.
	public void draw() {
		System.out.println("Square (" + (double) x + "," + (double) y + ")-(" + (double) (x + width) + "," + (double) (y - width) +")" );
	}
	
	public void move(double dx, double dy) {}
}

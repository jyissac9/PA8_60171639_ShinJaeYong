import java.util.ArrayList;
//Bear class는 Drawable를 구현하며, Drawable들을 객체로 리스트에 저장한다
public class Bear implements Drawable {
	//Bear class의 Instance Variables이다.
	public int x;
	public int y;
	public int radius;
	public int width;
	
	//Bear class의 생성자이다.
	public Bear(int x, int y, int width) {
		this.x = x;
		this.y = y;
		this.radius = width/2;
		this.width = width;
	}
	
	//Drawable type의 ArrayList myList를 선언한다.
	ArrayList<Drawable> myList = new ArrayList<Drawable>();
	
	//listAdd() method는 각각의 도형들을 myList에 add하여 준다.
	public void listAdd() {
		Drawable r = new Rectangle(x - width, y - width, 2*width, 2*width);
		Drawable c1 = new Circle(x - width,y - width,radius);
		Drawable c2 = new Circle(x + width,y - width,radius);
		myList.add(r);
		myList.add(c1);
		myList.add(c2);
	}
	
	//Drawable Interface에서 상속받은 draw() method는 listAdd() 함수를 실행하고, 각 리스트에서 객체들을 불러내어 draw()시킨다.
	public void draw() {
		listAdd();
		System.out.println("Bear");
		for (int i=0;i<3;i++) {
			myList.get(i).draw();
		}
	}
}

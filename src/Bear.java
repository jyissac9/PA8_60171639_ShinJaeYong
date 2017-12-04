import java.util.ArrayList;
//Bear class�� Drawable�� �����ϸ�, Drawable���� ��ü�� ����Ʈ�� �����Ѵ�
public class Bear implements Drawable {
	//Bear class�� Instance Variables�̴�.
	public int x;
	public int y;
	public int radius;
	public int width;
	
	//Bear class�� �������̴�.
	public Bear(int x, int y, int width) {
		this.x = x;
		this.y = y;
		this.radius = width/2;
		this.width = width;
	}
	
	//Drawable type�� ArrayList myList�� �����Ѵ�.
	ArrayList<Drawable> myList = new ArrayList<Drawable>();
	
	//listAdd() method�� ������ �������� myList�� add�Ͽ� �ش�.
	public void listAdd() {
		Drawable r = new Rectangle(x - width, y - width, 2*width, 2*width);
		Drawable c1 = new Circle(x - width,y - width,radius);
		Drawable c2 = new Circle(x + width,y - width,radius);
		myList.add(r);
		myList.add(c1);
		myList.add(c2);
	}
	
	//Drawable Interface���� ��ӹ��� draw() method�� listAdd() �Լ��� �����ϰ�, �� ����Ʈ���� ��ü���� �ҷ����� draw()��Ų��.
	public void draw() {
		listAdd();
		System.out.println("Bear");
		for (int i=0;i<3;i++) {
			myList.get(i).draw();
		}
	}
}

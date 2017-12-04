abstract public class Shape implements Drawable,Movable{ 
//Shape는 Drawable,Movable Interface를 구현하고 abstract class이므로 무조건 상속시켜야한다.
	public abstract double getArea(); //getArea, getLength method도 하위 클래스에서 새롭게 정의 되어야 할 필요가 있으니
	public abstract double getLength();//abstract화 시킨다. 이때 method의 body는 없어야 한다.
}
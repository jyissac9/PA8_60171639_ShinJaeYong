//Text Class는 Drawable Interface만 구현한다.
public class Text implements Drawable {
	//Text Class의 Instance Variable
	String msg;
	
	//Text Class의 생성자, 전달받은 parameter를 새롭게 정의한다.
	public Text(String msg) {
		this.msg = msg;
	}
	
	//Drawable Interface에서 상속받은 method로써 아래의 역할을 수행한다.
	public void draw() {
		System.out.println(msg);
	}
}

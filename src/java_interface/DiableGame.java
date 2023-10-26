package java_interface;

public class DiableGame implements Gameconsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("위로 점프");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("쪼그려 앉기");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("아래쪽으로 이동");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("위쪽으로 이동");
	}

}

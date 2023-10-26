package java_interface;

interface Playable {
	void play();
	void pause();
	void stop();
}

class MP3Player implements Playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("MP3Player play");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("MP3Player pause");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("MP3Player stop");
	}
	
}

class DVDPlayer implements Playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("DVDPlayer play");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("DVDPlayer pause");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("DVDPlayer stop");
	}
	
}

public class interfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MP3Player M = new MP3Player();
		
		DVDPlayer D = new DVDPlayer();
		
		M.play();
		M.pause();
		M.stop();
		D.play();
		D.pause();
		D.stop();
	}

}

package iinterface;

public class SmartPhone implements VideoPlayer, MusicPlayer {

	@Override
	public void playMusic() {
		System.out.println("O smartphone esta tocando musica!");
	}

	@Override
	public void pauseMusic() {
		System.out.println("O smartphone esta pausando musica!");
	}

	@Override
	public void stopMusic() {
		System.out.println("O smartphone esta parando musica!");
	}

	@Override
	public void playVideo() {
		System.out.println("O smartphone esta reproduzindo video!");
	}

	@Override
	public void pauseVideo() {
		System.out.println("O smartphone esta pausando video!");
	}

	@Override
	public void stopVideo() {
		System.out.println("O smartphone esta parando video!");
	}

}

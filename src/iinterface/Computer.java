package iinterface;

public class Computer implements VideoPlayer, MusicPlayer {
	
	@Override
	public void playMusic() {
		System.out.println("O computador esta tocando musica!");
	}

	@Override
	public void pauseMusic() {
		System.out.println("O computador esta pausando musica!");
	}

	@Override
	public void stopMusic() {
		System.out.println("O computador esta parando musica!");
	}

	@Override
	public void playVideo() {
		System.out.println("O computador esta reproduzindo video!");
	}

	@Override
	public void pauseVideo() {
		System.out.println("O computador esta pausando video!");
	}

	@Override
	public void stopVideo() {
		System.out.println("O computador esta parando video!");
	}


}

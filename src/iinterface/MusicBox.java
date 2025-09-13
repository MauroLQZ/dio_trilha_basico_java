package iinterface;

public class MusicBox implements MusicPlayer{
	@Override
	public void playMusic() {
		System.out.println("O MusicBox esta tocando musica!");
	}

	@Override
	public void pauseMusic() {
		System.out.println("O MusicBox esta pausando musica!");
	}

	@Override
	public void stopMusic() {
		System.out.println("O MusicBox esta parando musica!");
	}

}

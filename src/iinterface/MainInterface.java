package iinterface;

public class MainInterface {

	public static void main(String[] args) {
		//var music = MusicPlayer.music;
		MusicPlayer musicPlayer = new Computer();
		//Computer musicPlayer = new Computer();
		//runMusic(musicPlayer);
		runMusic(new Computer());
		//runVideo(new Computer());
		runVideo((VideoPlayer)musicPlayer);
		
		
		/*MusicPlayer musicPlayer = new MusicPlayer() {
			@Override
			public void playMusic() {
				System.out.println("Tocando musica!");
			}
			@Override
			public void pauseMusic() {
				System.out.println("Pausando musica!");
			}
			@Override
			public void stopMusic() {
				System.out.println("Parando musica!");
			}
		};
		MusicPlayer musicPlayer2 = new MusicPlayer() {
			@Override
			public void playMusic() {
				System.out.println("2- Tocando musica!");
			}
			@Override
			public void pauseMusic() {
				System.out.println("2- Pausando musica!");
			}
			@Override
			public void stopMusic() {
				System.out.println("2- Parando musica!");
			}
		};
        musicPlayer.playMusic();
        musicPlayer2.playMusic();
		System.out.println("1".getClass());
        System.out.println(musicPlayer.getClass());
        System.out.println(musicPlayer2.getClass());*/
	}
    public static void runVideo(VideoPlayer videoPlayer) {
    	videoPlayer.playVideo();
    }
    public static void runMusic(MusicPlayer musicPlayer) {
    	musicPlayer.playMusic();
    }
}

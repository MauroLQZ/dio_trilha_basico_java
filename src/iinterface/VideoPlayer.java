package iinterface;

/**Ex Uma interface pode extends varias interfaces*/
public interface VideoPlayer extends MusicPlayer, MusicPool, MusicPull{
	public void playVideo();
	public void pauseVideo();
	public void stopVideo();

}

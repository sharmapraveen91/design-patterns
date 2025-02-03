package Structural;

// Target interface
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// Adaptee class
class VideoPlayer {
    void playVideo(String fileName) {
        System.out.println("Playing video: " + fileName);
    }
}

// Adapter class
class MediaAdapter implements MediaPlayer {
    private VideoPlayer videoPlayer;
    
    public MediaAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }
    
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("video")) {
            videoPlayer.playVideo(fileName);
        }
    }
}

// Client code
class AudioPlayer implements MediaPlayer {
    MediaPlayer mediaAdapter;
    
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("audio")) {
            System.out.println("Playing audio: " + fileName);
        } else if(audioType.equalsIgnoreCase("video")) {
            mediaAdapter = new MediaAdapter(new VideoPlayer());
            mediaAdapter.play(audioType, fileName);
        }
    }
}

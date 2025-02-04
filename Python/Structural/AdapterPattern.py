# Target interface
class MediaPlayer:
    def play(self, audio_type, file_name):
        pass

# Adaptee class
class VideoPlayer:
    def play_video(self, file_name):
        print(f"Playing video: {file_name}")

# Adapter class
class MediaAdapter(MediaPlayer):
    def __init__(self, video_player):
        self.video_player = video_player

    def play(self, audio_type, file_name):
        if audio_type.lower() == "video":
            self.video_player.play_video(file_name)

# Client code
class AudioPlayer(MediaPlayer):
    def __init__(self):
        self.media_adapter = None

    def play(self, audio_type, file_name):
        if audio_type.lower() == "audio":
            print(f"Playing audio: {file_name}")
        elif audio_type.lower() == "video":
            self.media_adapter = MediaAdapter(VideoPlayer())
            self.media_adapter.play(audio_type, file_name)

# Client usage
audio_player = AudioPlayer()
audio_player.play("audio", "song.mp3")
audio_player.play("video", "movie.mp4")

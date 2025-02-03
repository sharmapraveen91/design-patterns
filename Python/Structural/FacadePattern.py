# Subsystems
class Amplifier:
    def on(self):
        print("Amplifier on")

    def off(self):
        print("Amplifier off")

class Projector:
    def on(self):
        print("Projector on")

    def off(self):
        print("Projector off")

class DVDPlayer:
    def on(self):
        print("DVD Player on")

    def off(self):
        print("DVD Player off")

# Facade
class HomeTheaterFacade:
    def __init__(self, amplifier, projector, dvd_player):
        self.amplifier = amplifier
        self.projector = projector
        self.dvd_player = dvd_player

    def watch_movie(self):
        print("Get ready to watch a movie...")
        self.amplifier.on()
        self.projector.on()
        self.dvd_player.on()

    def end_movie(self):
        print("Shutting down home theater...")
        self.amplifier.off()
        self.projector.off()
        self.dvd_player.off()

# Client usage
amplifier = Amplifier()
projector = Projector()
dvd_player = DVDPlayer()

home_theater = HomeTheaterFacade(amplifier, projector, dvd_player)
home_theater.watch_movie()
home_theater.end_movie()

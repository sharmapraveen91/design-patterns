package Structural;

// Subsystems
class Amplifier {
    public void on() { System.out.println("Amplifier on."); }
    public void off() { System.out.println("Amplifier off."); }
}

class Projector {
    public void on() { System.out.println("Projector on."); }
    public void off() { System.out.println("Projector off."); }
}

class DVDPlayer {
    public void on() { System.out.println("DVD Player on."); }
    public void off() { System.out.println("DVD Player off."); }
}

// Facade
class HomeTheaterFacade {
    private Amplifier amplifier;
    private Projector projector;
    private DVDPlayer dvdPlayer;
    
    public HomeTheaterFacade(Amplifier amplifier, Projector projector, DVDPlayer dvdPlayer) {
        this.amplifier = amplifier;
        this.projector = projector;
        this.dvdPlayer = dvdPlayer;
    }
    
    public void watchMovie() {
        amplifier.on();
        projector.on();
        dvdPlayer.on();
        System.out.println("Movie is now playing!");
    }
    
    public void endMovie() {
        amplifier.off();
        projector.off();
        dvdPlayer.off();
        System.out.println("Movie ended.");
    }
}

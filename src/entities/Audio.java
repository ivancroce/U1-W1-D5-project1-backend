package entities;

import interfaces.Playable;

public class Audio extends MultimediaElement implements Playable {
    // Attributes
    private int duration;
    private int volume;

    // Constructor
    public Audio(String title, int duration, int volume) {
        super(title);
        this.duration = duration;
        this.volume = volume;
    }

    // Methods
    public void increaseVolume() {
        this.volume++;
    }

    public void decreaseVolume() {
        if (this.volume > 0) {
            this.volume--;
        }
    }

    @Override
    public void play() {
        for (int i = 0; i < this.duration; i++) {
            System.out.print(this.title);
            for (int j = 0; j < this.volume; j++) {
                System.out.print(" !");
            }
            System.out.println();
        }
    }
}

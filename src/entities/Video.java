package entities;

import interfaces.Playable;

public class Video extends MultimediaElement implements Playable {
    // Attributes
    private int duration;
    private int volume;
    private int brightness;

    public Video(String title, int duration, int volume, int brightness) {
        super(title);
        this.duration = duration;
        this.volume = volume;
        this.brightness = brightness;
    }

    // Methods
    public void volumeUp() {
        this.volume++;
    }

    public void volumeDown() {
        if (this.volume > 0) {
            this.volume--;
        }
    }

    public void increaseBrightness() {
        this.brightness++;
    }

    public void decreaseBrightness() {
        if (this.brightness > 0) {
            this.brightness--;
        }
    }

    @Override
    public void play() {
        for (int i = 0; i < this.duration; i++) {
            System.out.print(this.title);
            for (int j = 0; j < this.volume; j++) {
                System.out.print(" !");
            }
            for (int k = 0; k < this.brightness; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

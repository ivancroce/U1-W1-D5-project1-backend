package entities;

public class Image extends MultimediaElement {
    // private: only accessible within this class, it can't be changed directly from the outside.
    private int brightness;

    // Constructor
    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }

    // Methods
    public void increaseBrightness() {
        this.brightness++;
    }

    public void decreaseBrightness() {
        if (this.brightness > 0) {
            this.brightness--;
        }
    }

    // Method show() specific to Image
    public void show() {
        System.out.print(this.title);
        for (int i = 0; i < this.brightness; i++) {
            System.out.print(" *");
        }
        System.out.println(" ");
    }
}

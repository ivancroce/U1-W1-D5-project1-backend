import entities.Image;

public class MediaPlayer {
    public static void main(String[] args) {
        // Test Image
        System.out.println("--- Test Image ---");

        Image photoTest = new Image("Title Test", 5);

        System.out.println("--- Test method show() with brightness 5 ---");
        photoTest.show();

        System.out.println();
        System.out.println("--- Test increaseBrightness ---");
        photoTest.increaseBrightness();
        photoTest.increaseBrightness();
        photoTest.show();

        // Testing if this.brightness > 0
        System.out.println();
        System.out.println("--- Test decreaseBrightness ---");
        photoTest.decreaseBrightness();
        photoTest.decreaseBrightness();
        photoTest.decreaseBrightness();
        photoTest.decreaseBrightness();
        photoTest.decreaseBrightness();
        photoTest.decreaseBrightness();
        photoTest.decreaseBrightness();
        photoTest.decreaseBrightness();
        photoTest.decreaseBrightness();
        photoTest.decreaseBrightness();
        photoTest.show();
    }
}
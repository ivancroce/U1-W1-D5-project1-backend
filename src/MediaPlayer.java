import entities.Audio;
import entities.Image;
import entities.MultimediaElement;
import entities.Video;

import java.util.Scanner;

public class MediaPlayer {
    public static void main(String[] args) {
        // Array that contains 5 elements.
        MultimediaElement[] playlist = new MultimediaElement[5];
        Scanner scanner = new Scanner(System.in);

        // for loop to create the 5 elements.
        for (int i = 0; i < 5; i++) {
            System.out.println("--- Element " + (i + 1) + " ---");
            System.out.println("What type of element do u wanna create?");
            System.out.println("1=Image, 2=Audio, 3=Video: ");

            int type = Integer.parseInt(scanner.nextLine());

            System.out.println("Title: ");
            String title = scanner.nextLine();

            switch (type) {
                // Image
                case 1:
                    System.out.print("Brightness: ");
                    int brightnessImage = Integer.parseInt(scanner.nextLine());
                    playlist[i] = new Image(title, brightnessImage);
                    break;
                // Audio
                case 2:
                    System.out.println("Duration: ");
                    int durationAudio = Integer.parseInt(scanner.nextLine());
                    ;
                    System.out.println("Volume: ");
                    int volumeAudio = Integer.parseInt(scanner.nextLine());
                    playlist[i] = new Audio(title, durationAudio, volumeAudio);
                    break;
                // Video
                case 3:
                    System.out.println("Duration: ");
                    int durationVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Volume: ");
                    int volumeVideo = Integer.parseInt(scanner.nextLine());
                    System.out.print("Brightness: ");
                    int brightnessVideo = Integer.parseInt(scanner.nextLine());
                    playlist[i] = new Video(title, durationVideo, volumeVideo, brightnessVideo);
                    break;
                default:
                    System.out.println("Number not valid, try again.");
                    i--;
                    break;
            }
        }

        scanner.close();
    }
}
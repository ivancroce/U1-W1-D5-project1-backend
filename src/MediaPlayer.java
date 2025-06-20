import entities.Audio;
import entities.Image;
import entities.MultimediaElement;
import entities.Video;
import interfaces.Playable;

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
                    System.out.print("Duration: ");
                    int durationAudio = Integer.parseInt(scanner.nextLine());
                    ;
                    System.out.print("Volume: ");
                    int volumeAudio = Integer.parseInt(scanner.nextLine());
                    playlist[i] = new Audio(title, durationAudio, volumeAudio);
                    break;
                // Video
                case 3:
                    System.out.print("Duration: ");
                    int durationVideo = Integer.parseInt(scanner.nextLine());
                    System.out.print("Volume: ");
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

        // Media Player
        int choice;
        do {
            System.out.println("--- Media Player ---");
            System.out.println("Which element do u wanna play?");
            System.out.print("1-5 or 0 to quit: ");

            choice = Integer.parseInt(scanner.nextLine());

            if (choice > 0 && choice <= 5) {
                MultimediaElement elementToPlay = playlist[choice - 1];

                System.out.println("Playing: " + elementToPlay.getTitle());

                // the obj is an instance of Playable? casting in Playable to get play() method
                if (elementToPlay instanceof Playable) {
                    ((Playable) elementToPlay).play();

                    // the obj is an instance of Image? casting in Image to get show() method
                } else if (elementToPlay instanceof Image) {
                    ((Image) elementToPlay).show();
                }
            } else if (choice != 0) {
                System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
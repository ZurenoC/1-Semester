import java.util.Scanner;

public class Test33 {

    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q og Q to quit");
        String response = scanner.next();

        if(!response.equals("q") && !response.equals("Q"))
            System.out.println("You quit the game");
        else
            System.out.println("You are still playing the game *Try again*");



    }
}
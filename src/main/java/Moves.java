import java.util.Random;
import java.util.Scanner;

public class Moves {

    public String getAiMove() {
        String[] rps = {"1", "2", "3"};
        String aiMove = rps[new Random().nextInt(rps.length)];
        return aiMove;
    }

    public String getMyMove() {
        Scanner in = new Scanner(System.in);
        String myMove = in.nextLine();
return  myMove;
    }

    }

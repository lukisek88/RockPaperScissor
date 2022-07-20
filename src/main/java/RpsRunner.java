import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        boolean end = false;
        System.out.println("Welcome");
        System.out.println("Type: n - Start Game Type: x - Quit");
        Engine start = new Engine();
        Moves process = new Moves();
        Scanner text = new Scanner(System.in);


        while (!end){
            String mymove = process.getMyMove();

            if(mymove.equals("n")) {
                System.out.println("Start Game? Y/N");
                String c = process.getMyMove();
                if (c.equals("Y")) {
                    System.out.print("Number Wins: ");
                    Integer key = text.nextInt();
                    start.getStart(key);
                } else if (c.equals("N")) {
                    System.out.println("End Game");
                    end = true;
                }
            }

                  if (mymove.equals("x")){
                System.out.println("End Game? Y/N");
                String b = process.getMyMove();
                if (b.equals("Y")){
                    System.out.println("END GAME");
               end = true;
                }else if (b.equals("N")){
                    System.out.println("Type n New Game Type x to Quit");

                }
           }
           }





        if (start.mySum == start.aiSum) {
            System.out.println("Tie Nobody Wins");
            System.out.println("Your Points: " + start.mySum + " Ai Points: " + start.aiSum);

        } else if (start.mySum > start.aiSum) {
            System.out.println("You win the Battle");
            System.out.println("Your Points: " + start.mySum + " Ai Points: " + start.aiSum);

        } else {
            System.out.println("Ai win the battle");
            System.out.println("Your Points: " + start.mySum + " Ai Points: " + start.aiSum);

        }
    }
    }

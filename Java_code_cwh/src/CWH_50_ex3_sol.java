import java.util.Random;
import java.util.Scanner;

class Game
{
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;
    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game()
    {
        Random random = new Random();
        this.number = random.nextInt(100);
    }
    void takeUserInput()
    {
        System.out.println("Please Enter your Guess number : ");
        Scanner sc = new Scanner(System.in);
        this.inputNumber = sc.nextInt();
    }
    boolean isCorrect()
    {
        noOfGuesses++;
        if(inputNumber==number){
            System.out.format("Yes You guessed it right, it was %d in %d attempts",number,noOfGuesses);
            return true;
        }
        else if (inputNumber<number){
            System.out.println("Too Low..");
        }
        else if (inputNumber>number){
            System.out.println("Too High..");
        }
        return false;
    }
}

public class CWH_50_ex3_sol
{
    public static void main(String[] args)
    {
        Game g = new Game();
        boolean b=false;
        while (!b)
        {
            g.takeUserInput();
            b = g.isCorrect();
        }
    }
}
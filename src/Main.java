import database.Parse;
import prompt.Command;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String answer;

        do
        {
            System.out.println("What do you want to do?");
            new Command(new Scanner(System.in).nextLine(), new Parse());


            System.out.println("ok? [y/n]");
            answer = new Scanner(System.in).nextLine();
            if (answer.charAt(0) != 'n') answer = "y";
        }
        while (answer.charAt(0) == 'n');

    }
}
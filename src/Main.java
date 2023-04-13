import database.Parse;
import prompt.Command;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("What do you want to do?");
        new Command(new Scanner(System.in).nextLine(), new Parse());
    }
}
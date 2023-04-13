package database;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DatabaseAbilities
{

    public static void add(String name, String link)
    {
        ArrayList<String> dataLines = new RawData().getDataLines();
        dataLines.add(name + "#" + link);
        System.out.println(name + " has been added");
        rewrite(dataLines);
    }

    public static void remove(String name)
    {
        ArrayList<String> dataLines = new RawData().getDataLines();

        boolean done = false;

        for (int i = 0; i < dataLines.size(); i++)
        {
            if (dataLines.get(i).contains(name))
            {
                dataLines.remove(i);
                rewrite(dataLines);
                System.out.println(name + " has been removed");
                done = true;
                break;
            }
        }

        if (!done) System.out.println(name + " has not been found");

    }

    public static void change(String name, String newLink)
    {
        ArrayList<String> dataLines = new RawData().getDataLines();

        boolean done = false;

        for (int i = 0; i < dataLines.size(); i++)
        {
            if (dataLines.get(i).contains(name))
            {
                dataLines.set(i, name + "#" + newLink);
                rewrite(dataLines);
                System.out.println(name + " has been changed");
                done = true;
                break;
            }
        }

        if (!done) System.out.println(name + " has not been found");
    }

    public static void list()
    {
        ArrayList<String> names = new Parse().getNames();

        String answer = null;
        for (int i = 0; i < names.size(); i++)
        {
            if (answer == null) answer = "These are the saved shortcuts:\n-> " + names.get(i);
            else answer += "\n-> " + names.get(i);
        }

        System.out.println(answer);
    }

    private static void rewrite(ArrayList<String> dataLines)
    {
        File file = new File("links.txt");
        try
        {
            FileWriter writer = new FileWriter(file);
            for (String line: dataLines) writer.write(line + "\n");
            writer.close();
        }catch (IOException e){e.printStackTrace();}
    }

}

package database;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RawData
{
    private ArrayList<String> dataLines;
    protected RawData()
    {
        dataLines = new ArrayList<>();

        File file = new File("links.txt");

        try
        {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) dataLines.add(line);
        }
        catch (IOException e){e.printStackTrace();}
    }

    protected ArrayList<String> getDataLines(){return dataLines;}

}

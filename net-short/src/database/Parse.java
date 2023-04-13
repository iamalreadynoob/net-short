package database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Parse
{
    private ArrayList<String> names;
    private Map <String, String> links;
    public Parse()
    {
        names = new ArrayList<>();
        links = new HashMap<>();

        ArrayList<String> dataLines = new RawData().getDataLines();

        for (String line: dataLines)
        {
            String name = null;
            String link = null;

            int loc = 0;

            while (line.charAt(loc) != '#')
            {
                if (name == null) name = Character.toString(line.charAt(loc));
                else name += Character.toString(line.charAt(loc));

                loc++;
            }

            loc++;

            link = line.substring(loc);

            names.add(name);
            links.put(name, link);
        }

    }

    public ArrayList<String> getNames() {return names;}

    public Map<String, String> getLinks() {return links;}

}

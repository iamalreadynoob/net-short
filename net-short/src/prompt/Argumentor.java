package prompt;

import java.util.ArrayList;

public class Argumentor
{
    private ArrayList<String> args;
    protected Argumentor(String line)
    {
        args = new ArrayList<>();
        parser(line);
    }

    protected ArrayList<String> getArgs() {return args;}

    private void parser(String line)
    {
        int loc = 0;

        while (loc < line.length())
        {
            if (line.charAt(loc) != ' ')
            {
                String arg = null;

                while (loc < line.length() && line.charAt(loc) != ' ')
                {
                    if (arg == null) arg = Character.toString(line.charAt(loc));
                    else arg += Character.toString(line.charAt(loc));

                    loc++;
                }

                args.add(arg);
            }

            loc++;
        }
    }

}

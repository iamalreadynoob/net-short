package prompt;

import database.DatabaseAbilities;

import java.util.ArrayList;

public class CommandHandler
{

    protected CommandHandler(ArrayList<String> commandLine)
    {
        general(commandLine);
    }

    private void general(ArrayList<String> commandLine)
    {
        try
        {
            if (commandLine.get(0).equals("add")) {DatabaseAbilities.add(commandLine.get(1), commandLine.get(2));}
            else if (commandLine.get(0).equals("remove")) {DatabaseAbilities.remove(commandLine.get(1));}
            else if (commandLine.get(0).equals("change")) {DatabaseAbilities.change(commandLine.get(1), commandLine.get(2));}
            else if (commandLine.get(0).equals("list")) {DatabaseAbilities.list();}

        }
        catch(Exception e){System.out.println("expected arguments have not been found");}
    }

}

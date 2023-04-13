package prompt;

import database.Parse;

import java.util.ArrayList;
import java.util.Map;

public class Command
{
    private ArrayList<String> names, commands;
    private Map<String, String> links;
    public Command(String command, Parse parser)
    {
        names = parser.getNames();
        links = parser.getLinks();

        commands = new ArrayList<>();
        commands.add("add");
        commands.add("change");
        commands.add("remove");
        commands.add("list");

        process(command);
    }

    private void process(String command)
    {
        if (names.contains(command)) new LinkOpener(links.get(command));
        else if (commands.contains(new Argumentor(command).getArgs().get(0))) {new CommandHandler(new Argumentor(command).getArgs());}
        else {System.out.println("Non-defined argument(s)");}
    }

}

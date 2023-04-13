package prompt;

import java.awt.*;
import java.net.URI;

public class LinkOpener
{

    private URI uri;
    protected LinkOpener(String link)
    {
        try {uri = new URI(link);}
        catch (Exception e) {uri = null;}

        open();
    }

    private void open()
    {
        try
        {
            if (Desktop.isDesktopSupported())
            {
                Desktop desktop = Desktop.getDesktop();

                if (desktop.isSupported(Desktop.Action.BROWSE)) desktop.browse(uri);
            }
        }catch (Exception e){System.out.println("the link is not working");}
    }

}

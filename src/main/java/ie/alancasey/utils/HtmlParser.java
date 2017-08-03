package ie.alancasey.utils;

import ie.alancasey.api.Player;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.util.HashMap;

/**
 * Created by alan on 18/06/17.
 */
public abstract class HtmlParser {

    static TeamIdRetriever teamIdRetriever = new TeamIdRetriever();

    abstract Elements getPlayerHtml(final Document document);

    abstract Player getPlayerInfoFromHtml(final Element playerElement);

    HashMap<String, Player> parseHtml(final String htmlFilePath) throws Exception {
        File htmlData = new File(htmlFilePath);
        Document htmlDoc = Jsoup.parse(htmlData, "UTF-8");
        Elements playerHtmlElements = getPlayerHtml(htmlDoc);

        HashMap<String, Player> players = new HashMap<>();
        for(Element e: playerHtmlElements){
            Player player = getPlayerInfoFromHtml(e);
            players.put(player.getName(), player);
        }

        return players;
    }

    String escapeSingleQuoteCharacter(String SomeString){
        return SomeString.replace("'","''");
    }

}

package ie.alancasey.utils;

import ie.alancasey.api.Player;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Created by alan on 18/06/17.
 */
public class FantasyProsDataParser extends HtmlParser {


    Elements getPlayerHtml(final Document document){
        return document.getElementsByTag("tr");
    }

    Player getPlayerInfoFromHtml(final Element playerElement){
        Elements children = playerElement.children();
        String name = escapeSingleQuoteCharacter(getNameFromHtml(children.get(1).html()));
        Long team_id = teamIdRetriever.getTeamId(getTeamFromHtml(children.get(1).html()));
        double fantasyProsValue = getValueFromHtml(children.get(3).html());

        return new Player(name, team_id,fantasyProsValue);
    }

    private String getNameFromHtml(final String htmlString){
        return htmlString.substring(0, htmlString.indexOf("(")).trim();
    }

    private String getTeamFromHtml(final String htmlString){
        return htmlString.substring(htmlString.indexOf("(")+1, htmlString.length()-5).trim();
    }

    private double getValueFromHtml(final String htmlString){
        double value = Double.parseDouble(htmlString);
        if(value < 0){
            return 0;
        } else {
            return value;
        }
    }
}

package ie.alancasey.utils;

import ie.alancasey.api.Player;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Parse the raw Yahoo data from HTML into SQL inserts
 *
 */

public class YahooDataParser extends HtmlParser {

    Elements getPlayerHtml(final Document document){
        return document.getElementsByClass("ys-player");
    }

    Player getPlayerInfoFromHtml(final Element playerElement){
        Elements children = playerElement.children();
        int rank = Integer.parseInt(children.get(3).html());
        String name = escapeSingleQuoteCharacter(children.get(1).getElementsByTag("span").get(1).html());
        String position = children.get(1).getElementsByTag("span").get(2).children().get(1).html();
        Long teamId = teamIdRetriever.getTeamId(children.get(1).getElementsByTag("span").get(2).children().get(0).html());
        double yahooProjectValue = Double.parseDouble(children.get(0).html());
        double yahooAvgValue = getAvgValue(children.get(4).html());
        double lastYearTotalPoints = Double.parseDouble(children.get(5).html());

        return new Player(rank, name, teamId, position,
                yahooProjectValue, yahooAvgValue, lastYearTotalPoints);
    }

    private double getAvgValue(final String stringValue){
        if(stringValue.equalsIgnoreCase("-")){
            return 0.0;
        } else {
            return Double.parseDouble(stringValue);
        }
    }
}
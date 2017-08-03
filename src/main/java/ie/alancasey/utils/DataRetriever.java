package ie.alancasey.utils;

import ie.alancasey.api.Player;

import java.util.HashMap;

public class DataRetriever {

    private HtmlParser fantasyProsParser;
    private HtmlParser yahooParser;

    public DataRetriever(){
        this.fantasyProsParser = new FantasyProsDataParser();
        this.yahooParser = new YahooDataParser();
    }

    public HashMap<String, Player> getDataFromHtml() throws Exception {
        HashMap<String, Player> fantasyProsPlayers = fantasyProsParser
                .parseHtml("/home/alan/workspace/NFLDraftHelper/src/" +
                        "main/resources/data/fantasyProsRawData.html");

        HashMap<String, Player>  yahooPlayers = yahooParser
                .parseHtml("/home/alan/workspace/NFLDraftHelper/" +
                        "src/main/resources/data/yahooDraftData.html");

        for(Player p: yahooPlayers.values()){
            if(fantasyProsPlayers.containsKey(p.getName())){
                p.setFantasyProsValue(fantasyProsPlayers.get(p.getName()).getFantasyProsValue());
            }
        }
        return yahooPlayers;
    }
}
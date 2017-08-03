package ie.alancasey.utils;


import ie.alancasey.api.Player;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class GeneratePlayerInsertStatements {

    private DataRetriever dataRetriever;

    public GeneratePlayerInsertStatements(){
        this.dataRetriever = new DataRetriever();
    }

    public void writeSqlStatementsToFile() throws Exception {
        HashMap<String, Player> players = this.dataRetriever.getDataFromHtml();

        try{
            PrintWriter writer = new PrintWriter("playerInserts.sql", "UTF-8");
            for(Player p: players.values()){
                writer.println("INSERT INTO player (rank, name, position, yahooProjectedValue, yahooAvgValue, fantasyProsValue, lastYearTotalPoints, team_id)\n"
                        + "VALUES ("
                        + p.getRank() +", "
                        + "'" + p.getName() +"', "
                        + "'" + p.getPosition() +"', "
                        + p.getYahooProjectedValue() +", "
                        + p.getYahooAvgValue() +", "
                        + p.getFantasyProsValue() +", "
                        + p.getLastYearTotalPoints() +", "
                        + p.getTeam_id()
                        + ");");
            }
            writer.close();
        } catch (IOException e) {
            // do something
        }
    }
}

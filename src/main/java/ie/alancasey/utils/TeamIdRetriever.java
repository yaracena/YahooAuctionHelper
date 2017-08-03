package ie.alancasey.utils;

import java.util.HashMap;

/**
 * Created by alan on 21/06/17.
 */
public class TeamIdRetriever {

    HashMap<String, Long> teamMap;

    public TeamIdRetriever(){
        this.teamMap = new HashMap<>();
        this.teamMap.put("Ten", 1l);
        this.teamMap.put("Dal", 2l);
        this.teamMap.put("Pit", 3l);
        this.teamMap.put("Oak", 4l);
        this.teamMap.put("GB", 5l);
        this.teamMap.put("Atl", 6l);
        this.teamMap.put("Was", 7l);
        this.teamMap.put("Phi", 8l);
        this.teamMap.put("Bal", 9l);
        this.teamMap.put("NE", 10l);
        this.teamMap.put("Buf", 11l);
        this.teamMap.put("NO", 12l);
        this.teamMap.put("Cin", 13l);
        this.teamMap.put("KC", 14l);
        this.teamMap.put("Chi", 15l);
        this.teamMap.put("Cle", 16l);
        this.teamMap.put("Car", 17l);
        this.teamMap.put("Hou", 18l);
        this.teamMap.put("Det", 19l);
        this.teamMap.put("NYG", 20l);
        this.teamMap.put("NYJ", 21l);
        this.teamMap.put("Jax", 22l);
        this.teamMap.put("TB", 23l);
        this.teamMap.put("Den", 24l);
        this.teamMap.put("Ind", 25l);
        this.teamMap.put("Ari", 26l);
        this.teamMap.put("LAR", 27l);
        this.teamMap.put("SF", 28l);
        this.teamMap.put("Min", 29l);
        this.teamMap.put("Mia", 30l);
        this.teamMap.put("LAC", 31l);
        this.teamMap.put("Sea", 32l);
    }

    public Long getTeamId(final String team){
        return teamMap.get(team);
    }
}

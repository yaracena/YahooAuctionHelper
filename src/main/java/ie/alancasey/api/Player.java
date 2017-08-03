package ie.alancasey.api;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private Long player_id;

    @Column
    private int rank;

    @Column
    @NotNull
    private String name;

    private Long team_id;

    @Column
    @NotNull
    private String position;

    @Column(name = "yahooprojectedvalue")
    @NotNull
    private double yahooProjectedValue;

    @Column(name = "yahooavgvalue")
    @NotNull
    private double yahooAvgValue;

    @Column(name = "fantasyprosvalue")
    @NotNull
    private double fantasyProsValue;

    @Column(name = "lastyeartotalpoints")
    @NotNull
    private double lastYearTotalPoints;

    public Player(){}

    public Player(String name, Long team_id, double fantasyProsValue){
        this.rank = 0;
        this.name = name;
        this.team_id = team_id;
        this.position = "";
        this.yahooProjectedValue = 0.0;
        this.yahooAvgValue = 0.0;
        this.fantasyProsValue = fantasyProsValue;
        this.lastYearTotalPoints = 0.0;
    }

    public Player(int rank, String name, Long team_id, String position,
                  double yahooProjectedValue, double yahooAvgValue,
                  double lastYearTotalPoints) {

        this.rank = rank;
        this.name = name;
        this.team_id = team_id;
        this.position = position;
        this.yahooProjectedValue = yahooProjectedValue;
        this.yahooAvgValue = yahooAvgValue;
        this.fantasyProsValue = 0.0;
        this.lastYearTotalPoints = lastYearTotalPoints;
    }

    public Player(int rank, String name, Long team_id, String position,
                  double yahooProjectedValue, double yahooAvgValue, double fantasyProsValue,
                  double lastYearTotalPoints) {
        
        this.rank = rank;
        this.name = name;
        this.team_id = team_id;
        this.position = position;
        this.yahooProjectedValue = yahooProjectedValue;
        this.yahooAvgValue = yahooAvgValue;
        this.fantasyProsValue = fantasyProsValue;
        this.lastYearTotalPoints = lastYearTotalPoints;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getYahooProjectedValue() {
        return yahooProjectedValue;
    }

    public void setYahooProjectedValue(double yahooProjectedValue) {
        this.yahooProjectedValue = yahooProjectedValue;
    }

    public double getYahooAvgValue() {
        return yahooAvgValue;
    }

    public void setYahooAvgValue(double yahooAvgValue) {
        this.yahooAvgValue = yahooAvgValue;
    }

    public double getFantasyProsValue() {
        return fantasyProsValue;
    }

    public void setFantasyProsValue(double fantasyProsValue) {
        this.fantasyProsValue = fantasyProsValue;
    }

    public double getLastYearTotalPoints() {
        return lastYearTotalPoints;
    }

    public void setLastYearTotalPoints(double lastYearTotalPoints) {
        this.lastYearTotalPoints = lastYearTotalPoints;
    }

    public Long getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(Long player_id) {
        this.player_id = player_id;
    }

    public Long getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Long team_id) {
        this.team_id = team_id;
    }
}

package ie.alancasey.api;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Long team_id;

    @Column
    @NotNull
    private String name;

    @Column
    @NotNull
    private String nameAbv;

    @Column
    @NotNull
    private int byeWeek;

    @Column
    @NotNull
    private int olRanking;

    public Team(){}

    public Team(String name, String nameAbv, int byeWeek, int olRanking) {
        this.name = name;
        this.nameAbv = nameAbv;
        this.byeWeek = byeWeek;
        this.olRanking = olRanking;
    }

    public Long getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Long team_id) {
        this.team_id = team_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAbv() {
        return nameAbv;
    }

    public void setNameAbv(String nameAbv) {
        this.nameAbv = nameAbv;
    }

    public int getByeWeek() {
        return byeWeek;
    }

    public void setByeWeek(int byeWeek) {
        this.byeWeek = byeWeek;
    }

    public int getOlRanking() {
        return olRanking;
    }

    public void setOlRanking(int olRanking) {
        this.olRanking = olRanking;
    }
}

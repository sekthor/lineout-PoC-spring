package ch.swissrugbystats.lineout.services;

import ch.swissrugbystats.lineout.models.Team;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {

    public Team getTeam(int id) {
        return new Team("Würenlos");
    }

    public List<Team> getTeams() {

        ArrayList<Team> teams = new ArrayList<>();
        teams.add(new Team("Würenlos"));
        teams.add(new Team("GC"));
        teams.add(new Team("Bern"));
        teams.add(new Team("St Gallen"));
        teams.add(new Team("Luzern"));
        teams.add(new Team("Baboons"));

        return teams;
    }

}

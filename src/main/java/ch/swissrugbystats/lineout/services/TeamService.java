package ch.swissrugbystats.lineout.services;

import ch.swissrugbystats.lineout.models.Team;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {

    public Team getTeam(int id) {
        Team team = new Team();
        team.name = "Würenlos";
        team.id = id;
        return team;
    }

    public List<Team> getTeams() {
        return new ArrayList<Team>();
    }

}

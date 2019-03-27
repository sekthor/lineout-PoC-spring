package ch.swissrugbystats.lineout.resources;

import ch.swissrugbystats.lineout.models.Team;
import ch.swissrugbystats.lineout.services.TeamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/teams")
public class TeamsResource {

    private final TeamService teamService;

    TeamsResource(TeamService teamService) {
        this.teamService = teamService;
    }


    @GetMapping()
    public List<Team> teams() {
        return this.teamService.getTeams();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Team> teamsWithMoreControl(@PathVariable("id") int id) {
        return ResponseEntity.ok(this.teamService.getTeam(id));
    }

    @GetMapping("/ping")
    public ResponseEntity<String> teamsWithMoreControl() {
        return ResponseEntity.ok("pong");
    }

}

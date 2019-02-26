package ch.swissrugbystats.lineout.models;

import org.springframework.stereotype.Component;

@Component
public class Team {
    public int id;
    public String name;

    public Team() {
        this.setRandomId();
    }

    public Team(String name) {
        this.setRandomId();
        this.name = name;
    }

    private void setRandomId() {
        this.id = (int) (Math.random() * 10);
    }
}

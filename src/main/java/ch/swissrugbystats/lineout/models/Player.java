package ch.swissrugbystats.lineout.models;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Player {
    int id, teamId, streetNo, zipCode;
    String firstName, lastName, streetName, city,
            phone, emergencyName, emergencyPhone;
    Date birthday;
    Position position;
    PlayerStatistics playerStats;
    boolean licenced;
}
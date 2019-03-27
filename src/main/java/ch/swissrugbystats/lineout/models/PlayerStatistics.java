package ch.swissrugbystats.lineout.models;

public class PlayerStatistics {

    int gamesPlayed,
            triesScored,
            conversionsScored,
            penaltiesScored,
            startingFifteen;


    public int getTotalPointsScored() {
        return this.triesScored * 5 + this.penaltiesScored * 3 + this.conversionsScored * 2;
    }
}
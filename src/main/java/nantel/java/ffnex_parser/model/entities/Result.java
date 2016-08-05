package nantel.java.ffnex_parser.model.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;
import java.util.List;

public class Result {

    protected int id;
    protected int heat; 
    protected int lane; 
    @JacksonXmlProperty(
            localName = "agegroupid")
    protected int ageGroupId;
    @JacksonXmlProperty(
            localName = "swimtime")
    protected Double swimTime;
    @JacksonXmlProperty(
            localName = "swimdate")
    protected Date swimDate;
    @JacksonXmlProperty(
            localName = "disqualificationid")
    protected int disqualificationId; 
    @JacksonXmlProperty(
            localName = "clubid")
    protected int clubId; 
    @JacksonXmlProperty(
            localName = "raceid")
    protected int raceId;
    @JacksonXmlProperty(
            localName = "roundid")
    protected int roundId;
    protected int place;
    protected int points;
    protected boolean swimoff;
    protected int team;
    @JacksonXmlProperty(
            localName = "RELAY")
    protected Relay relay;
    @JacksonXmlProperty(
            localName = "SOLO")
    protected Solo solo;
    @JacksonXmlProperty(
            localName = "SPLITS")
    protected List<Split> splits;

    public int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public int getHeat() {
        return this.heat;
    }

    public void setHeat(final int heat) {
        this.heat = heat;
    }

    public int getLane() {
        return this.lane;
    }

    public void setLane(final int lane) {
        this.lane = lane;
    }

    public int getAgeGroupId() {
        return this.ageGroupId;
    }

    public void setAgeGroupId(final int ageGroupId) {
        this.ageGroupId = ageGroupId;
    }

    public Double getSwimTime() {
        return this.swimTime;
    }

    public void setSwimTime(final Double swimTime) {
        this.swimTime = swimTime;
    }

    public Date getSwimDate() {
        return this.swimDate;
    }

    public void setSwimDate(final Date swimDate) {
        this.swimDate = swimDate;
    }

    public int getDisqualificationId() {
        return this.disqualificationId;
    }

    public void setDisqualificationId(final int disqualificationId) {
        this.disqualificationId = disqualificationId;
    }

    public int getClubId() {
        return this.clubId;
    }

    public void setClubId(final int clubId) {
        this.clubId = clubId;
    }

    public int getRaceId() {
        return this.raceId;
    }

    public void setRaceId(final int raceId) {
        this.raceId = raceId;
    }

    public int getRoundId() {
        return this.roundId;
    }

    public void setRoundId(final int roundId) {
        this.roundId = roundId;
    }

    public int getPlace() {
        return this.place;
    }

    public void setPlace(final int place) {
        this.place = place;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(final int points) {
        this.points = points;
    }

    public boolean isSwimoff() {
        return this.swimoff;
    }

    public void setSwimoff(final boolean swimoff) {
        this.swimoff = swimoff;
    }

    public int getTeam() {
        return this.team;
    }

    public void setTeam(final int team) {
        this.team = team;
    }

    public Relay getRelay() {
        return this.relay;
    }

    public void setRelay(final Relay relay) {
        this.relay = relay;
    }

    public List<Split> getSplits() {
        return this.splits;
    }

    public void setSplits(final List<Split> splits) {
        this.splits = splits;
    }

    @SuppressWarnings("null")
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Result { ").append("\n");
        builder.append("    id -> " + id).append("\n");
        builder.append("    heat -> " + heat).append("\n");
        builder.append("    lane -> " + lane).append("\n");
        builder.append("    ageGroupId -> " + ageGroupId).append("\n");
        builder.append("    swimTime -> " + swimTime).append("\n");
        builder.append("    swimDate -> " + swimDate).append("\n");
        builder.append("    disqualificationId -> " + disqualificationId).append("\n");
        builder.append("    clubId -> " + clubId).append("\n");
        builder.append("    raceId -> " + raceId).append("\n");
        builder.append("    roundId -> " + roundId).append("\n");
        builder.append("    place -> " + place).append("\n");
        builder.append("    points -> " + points).append("\n");
        builder.append("    swimoff -> " + swimoff).append("\n");
        builder.append("    team -> " + team).append("\n");
        builder.append("    relay -> " + relay == null ? "null" : relay).append("\n");
        builder.append("    solo -> " + solo == null ? "null" : solo).append("\n");

        builder.append("    splits -> ");
        if (splits == null) {
            builder.append("null");
        } else {
            for (Split split : splits) {
                builder.append("    ").append(split.toString()).append("\n");
            }
        }
        builder.append("}").append("\n");
        return builder.toString();
    }
}

package nantel.java.ffnex_parser.model.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;
import java.util.List;

public class Meet {

    protected Integer id;
    protected String name;
    protected String city;
    @JacksonXmlProperty(
            localName = "startdate")
    protected Date startDate;
    @JacksonXmlProperty(
            localName = "stopdate")
    protected Date stopDate;
    protected String nation;
    @JacksonXmlProperty(
            localName = "typeid")
    protected Integer typeId; 
    @JacksonXmlProperty(
            localName = "disciplineid")
    protected Integer disciplineId; 
    @JacksonXmlProperty(
            localName = "POINTTABLE")
    protected Pointable pointable; 
    @JacksonXmlProperty(
            localName = "POOL")
    protected Pool pool;
    @JacksonXmlProperty(
            localName = "CLUBS")
    protected List<Club> clubs; 
    @JacksonXmlProperty(
            localName = "SWIMMERS")
    protected List<Swimmer> swimmers; 
    @JacksonXmlProperty(
            localName = "AGEGROUPS")
    protected List<AgeGroup> ageGroups; 
    @JacksonXmlProperty(
            localName = "RESULTS")
    protected List<Result> results;

    public Integer getId() {
        return this.id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(final Date startDate) {
        this.startDate = startDate;
    }

    public Date getStopDate() {
        return this.stopDate;
    }

    public void setStopDate(final Date stopDate) {
        this.stopDate = stopDate;
    }

    public String getNation() {
        return this.nation;
    }

    public void setNation(final String nation) {
        this.nation = nation;
    }

    public Integer getTypeId() {
        return this.typeId;
    }

    public void setTypeId(final Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getDisciplineId() {
        return this.disciplineId;
    }

    public void setDisciplineId(final Integer disciplineId) {
        this.disciplineId = disciplineId;
    }

    public Pointable getPointable() {
        return this.pointable;
    }

    public void setPointable(final Pointable pointable) {
        this.pointable = pointable;
    }

    public Pool getPool() {
        return this.pool;
    }

    public void setPool(final Pool pool) {
        this.pool = pool;
    }

    public List<Club> getClubs() {
        return this.clubs;
    }

    public void setClubs(final List<Club> clubs) {
        this.clubs = clubs;
    }

    public List<Swimmer> getSwimmers() {
        return this.swimmers;
    }

    public void setSwimmers(final List<Swimmer> swimmers) {
        this.swimmers = swimmers;
    }

    public List<AgeGroup> getAgeGroups() {
        return this.ageGroups;
    }

    public void setAgeGroups(final List<AgeGroup> ageGroups) {
        this.ageGroups = ageGroups;
    }

    public List<Result> getResults() {
        return this.results;
    }

    public void setResults(final List<Result> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Meet { ").append("\n");
        builder.append("    id -> " + id).append("\n");
        builder.append("    name -> " + name).append("\n");
        builder.append("    city -> " + city).append("\n");
        builder.append("    startDate -> " + startDate).append("\n");
        builder.append("    stopDate -> " + stopDate).append("\n");
        builder.append("    nation -> " + nation).append("\n");
        builder.append("    typeId -> " + typeId).append("\n");
        builder.append("    disciplineId -> " + disciplineId).append("\n");
        builder.append("    pointable -> " + pointable).append("\n");
        builder.append("    pool -> " + pool).append("\n");

        builder.append("    clubs -> ");
        for (Club club : clubs) {
            builder.append("    ").append(club).append("\n");
        }

        builder.append("    swimmers -> ");
        for (Swimmer swimmer : swimmers) {
            builder.append("    ").append(swimmer).append("\n");
        }

        builder.append("    ageGroups -> ");
        for (AgeGroup ageGroup : ageGroups) {
            builder.append("    ").append(ageGroup).append("\n");
        }

        builder.append("    results -> ");
        for (Result result : results) {
            builder.append("    ").append(result).append("\n");
        }

        builder.append("}").append("\n");
        return builder.toString();
    }
}

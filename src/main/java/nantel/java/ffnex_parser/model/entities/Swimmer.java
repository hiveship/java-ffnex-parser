package nantel.java.ffnex_parser.model.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;

public class Swimmer {

    protected int id;
    @JacksonXmlProperty(
            localName = "firstname")
    protected String firstName;
    @JacksonXmlProperty(
            localName = "lastname")
    protected String lastName;
    protected Gender gender;
    @JacksonXmlProperty(
            localName = "birthdate")
    protected Date birthDate;
    protected String nation;
    @JacksonXmlProperty(
            localName = "clubid")
    protected int clubId;

    public int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(final Gender gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(final Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getNation() {
        return this.nation;
    }

    public void setNation(final String nation) {
        this.nation = nation;
    }

    public int getClubId() {
        return this.clubId;
    }

    public void setClubId(final int clubId) {
        this.clubId = clubId;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Swimmer { ").append("\n");
        builder.append("    id -> " + id).append("\n");
        builder.append("    firstName -> " + firstName).append("\n");
        builder.append("    lastName -> " + lastName).append("\n");
        builder.append("    gender -> " + gender).append("\n");
        builder.append("    birthDate -> " + birthDate).append("\n");
        builder.append("    nation -> " + nation).append("\n");
        builder.append("    clubId -> " + clubId).append("\n");
        builder.append("}").append("\n");
        return builder.toString();
    }
}

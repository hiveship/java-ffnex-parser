package nantel.java.ffnex_parser.model.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class AgeGroup {

    protected int id;
    protected String name;
    @JacksonXmlProperty(
            localName = "agemin")
    protected int ageMin;
    @JacksonXmlProperty(
            localName = "agemax")
    protected int ageMax;

    public int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAgeMin() {
        return this.ageMin;
    }

    public void setAgeMin(final int ageMin) {
        this.ageMin = ageMin;
    }

    public int getAgeMax() {
        return this.ageMax;
    }

    public void setAgeMax(final int ageMax) {
        this.ageMax = ageMax;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AgeGroup { ").append("\n");
        builder.append("    id -> " + id).append("\n");
        builder.append("    name -> " + name).append("\n");
        builder.append("    ageMin -> " + ageMin).append("\n");
        builder.append("    ageMax -> " + ageMax).append("\n");
        builder.append("}").append("\n");
        return builder.toString();
    }
}

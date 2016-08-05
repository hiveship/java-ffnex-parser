package nantel.java.ffnex_parser.model.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RelayPosition {

    @JacksonXmlProperty(
            localName = "number")
    protected int position;
    @JacksonXmlProperty(
            localName = "swimmerid")
    protected int swimmerId;
    @JacksonXmlProperty(
            localName = "clubid")
    protected int clubId;

    public int getPosition() {
        return this.position;
    }

    public void setPosition(final int position) {
        this.position = position;
    }

    public int getSwimmerId() {
        return this.swimmerId;
    }

    public void setSwimmerId(final int swimmerId) {
        this.swimmerId = swimmerId;
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
        builder.append("RelayPosition { ").append("\n");
        builder.append("    number -> " + position).append("\n");
        builder.append("    swimmerId -> " + swimmerId).append("\n");
        builder.append("    clubId -> " + clubId).append("\n");
        builder.append("}").append("\n");
        return builder.toString();
    }
}

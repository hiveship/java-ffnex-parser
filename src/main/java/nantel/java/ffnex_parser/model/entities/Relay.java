package nantel.java.ffnex_parser.model.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Relay {

    @JacksonXmlProperty(
            localName = "RELAYPOSITIONS")
    protected List<RelayPosition> relayPositions;

    public List<RelayPosition> getRelayPositions() {
        return this.relayPositions;
    }

    public void setRelayPositions(final List<RelayPosition> relayPositions) {
        this.relayPositions = relayPositions;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Relay { ").append("\n");
        builder.append("    relayPositions -> ");
        for (RelayPosition relayPosition : relayPositions) {
            builder.append("    ").append(relayPosition).append("\n");
        }
        builder.append("}").append("\n");
        return builder.toString();
    }

}

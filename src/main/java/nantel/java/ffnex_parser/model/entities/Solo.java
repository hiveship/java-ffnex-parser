package nantel.java.ffnex_parser.model.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Solo {

    @JacksonXmlProperty(
            localName = "swimmerid")
    protected int swimmerId;

    public int getSwimmerId() {
        return this.swimmerId;
    }

    public void setSwimmerId(final int swimmerId) {
        this.swimmerId = swimmerId;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Solo { ").append("\n");
        builder.append("    swimmerId -> " + swimmerId).append("\n");
        builder.append("}").append("\n");
        return builder.toString();
    }
}

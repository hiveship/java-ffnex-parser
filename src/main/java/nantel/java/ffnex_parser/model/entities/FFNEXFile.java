package nantel.java.ffnex_parser.model.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class FFNEXFile {

    protected String version;
    protected String type;
    @JacksonXmlProperty(
            localName = "ORIGIN")
    protected Origin origin;
    @JacksonXmlProperty(
            localName = "MEETS")
    protected List<Meet> meets;

    public Origin getOrigin() {
        return this.origin;
    }

    public void setOrigin(final Origin origin) {
        this.origin = origin;
    }

    public List<Meet> getMeets() {
        return this.meets;
    }

    public void setMeets(final List<Meet> meets) {
        this.meets = meets;
    }

    public Meet getFirstMeet() {
        if (meets != null) {
            return getMeets().get(0);
        }
        return null;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public String getType() {
        return this.type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FFNEXFile { ").append("\n");
        builder.append("    version -> " + version).append("\n");
        builder.append("    type -> " + type).append("\n");
        builder.append("    origin -> " + origin).append("\n");
        builder.append("    meets -> " + meets).append("\n");
        builder.append("}").append("\n");
        return builder.toString();
    }

}

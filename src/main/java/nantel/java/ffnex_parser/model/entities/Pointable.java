package nantel.java.ffnex_parser.model.entities;

public class Pointable {

    protected String name;
    protected String version;

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Pointable { ").append("\n");
        builder.append("    name -> " + name).append("\n");
        builder.append("    version -> " + version).append("\n");
        builder.append("}").append("\n");
        return builder.toString();
    }
}

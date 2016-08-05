package nantel.java.ffnex_parser.model.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Origin {

    protected String name;
    protected String version;
    @JacksonXmlProperty(
            localName = "CONTACT")
    protected Contact contact;

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

    public Contact getContact() {
        return this.contact;
    }

    public void setContact(final Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Origin { ").append("\n");
        builder.append("    name -> " + name).append("\n");
        builder.append("    version -> " + version).append("\n");
        builder.append("    contact -> " + contact).append("\n");
        builder.append("}").append("\n");
        return builder.toString();
    }
}

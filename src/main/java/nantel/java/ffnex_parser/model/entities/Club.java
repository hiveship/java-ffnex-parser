package nantel.java.ffnex_parser.model.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Club {
    protected int id;
    protected String name;
    protected int code;
    protected String nation;
    @JacksonXmlProperty(
            localName = "typeid")
    protected int typeId;

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

    public int getCode() {
        return this.code;
    }

    public void setCode(final int code) {
        this.code = code;
    }

    public String getNation() {
        return this.nation;
    }

    public void setNation(final String nation) {
        this.nation = nation;
    }

    public int getTypeId() {
        return this.typeId;
    }

    public void setTypeId(final int typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Club { ").append("\n");
        builder.append("    id -> " + id).append("\n");
        builder.append("    name -> " + name).append("\n");
        builder.append("    code -> " + code).append("\n");
        builder.append("   	nation -> " + nation).append("\n");
        builder.append("    typeId -> " + typeId).append("\n");
        builder.append("}").append("\n");
        return builder.toString();
    }

}

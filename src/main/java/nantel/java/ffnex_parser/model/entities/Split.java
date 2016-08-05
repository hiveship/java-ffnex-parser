package nantel.java.ffnex_parser.model.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Split {

    @JacksonXmlProperty(
            localName = "swimtime")
    protected double swimTime;
    protected int distance;

    public double getSwimTime() {
        return this.swimTime;
    }

    public void setSwimTime(final double swimTime) {
        this.swimTime = swimTime;
    }

    public int getDistance() {
        return this.distance;
    }

    public void setDistance(final int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Split { ").append("\n");
        builder.append("    swimTime -> " + swimTime).append("\n");
        builder.append("    distance -> " + distance).append("\n");
        builder.append("}").append("\n");
        return builder.toString();
    }
}

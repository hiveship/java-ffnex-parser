package nantel.java.ffnex_parser.model.entities;

public class Pool {

    protected int size;

    public int getSize() {
        return this.size;
    }

    public void setSize(final int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Pool { ").append("\n");
        builder.append("    size -> " + size).append("\n");
        builder.append("}").append("\n");
        return builder.toString();
    }
}

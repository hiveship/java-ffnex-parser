package nantel.java.ffnex_parser.model.entities;

public class Contact {

    protected String name;
    protected int zip;
    protected String address;
    protected String city;
    protected String email;
    protected String internet;
    protected String phone;
    protected String fax;

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getZip() {
        return this.zip;
    }

    public void setZip(final int zip) {
        this.zip = zip;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getInternet() {
        return this.internet;
    }

    public void setInternet(final String internet) {
        this.internet = internet;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return this.fax;
    }

    public void setFax(final String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Contact { ").append("\n");
        builder.append("    name -> " + name).append("\n");
        builder.append("    zip -> " + zip).append("\n");
        builder.append("    address -> " + address).append("\n");
        builder.append("    city -> " + city).append("\n");
        builder.append("    email -> " + email).append("\n");
        builder.append("    internet -> " + internet).append("\n");
        builder.append("    phone -> " + phone).append("\n");
        builder.append("    fax -> " + fax).append("\n");
        builder.append("}").append("\n");
        return builder.toString();
    }

}

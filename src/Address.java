public class Address {

    public static final String askStreet1 = "What is your street1?";
    public static final String askStreet2 = "What is your street2? (OPTIONAL)";
    public static final String askCity = "What is your city?";
    public static final String askState = "What is the current state?";
    public static final String askCountry = "What is the name of your country?";
    public static final String askZip = "What is your zipcode?";

    public Address(String street1, String city, String state, String country, int zip) {
        this.street1 = street1;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zip = zip;
    }

    public Address(String street1, String street2, String city, String state, String country, int zip) {
        this(street1, city, state, country, zip);
        this.street2 = street2;
    }

    public String street1;
    public String street2;
    public String city;
    public String state;
    public String country;
    public int zip;


    public static Address createAddress() {
        String street1 = ScannerHelper.getString(askStreet1);
        String street2 = ScannerHelper.getString(askStreet2);
        String city = ScannerHelper.getString(askCity);
        String state = ScannerHelper.getString(askState);
        String country = ScannerHelper.getString(askCountry);
        int zip = ScannerHelper.getInt(askZip);

        if (street2.isEmpty()) return new Address(street1, city, state, country, zip);
        return new Address(street1, street2, city, state, country, zip);
    }


    @Override
    public String toString() {
        return "Address{" +
                "street1='" + street1 + '\'' +
                (street2 == null ? "" : ", street2='" + street2 + '\'') +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zip=" + zip +
                '}';
    }

}

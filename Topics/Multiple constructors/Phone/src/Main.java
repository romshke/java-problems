class Phone {

    final String ownerName;
    String countryCode;
    String cityCode;
    final String number;

    Phone(String ownerName, String number) {
        this.ownerName = ownerName;
        this.number = number;
    }

    Phone(String ownerName, String countryCode, String cityCode, String number) {
        this(ownerName, number);
        this.countryCode = countryCode;
        this.cityCode = cityCode;
    }
}
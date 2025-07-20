class TimeConstantsDemo {

    public static void main(String[] args) {
        // print SECONDS_IN_DAY
        // print SECONDS_IN_WEEK
        System.out.printf("%d%n%d", TimeConstants.SECONDS_IN_DAY, TimeConstants.SECONDS_IN_WEEK);
    }
}

final class TimeConstants {
    public static final int SECOND = 1;
    public static final int SECONDS_IN_MINUTE = 60 * SECOND;
    public static final int SECONDS_IN_HOUR = 60 * SECONDS_IN_MINUTE;
    public static final int SECONDS_IN_DAY = 24 * SECONDS_IN_HOUR;
    public static final int SECONDS_IN_WEEK = 7 * SECONDS_IN_DAY;
    // write your code here

    private TimeConstants() { }
}
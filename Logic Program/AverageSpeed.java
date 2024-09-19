public class AverageSpeed {

    public static void main(String[] strings) {

        double hours = 1;
        double minutes = 40;
        double seconds = 35;
        double distanceInMiles = 24;

        double distanceInKilometers = distanceInMiles * 1.60934;

        double timeInMinutes = hours * 60.0 + minutes + seconds / 60.0;
        double kilometersPerHour = 60.0 * distanceInKilometers / timeInMinutes;

        System.out.println(kilometersPerHour);

    }
}

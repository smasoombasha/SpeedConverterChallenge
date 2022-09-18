public class Main {
    public static void main(String[] args){

        long miles = SpeedConverter.toMilesPerHour(5);
        System.out.println(miles);
        SpeedConverter.printConversion(miles);
    }
}

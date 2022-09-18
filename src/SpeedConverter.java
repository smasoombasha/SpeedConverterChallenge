public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour <0){
            return -1;
        }else{
           // long kilometers = Math.round(kilometersPerHour);
            //return kilometers;
            return Math.round(kilometersPerHour);
        }
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            long milesPerHour = Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour +" km/h" +" = "
                     +milesPerHour+" mi/h");
        }
    }

}

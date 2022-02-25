import java.util.Scanner;

public class Exercise36{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lat1,lon1,lat2,lon2,rad = 6371.01;
        System.out.print("Input the latitude of cordinate 1: ");
        lat1 = sc.nextDouble();
        System.out.print("Input the longitude of cordiate 1: ");
        lon1 = sc.nextDouble();
        System.out.print("Input the latitude of cordinate 2: ");
        lat2 = sc.nextDouble();
        System.out.print("Input the longitude of cordiante 2: ");
        lon2 = sc.nextDouble();

        //convert degree to radian in order for the formula to work 
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
        
        double radius = rad * (Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos((lon2 - lon2))));

        System.out.println("The distance between those points is: " + radius + " km");
        sc.close();
    }
}
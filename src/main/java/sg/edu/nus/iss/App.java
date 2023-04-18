package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MountainBike mountainBike = new MountainBike(5,10,20);
        System.out.println(mountainBike.toString());


        MountainBike mountainBike2 = new MountainBike(6,12,24);

        MountainBike mountainBike3 = new MountainBike(7,14,30);

        RoadBike roadBike = new RoadBike(8,15,25);

        List<Bicycle> bicycles = new ArrayList<>();
        bicycles.add(mountainBike);
        bicycles.add(mountainBike2);
        bicycles.add(mountainBike3);
        bicycles.add(roadBike);

        for (int counter = 0; counter < bicycles.size(); counter++){
            System.out.println(bicycles.get(counter));
        }

        // for (MountainBike mb:bicycles){
        //     System.out.println(mb.toString());
        // }
        System.out.println(bicycles.toString());

        for (Bicycle bicycle: bicycles){
            if (bicycle instanceof MountainBike){
                System.out.println(bicycle.hashCode() + " is a Mountain Bike");
            }else if (bicycle instanceof RoadBike){
                System.out.println(bicycle.hashCode() + "is a Road Bike");
            }
        }

    }
}

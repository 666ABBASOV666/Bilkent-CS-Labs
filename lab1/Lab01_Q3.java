package CS.labs.lab1;

public class Lab01_Q3 {
    

    public static void main(String args[]) 

    {

         //Dry land & water of whole area
        final double totalArea = 510072000;
        double worldWater1 = (totalArea * 70.8 / 100);
        long worldWater2 = Math.round(worldWater1); //World Water
        final double dryland1 = (totalArea * 29.2/ 100); 
        long dryland2 = Math.round(dryland1);// World Dryland
        System.out.println("Earth has " + dryland2 + " km2 dry land and " + worldWater2 + " km2 water.");

        System.out.println("------------------------------------------------------------------------------");

        final double TurkeyArea1 = (totalArea * 0.1536 / 100);//Total Turkey area
        long TurkeyArea2 = Math.round(TurkeyArea1); //Total Turkey area
        
        double TurkeyWater1 = (TurkeyArea2 * 1.3 / 100); //Turkey's water
        long TurkeyWater2 = Math.round(TurkeyWater1); //Turkey's water

        double TurkeyDry1 = TurkeyArea2 - TurkeyWater2; //Turkey's dry land
        long TurkeyDry2 = Math.round(TurkeyDry1); //Turkey's dry land
        System.out.println ("Turkey has " + TurkeyDry2 + " km2 dry land and " + TurkeyWater2 + " km2 water");

        System.out.println("------------------------------------------------------------------------------");

        double TurkeyDryPrcnt1 = ((TurkeyDry1/dryland1) * 100);
       
        System.out.println ("Turkey has " + TurkeyDryPrcnt1 + " percent of the Earth's dry land.");


        System.out.println("------------------------------------------------------------------------------");

        double TurkeyWaterPrcnt1 = ((TurkeyWater1/worldWater1) * 100);


        System.out.println ("Turkey has " + TurkeyWaterPrcnt1 + " percent of the Earth's water.");



        

    }
    



    
}

public class CS101 {


    public static void main (String args[])
    
    {

           //Dry land & water of whole area
           final double totalArea = 510072000;
           double worldWater1 = (totalArea * 70.8 / 100);
           long worldWater2 = Math.round(worldWater1); //World Water
           final double dryland1 = (totalArea * 29.2/ 100); 
           long dryland2 = Math.round(dryland1);// World Dryland
           
           System.out.println("Earth has " + dryland2 + " km2 dry land and " + worldWater2 + " km2 water.");
            
           final int TurkeyArea1 = 783469;
           long TurkeyArea2 = Math.round(TurkeyArea1); //Total Turkey area

           double TurkeyWater1 = (TurkeyArea2 * 1.3 / 100); //Turkey's water
           long TurkeyWater2 = Math.round(TurkeyWater1); //Turkey's water

           double TurkeyDry1 = TurkeyArea1 - TurkeyWater1; //Turkey's dry land
           
           double TurkeyDry2 = Math.floor(TurkeyDry1); //Turkey's dry land
           int slm = (int) TurkeyDry2;
          
           System.out.println ("Turkey has " + slm + " km2 dry land and " + TurkeyWater2 + " km2 water");

           double TurkeyDryPrcnt1 = ((TurkeyDry1/dryland1) * 100);
           System.out.println ("Turkey has " + TurkeyDryPrcnt1 + " percent of the Earth's dry land.");
   
           double TurkeyWaterPrcnt1 = ((TurkeyWater2/worldWater1) * 100);
           System.out.println ("Turkey has " + TurkeyWaterPrcnt1 + " percent of the Earth's water.");
   
   



    }
    
}

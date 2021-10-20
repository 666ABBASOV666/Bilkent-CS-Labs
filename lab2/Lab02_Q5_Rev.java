public class Lab02_Q5_Rev {
    public static void main (String [] args)
    {
        String str = "War and Peace";
        String and = (str.substring(4,8));
        String war = (str.substring(0,4));
        String peace1 = (str.substring(8,10));
        String peace2 = (str.substring(11,13));
        String newPeace =(str.substring(10,11).toUpperCase());
        System.out.println(and + war + peace1 + newPeace + peace2 );
    }  
}

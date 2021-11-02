import java.util.Arrays;
import java.util.Scanner;
public class CityBuilder {
    public static void reverse(Integer a[], Integer n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }
    static void findBiggestIndex(String[] lineindex, String[] sortedList, Integer[] lineIndexInt){
        for(Integer i=0;i<sortedList.length;i++){
            if(Integer.parseInt(sortedList[i].split(";")[0]) >= Integer.parseInt(sortedList[0].split(";")[0])){
                lineindex = Arrays.copyOf(lineindex, lineindex.length + 1);
                lineindex[lineindex.length - 1] = sortedList[i].split(";")[1];
            }
            lineIndexInt = Arrays.copyOf(lineIndexInt, lineindex.length);
            for(Integer j=0; j<lineindex.length; j++) {
                lineIndexInt[j] = Integer.parseInt(lineindex[j]);
            }
            reverse(lineIndexInt, lineIndexInt.length);
        }
    }
    static void printOneFloor(Integer[] lineindex, String[] sortedList){
        String empty = " ";
        for(Integer i = 1;i<lineindex.length;i++){
            if(i == 0){
                System.out.println(empty.repeat(lineindex[i]) + "*");
            }
            else{
                if((lineindex[i] - lineindex[i-1]) != 1){
                    Integer emptylines = lineindex[i] - lineindex[i-1] - 1;
                    System.out.println(empty.repeat(emptylines) + "*");
                }
                else{
                    System.out.println("*");
                }
            }
        }
        for(Integer j = 0;j<lineindex.length;j++){
            sortedList[j] = String.valueOf(Integer.parseInt(sortedList[j].split(";")[0]) - 1) + ";" + sortedList[j].split(";")[1];
        }
    }
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String numbers = reader.next();
        
        String[] numberList = numbers.split("");
        String[] sortedList = numberList; 
        String[] lineindex = new String[1];
        Integer[] lineindexInt = new Integer[lineindex.length];
        lineindex[0] = ("0");
        String biggestNumber = ("0");

        for(Integer i=0;i<numberList.length;i++){
            sortedList[i] = numberList[i] + ";" + String.valueOf(i);
        }
        Arrays.sort(sortedList);
        biggestNumber = sortedList[0].split(";")[0];
        
        for(Integer i = 0;i<Integer.parseInt(biggestNumber);i++){
            findBiggestIndex(lineindex, sortedList, lineindexInt);
            printOneFloor(lineindexInt, sortedList);
            lineindex = new String[0];
            lineindexInt = new Integer[lineindex.length];
            System.out.println("");
            reader.close();
        }
    }
}
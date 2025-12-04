
/**
 * Write a description of class NUmber4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NUmber4
{
    public static void main(String [] args){
    
        int [] arr = {3,7,5,9,4,9,32,1,56,3};
        int smallest = arr[0];
        int largest = arr[0];
        
        for (int x : arr){
            if (x < smallest) smallest = x;
            if (x > largest) largest = x;
        }
        
        System.out.println("Smallest: " + smallest);
        System.out.println("Smallest: " + largest);
    }
}
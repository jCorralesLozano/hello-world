/**
 *
 * @author Jesse Lozano
 */
public class NewClass {
    
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        array(arr);
    }
    
    public static void array(int []x)
    {
        
        try
        {
            x[10] = 4;
        }catch(IndexOutOfBoundsException e){
            System.out.println("Jesse Rocks");
        }
    }
}

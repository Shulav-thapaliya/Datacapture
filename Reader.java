import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.concurrent.CountDownLatch;

public class Reader {

    // This function is to read the file and make object with that file and store it into an array.
    public static void ReadFile(String FileName,ObjectClass[] Objectarray){
        
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(FileName));
            String headerLine = br.readLine();
            
            String Line;
            int ArraySize = 0;
            
            while((Line = br.readLine()) != null){
                
                
                String[] Values =Line.split(",");
                String one = Values[0];
                String two = Values[1];
                int three = Integer.parseInt(Values[2]);
                int four = Integer.parseInt(Values[3]);
                String five = Values[4];
                ObjectClass newObject = new ObjectClass(one, two, three, four, five);
                Objectarray[ArraySize] = newObject;
                ArraySize = ArraySize + 1;
                
                


                


            }
            br.close();

            
            
            
            


        } catch (FileNotFoundException e) {
           e.printStackTrace();
            e.printStackTrace();
        } catch (Exception e) {
            // Handle other exceptions here, if needed
            e.printStackTrace();
        }
        
    }
   
    //  This function is to count the data from the file and count the number of line in that file.
    public static int Count(String FileName){
        int Count = 0;
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(FileName));
            String headerLine = br.readLine();
            
            String Line;
            
            while((Line = br.readLine()) != null){
                Count = Count + 1;
            
            }
            br.close();
            
        } catch (FileNotFoundException e) {
           e.printStackTrace();
            e.printStackTrace();
        }catch (Exception e) {
            // Handle other exceptions here, if needed
            e.printStackTrace();
        }
        return Count;
    }
}

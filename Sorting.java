import java.util.NoSuchElementException;
import java.util.Scanner;

public class Sorting {
    
    // This function is to take any array and display all the attributes of that array.
    public static void DataAnalysis(ObjectClass[] ArrayList){
        
        
        System.out.print("TeamName------Goalsmade------Goalsfor------Netgoals\n");
        for(int i = ArrayList.length-1; i>= 0 ; i--){
            if (ArrayList[i] instanceof Object){
                ArrayList[i].DisplayAll();

            } 
        }
        return ;
    }
    
    

    // This function is to take an array as an input and as per the group decided by the user it filters the data accordingly 
    public static void GroupSorting(ObjectClass[] ArrayList, int count,String checkString) {
        
        try {
            System.out.println("Input: " + checkString);
                if (checkString.equals("A")) {
                    int Counter= GroupCount(ArrayList, count, checkString);

                    GroupEvaluation(ArrayList, Counter, checkString);
                } else if (checkString.equals("B")) {
                    int Counter= GroupCount(ArrayList, count, checkString);
                    GroupEvaluation(ArrayList, Counter, checkString);
                
                } else if (checkString.equals("C")) {
                    int Counter= GroupCount(ArrayList, count, checkString);
                    GroupEvaluation(ArrayList, Counter, checkString);
                
                } else if (checkString.equals("D")) {
                    int Counter= GroupCount(ArrayList, count, checkString);
         
                    GroupEvaluation(ArrayList, Counter, checkString);
                
                } else {
                System.out.println("Invalid input. Please enter A, B, C, or D.");
                }
            
                
            
        
                
             
            } 
        catch (NoSuchElementException e) {
            System.err.println("Input error: No line found");
            e.printStackTrace();
        }finally {
            // Close the Scanner when done
            
        }
            
            

            
}
     
    //  This function is to the sub function of Group sorting ,it takes the filter data object and perform required sorting

    public static void GroupEvaluation(ObjectClass[] ArrayList,int Count,String GroupCode){
        ObjectClass[] NewArray = new ObjectClass[Count];
        int Counter = 0;
        for (int i = 0; i < ArrayList.length; i++) {
            if(ArrayList[i].GetGroup().equals(GroupCode)) {
                NewArray[Counter] = ArrayList[i];
                Counter++;
                            
            }
        }
        ObjectClass[] NetArray = NewArray;
        ObjectClass[] ScoredArray = NewArray;
        ObjectClass[] AgainstArray = NewArray;
        
        InputFunction.NetGoalSorting(NetArray);
        
        InputFunction.GoalScoredSorting(ScoredArray);
        
        InputFunction.GoalAgainstSorting(AgainstArray);
        System.out.println("##########NetgoalsSorting##########\n");
        Sorting.DataAnalysis(NetArray);
        System.out.println("##########GoalsscoredSorting##########\n");
        Sorting.DataAnalysis(ScoredArray);
        System.out.println("##########GoalsAgainstSorting##########");
        Sorting.DataAnalysis(AgainstArray);

    }
    
    // This function is to count the number of object in the array 
    public static int  GroupCount(ObjectClass[] ArrayList,int Count,String GroupCode){
        int GroupCounter = 0;
        for(int i = 0; i < ArrayList.length; i++) {
            
            if(ArrayList[i].GetGroup().equals(GroupCode)) {
                GroupCounter++;

                            
            }
        }
        return GroupCounter;
    }
    


}   

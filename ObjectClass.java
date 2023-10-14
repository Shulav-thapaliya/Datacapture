//  This is for the object class 

public class ObjectClass {
        private String TeamName;
        private String TeamCode;
        private int GoalMade;
        private  int Goalfor;
        private String Group;
       
        //  This function is to initalize the object with valid input
        public ObjectClass(String TeamName,String TeamCode,int GoalMade,int Goalfor,String Group){
            this.TeamName = TeamName;
            this.TeamCode = TeamCode;
            this.GoalMade = GoalMade;
            this.Goalfor = Goalfor;
            this.Group = Group;
        }
        // This function is to check the data input by the user
        public void printValues(){
            System.out.println(TeamName);
            System.out.println(TeamCode);
            System.out.println(GoalMade);
            System.out.println(Goalfor);
            System.out.println(Group);
            

        }

        // This function is to calculate the netgoals of the  object 
        
        public int NetGoals(){
            int NetGoal = this.Goalfor - this.GoalMade;
            return NetGoal;
               
        }
        
        // This function is to Return the Teamname of the object
        public String GetTeamName(){
            return this.TeamName;
            
        }

        // This function is to Return the Goal made of the object
        public int GoalScored(){
            
            return this.GoalMade;
        }

        // This function is to Return the Goal against of the object 
        public int GoalAgainst(){
            
            return this.Goalfor;
             
        }

        // This function is to return the Goal of the object 
        public String GetGroup(){
            System.out.println(this.Group);
            return this.Group;
            
        }
        // This function is to display all the data of the object
        public void DisplayAll(){
            System.out.println(this.TeamName+"   .   "+this.GoalMade+"      .     "+this.Goalfor+"          .        "+NetGoals());

        }
        


    }


public class ObjectClass {
        private String TeamName;
        private String TeamCode;
        private int GoalMade;
        private  int Goalfor;
        private String Group;

        public ObjectClass(String TeamName,String TeamCode,int GoalMade,int Goalfor,String Group){
            this.TeamName = TeamName;
            this.TeamCode = TeamCode;
            this.GoalMade = GoalMade;
            this.Goalfor = Goalfor;
            this.Group = Group;
        }
        public void printValues(){
            System.out.println(TeamName);
            System.out.println(TeamCode);
            System.out.println(GoalMade);
            System.out.println(Goalfor);
            System.out.println(Group);
            

        }

        
        public int NetGoals(){
            int NetGoal = this.Goalfor - this.GoalMade;
            return NetGoal;
           

        }
        public String GetTeamName(){
            return this.TeamName;
            
        }
        public int GoalScored(){
            System.out.println(this.TeamName+"          "+this.GoalMade+"\n");
            return this.GoalMade;
        }
        public int GoalAgainst(){
            System.out.println(this.TeamName+"          "+this.Goalfor+"\n");
            return this.Goalfor;
             
        }
        public String GetGroup(){
            System.out.println(this.Group);
            return this.Group;
            
        }
        public void DisplayAll(){
            System.out.println(this.TeamName+"   .   "+this.GoalMade+"      .     "+this.Goalfor+"          .        "+NetGoals());

        }
        


    }
public class Hackathon {

    private static final int MAX_NO_OF_PROJECTS = 6;
    private static final int INDICATOR_COUNT = 4;
    private static int[] INDICATOR_WEIGHTS;
    private int projectCount = 0;
    private Project project;
    private Project[] projects; 

    public Hackathon() {
        this.projectCount = 0;
        projects = new Project[MAX_NO_OF_PROJECTS];
    }

    public int getMaxNoOfProjects() {
        return MAX_NO_OF_PROJECTS;
    }

    public int getIndicatorCount() {
        return INDICATOR_COUNT;
    }

    public int[] getIndicatorWeights() {
        return INDICATOR_WEIGHTS;
    }

    public void addProject(Project a) {
        
        a.setHackathon(this);

        projects[projectCount] = a;
        projectCount++;
    }


    public static void main (String [] args) {
        
     int [] rawscore1 = {100,240,15,26};
     int [] rawscore2 = {20,407,13,11};
     int [] rawscore3 = {100,281,13,39};
     int [] rawscore4 = {80,1264,4,38};
     int [] rawscore5 = {20,1020,12,11};
     int [] rawscore6 = {100,1162,17,34};

     Project project1 = new Project("A1" + rawscore1);
     Project project2 = new Project("A2" + rawscore2);
     Project project3 = new Project("A3" + rawscore3);
     Project project4 = new Project("A4" + rawscore4);
     Project project5 = new Project("A5" + rawscore5);
     Project project6 = new Project("A6" + rawscore6);


        System.out.println( "Project ID         " + "Indicator 1        " + "Indicator 2         " + "Indicator 3        " + "Indicator 4        ");
        
        

    }
}

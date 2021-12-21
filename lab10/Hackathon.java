public class Hackathon {
    
    private static final int MAX_NO_OF_PROJECTS = 6;
    private static final int INDICATOR_COUNT = 4;
    private static int[] INDICATOR_WEIGHTS;
    private int projectCount = 0;
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

    public void addProject(Project other) {
        
        other.setHackathon(this);

        projects[projectCount] = other;
        projectCount++;
    }


}

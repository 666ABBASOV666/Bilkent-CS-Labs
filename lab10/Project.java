public class Project {

    private static int INITIAL = 0;
    private static int MODIFIED = 1;
    private static int FINAL = 2;
    private String ID;
    private int finalScore;
    private String segment;
    private String credibility;
    private int[] rawScores;
    private int[] modifiedScores;
    private Hackathon hackathon;

    public Project(String a, int[] aRawscores) {
        this.ID = a;
        rawScores = aRawscores;
        segment = "?";
        credibility = "?";
        modifiedScores = new int[4];
    }

    public Hackathon getHackathon() {
        return hackathon;
    }

    public void setHackathon(Hackathon a) {
        this.hackathon = a;
    }

    public void calcModifiedScores() {
        int x = rawScores[0];
        modifiedScores[0] = x;

        x = rawScores[1];
        if(x > 0 && x < 500) {
            modifiedScores[1] = 20;
        }
        else if(500 < x && x <= 1000) {
            modifiedScores[1] = 80;
        }
        else if(1000 < x) {
            modifiedScores[1] = 100;
        }

        x = rawScores[2];

        if(0 <= x && x <= 6 ) {
            modifiedScores[2] = 100;
        }
        else if(6 < x && x <= 12) {
            modifiedScores[2] = 80;
        }
        else if(12 < x) {
            modifiedScores[2] = 20;
        }

        x = rawScores[3];

        if(0 <= x && x < 10) {
            modifiedScores[3] = 20;
        }
        else if(10 <= x && x < 15) {
            modifiedScores[3] = 80;
        }
        else if(15 <=x) {
            modifiedScores[3] = 100;
        }
    }

    public void calcWeightAvg() {
        finalScore = (int)(modifiedScores[0] * 10 / 100 + (int)modifiedScores[1] * 25 / 100 + (int)modifiedScores[2] * 30 / 100 + (int)modifiedScores[3] * 35 / 100);
    }

    public void calcSegment() {
        if(finalScore == 100) {segment = "A+";}
        else if(finalScore >= 90) {segment = "A";}
        else if(finalScore >= 75) {segment = "B";}
        else if(finalScore >= 60) {segment = "C";}
        else if(finalScore >= 40) {segment = "D";}
    }

    public void calcCredibility() {
        if(segment == "A+") {credibility = "Perfect";}
        else if(segment == "A") {credibility = "Very Good";}
        else if(segment == "B") {credibility = "Good";}
        else if(segment == "C") {credibility = "Considerate";}
        else if(segment == "D") {credibility = "Not appropriate";}
    }

}

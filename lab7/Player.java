public class Player {

    public static int count = 0;
    public static int allCount = 0;
    public int id;
    public int rosterNumber;
    public String name;
    public String position;
    public String team;
    public String transfer;
    private boolean isActive;
    private boolean isRight = true;
    
    //Part2
    public int recordGame;
    public int pointsPerGame;
    public int pointsPerGameAverage;
    public int assistsPerGame;
    public int assistsPerGameAverage;
    public int reboundsPerGame;
    public int reboundsPerGameAverage;
    public int turnoversPerGame;
    public int turnoversPerGameAverage;
    public static int gamesPlayed = 0;

    public Player (String a, String b, String c, int d) {
        this.name = a;
        this.position = b;
        this.team = c;
        this.rosterNumber = d;
        count++;
        allCount++;
        this.id = allCount;
    }
    
    public void setName (String aName) {
        this.name = aName;
    }   

    public void setPosition (String aPosition) {
        if (aPosition == "SF") {
            this.position = aPosition;
        }
        else if (aPosition == "PF") {
            this.position = aPosition;
        }
        else if (aPosition == "SG") {
            this.position = aPosition;
        }
        else if (aPosition == "PG") {
            this.position = aPosition;
        }
        else if (aPosition == "C") {
            this.position = aPosition;
        }
        else {  
            System.out.println("Error in position name");
        }
    }

    public void setRosterNumber (int aRosterNumber) {
        this.rosterNumber = aRosterNumber;
    }
    
    public void transfer (String aTransfer) {
        if(team == aTransfer) {
            System.out.println("Error: same");
        }
        else {
         team = aTransfer;
        }
    }

    public void retire () {
        isActive = false; 
    }

    public boolean isBeforeThan (Player player3) {
         int result = this.name.compareTo(name);
        if (result>0) {
            isRight = true;
        }
        else {
            isRight = false;
        }
        return isRight;
    }

    public void recordGame (int a, int b, int c, int d) {
        this.pointsPerGame = a;
        this.assistsPerGame = b;
        this.reboundsPerGame = c;
        this.turnoversPerGame  = d;
        gamesPlayed++;

        pointsPerGameAverage = pointsPerGameAverage + pointsPerGame;
        assistsPerGameAverage = assistsPerGameAverage + assistsPerGame;
        reboundsPerGameAverage = reboundsPerGameAverage + reboundsPerGame;
        turnoversPerGameAverage =  turnoversPerGameAverage + turnoversPerGame;
    }

    public double PPG () {
        return pointsPerGameAverage / 6;
    }

    public double APG () {
        return assistsPerGameAverage / gamesPlayed;
    }
 
    public double RPG () {
        return reboundsPerGameAverage / gamesPlayed;
    }

    public double TPG () {
        return turnoversPerGameAverage / gamesPlayed;
    }
    public double Efficiency () {
        return pointsPerGameAverage + 
        (0.7 * assistsPerGameAverage) + 
        (0.7 * reboundsPerGameAverage) -
        (0.9 * turnoversPerGameAverage);
    }

    public String toString () {
        return "************************************" + 
        "\n" + "Player ID: " + id + 
        "\n" + "Player Name: " + name + 
        "\n" + "Player Position: " + position + 
        "\n" + "Current Team: " + team +
        "\n" + "Jersey Number: " + rosterNumber + 
        "\n" + "------------------------------------" + 
        "\n" + "Stats: " + 
        "\n" + "PPG: " + PPG() +
        "\n" + "APG: " + APG() +
        "\n" + "RPG: " + RPG() +
        "\n" + "TPG: " + TPG() +
        "\n" + "Efficiency: " + Efficiency() + "\n";
    }


}
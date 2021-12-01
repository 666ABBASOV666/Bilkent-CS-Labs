public class Player {

    public static int count = 0;
    public static int allCount = 0;
    public int id;
    public int rosterNumber;
    private String name;
    public String position;
    public String team;
    public String transfer;
    private boolean isActive;
    private boolean isRight = true;

    
    //Part2
    public int recordGame;
    public int pointsPerGame;
    //public int pointsPerGameAverage = 0;
    public int assistsPerGame;
    //public int assistsPerGameAverage;
    public int reboundsPerGame;
    //public int reboundsPerGameAverage;
    public int turnoversPerGame;
    //public int turnoversPerGameAverage;
    public static double game = 1;
    public double games = 0;

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
        this.isActive = false;
        count--; 
    }

    public boolean isBeforeThan (Player player3) {
         int result = this.name.compareTo(player3.name);
        if (result < 0) {
            isRight = true;
        }
        else {
            isRight = false;
        }
        return isRight;
    }

    public void recordGame (int a, int b, int c, int d) {
        this.pointsPerGame = this.pointsPerGame + a;
        this.assistsPerGame = this.assistsPerGame + b;
        this.reboundsPerGame = this.reboundsPerGame + c;
        this.turnoversPerGame  = this.turnoversPerGame + d;
        games = game + games;
    }

    public String PPG () {
        double result = this.pointsPerGame / games;
        return String.format("%.2f", result);
    }

    public double PPGRES () {
        double result = this.pointsPerGame / games;
        return result;
    }

    public String APG () {
        double result = this.assistsPerGame / games;
        return String.format("%.2f", result);
    }

    public double APGRES () {
        double result = this.assistsPerGame / games;
        return result;
    }
 
    public String RPG () {
        
        double result = this.reboundsPerGame / games;
        return String.format("%.2f", result);
    }
    
    public double RPGRES () {
        double result = this.reboundsPerGame / games;
        return result;
    }

    public String TPG () {
       
        double result = this.turnoversPerGame / games;
        return String.format("%.2f", result);
    }

    public double TPGRES () {
        double result = this.turnoversPerGame / games;
        return result;
    }    

    public double getEfficiency () {
        return  PPGRES() + (0.7 * APGRES()) + (0.7 * RPGRES()) - (0.9 * TPGRES());
    }

    public String getEff () {
        double result = this.PPGRES() + (0.7 * this.APGRES()) + (0.7 * this.RPGRES()) - (0.9 * this.TPGRES());
        return String.format("%.2f", result);
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
        "\n" + "Efficiency: " + getEff() + 
        "\n"+
        "\n" + "Retirement Status: Active among " + count + " active player(s)" +
        "\n";
    }

    public String getName() {
        return name;
    }

    public boolean isMoreEfficient (Player player3) {
        if (this.getEfficiency() > player3.getEfficiency()) {
            return true;
        }
        else {
            return false;
        }
    }
}

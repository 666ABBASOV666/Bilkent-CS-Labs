public class Trainer{

    private String name;
    private String speciality;
    private boolean isPlayerCovid;
    private String lastTestDate; 
    public Player player;
    private boolean isCovid;;
    private String injuryStatus = "Healthy";

    public Trainer (String n, String s, Player player) {
        this.name = n;
        this.speciality = s;
        this.player = player;
    }
    
    public void recordCovidTest (boolean a, String b) {
        this.isCovid = a;
        this.lastTestDate = b;
    }

    public void updateInjuryStatus (String a) {
        this.injuryStatus = a;
        if (a == null) {
            this.injuryStatus = "Healthy";
        }
    }

    public String toString () {
        return "************************************" + 
        "\n" + "Trainer Name: " + name + 
        "\n" + "Trainer Speciality: " + speciality + 
        "\n" + "Player Name: " + player.getName() + 
        "\n" + "Is COVID-19 positive?: " + isCovid +
        "\n" + "Last test date: " + lastTestDate + 
        "\n" + "Injury status: " + injuryStatus + 
        "\n" + "------------------------------------"; 
    }
}
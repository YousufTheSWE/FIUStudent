public class FiuStudent {
    private String name;
    private int pantherID;
    private String pantherEmail;
    private String major;

    private boolean hasHold;

    public FiuStudent(String name, String major, String pantherEmail, int pantherID, boolean hasHold){
        this.name = name;
        this.major = major;
        this.pantherEmail = pantherEmail;
        this.pantherID = pantherID;
        this.hasHold = hasHold;
    }

    public FiuStudent(String name, String major, String pantherEmail, int pantherID){
        this.name = name;
        this.major = major;
        this.pantherEmail = pantherEmail;
        this.pantherID = pantherID;
        this.hasHold = false;
    }

    public FiuStudent(){
        this.name = "Some Student";
        this.major = "Exploratory";
        this.pantherEmail = "Unknown";
        this.pantherID = 6000000;
        this.hasHold = false;
    }

    public String getName(){
        return name;
    }

    public String getMajor(){
        return major;
    }

    public String getPantherEmail(){
        return pantherEmail;
    }

    public int getPantherID(){
        return pantherID;
    }

    public boolean getHasHold(){
        return hasHold;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public void setPantherEmail(String pantherEmail){
        this.pantherEmail = pantherEmail;
    }

    public void setPantherID(int pantherID){
        this.pantherID = pantherID;
    }

    public void setHasHold(boolean hasHold){
        this.hasHold = hasHold;
    }

    public String toString(){
        String hasHold1;
        if(hasHold){
            hasHold1 = "does have a hold.";
        } else{
            hasHold1 = "does not have a hold.";
        }

        return "FIU Student named " + name + " with major " + major + " and panther email " + pantherEmail +
                " and panther ID " + pantherID + " and " + hasHold1;
    }
}
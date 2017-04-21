public class Ticket implements Comparable {

    // v-------------v instanceVars v-------------v

    private int ID;
    private int VIPLvl;
    private boolean solved;
    private String name;
    private String problem;
    private String sol_Description;

    // ^-------------^ instanceVars ^-------------^

    // v-------------v constructor v-------------v

    public Ticket() {
	ID = 0;
	VIPLvl = 100;
	solved = false;
	name = "";
	problem = "";
	sol_Description = "";
    }

    public Ticket( int VIP, String nom, String prob) {
	ID = 0;
	VIPLvl = VIP;
	solved = false;
	name = nom;
	problem = prob;
	sol_Description = "";
    }

    // ^-------------^ constructor ^-------------^

    // v-------------v accessors v-------------v

    public int getID() {
	return ID;
    }
    public int getVIP() {
	return VIPLvl;
    }
    public boolean getSol() {
	return solved;
    }
    public String getName() {
	return name;
    }
    public String getProblem() {
	return problem;
    }
    public String getSolDesc() {
	return sol_Description;
    }

    // ^-------------^ accessors ^-------------^

    // v-------------v compareTo v-------------v

    public int compareTo(Ticket other) {
	if (this.getVIP() < other.getVIP()) {
	    return 1;
	}
	else if (this.getVIP() > other.getVIP()) {
	    return -1;
	}
	else {
	    return 0;
	}
    }

    // ^-------------^ compareTo ^-------------^

}

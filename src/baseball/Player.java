package baseball;

public class Player {
	private int Hits;
	private int AB;
	private int BB; //walks
	private int HBP; //Hit by Pitch
	private int SF;
	private int dbl;
	private int triple;
	private int HR;
	
	public Player(int Hits, int AB, int BB, int HBP, int SF, int dbl, int triple, int HR) {

		super();
		this.Hits = Hits;
		this.AB = AB;
		this.BB = BB;
		this.HBP = HBP;
		this.SF = SF;
		this.dbl = dbl;
		this.triple = triple;
		this.HR = HR;
		
		
				
	
	}

	public int getHits() {
		return Hits;
	}

	public void setHits(int hits) {
		Hits = hits;
	}

	public int getAB() {
		return AB;
	}

	public void setAB(int aB) {
		AB = aB;
	}

	public int getBB() {
		return BB;
	}

	public void setBB(int bB) {
		BB = bB;
	}

	public int getHBP() {
		return HBP;
	}

	public void setHBP(int hBP) {
		HBP = hBP;
	}

	public int getSF() {
		return SF;
	}

	public void setSF(int sF) {
		SF = sF;
	}

	public int getDbl() {
		return dbl;
	}

	public void setDbl(int dbl) {
		this.dbl = dbl;
	}

	public int getTriple() {
		return triple;
	}

	public void setTriple(int triple) {
		this.triple = triple;
	}

	public int getHR() {
		return HR;
	}

	public void setHR(int hR) {
		HR = hR;
	}
	
	public double BA() {
		return Player.BA(this.Hits, this.AB);
		
	}
	
	public static double BA(int Hits, int AB) {
		return Hits / AB;
	}
	
	public static double BA(Player pl) {
		return Player.BA(pl.Hits, pl.AB);
	}
	
	public double OBP() {
		return Player.OBP(this.Hits, this.BB, this.HBP, this.AB, this.SF);
		
	}
	
	public static double OBP(int Hits, int BB, int HBP, int AB, int SF) {
		return (Hits + BB + HBP) / (AB + BB + HBP + SF);
	}
	
	public static double OBP(Player pl) {
		return Player.OBP(pl.Hits, pl.BB, pl.HBP, pl.AB, pl.SF);
	}
	
	public double SLG() {
		return Player.SLG(this.Hits, this.dbl, this.triple, this.HR, this.AB);
		
	}
	
	public static double SLG(int Hits, int dbls, int Triples, int HR, int AB) {
		return (Hits + dbls + (Triples * 2) + (HR * 3) / AB);
	}
	
	public static double SLG(Player pl) {
		return Player.SLG(pl.Hits, pl.dbl, pl.triple, pl.HR, pl.AB);
	}
	
	public static double OBS(Player pl) {
		return OBP(pl) + SLG(pl);
	}
	public static int TB(Player pl) {
		return pl.Hits + (2 * pl.dbl) +(3 * pl.triple) + (4 * pl.HR);
	}
	
	
	
}
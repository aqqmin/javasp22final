package dungeonzero;

//Ability is a data holder class that provides control information to an ability effect calculator which is used in the battle methods

public class Ability 
{
	private String name;
	//controle codes to select stats for comparison
	private int statCode1;
	private int statCode2;
	//operative coefficients to tweak comparisons
	private int statCoef1;
	private int statCoef2;
	//control code to select logic to carry out on stats with coefficients
	private int operatorCode;
	//target stat1, and 2
	private int resultStat1;
	private int resultStat2;
	//requirements to activate, reqStat is just an integer control code to operate a switch/case statement
	//reqVal is the value which is required
	private int reqStat;
	private int reqVal;
	
	//abilities take these values, all abilities are initialized at beginning by a call of world function initAbilities() which
	Ability
		(
			String name, 
			int stat1, 
			int stat2,
			int statCoef1,
			int statCoef2,
			int operatorCode, 
			int resultStat1, 
			int resultStat2,
			int reqStat,
			int reqVal
		)
		
	{
		this.name = name;
		this.statCode1 = stat1;
		this.statCode2 = stat2;
		this.statCoef1 = statCoef1;
		this.statCoef2 = statCoef2;
		this.operatorCode = operatorCode;
		this.resultStat1 = resultStat1;
		this.resultStat2 = resultStat2;
		this.reqStat = reqStat;
		this.reqVal = reqVal;
	}
	//just getters, abilities are immutable and will be instanced by loading values from an array
	public String getName() {
		return name;
	}

	public int getStatCode1() {
		return statCode1;
	}

	public int getStatCoef1() {
		return statCoef1;
	}

	public int getStatCode2() {
		return statCode2;
	}

	public int getStatCoef2() {
		return statCoef2;
	}

	public int getOperatorCode() {
		return operatorCode;
	}

	public int getResultStat1() {
		return resultStat1;
	}

	public int getResultStat2() {
		return resultStat2;
	}

	public int getReqStat() {
		return reqStat;
	}

	public int getReqVal() {
		return reqVal;
	}
}

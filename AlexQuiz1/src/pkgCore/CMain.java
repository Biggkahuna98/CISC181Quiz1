// Alex Sederquest's Quiz 1

package pkgCore;

import java.text.DecimalFormat;

public class CMain {

	public static void main(String[] args) {
		// Using to round to 3 decimal places so it is easier to read, at least for me it is
		DecimalFormat dformat = new DecimalFormat("0.000");
		
		CBaseballCalculator theMightyCalc = new CBaseballCalculator();
		
		System.out.println("BA: " + dformat.format(theMightyCalc.ba()));
		System.out.println("OBP: " + dformat.format(theMightyCalc.obp()));
		System.out.println("SLG: " + dformat.format(theMightyCalc.slg()));
		System.out.println("OBS: " + dformat.format(theMightyCalc.obs()));
		System.out.println("TB: " + theMightyCalc.tb());
	}

}

package interfaces;

public class BackwardsString extends SpecialString{

	public BackwardsString(String s) {
		super(s);
	}

	public String funkifyText(String s) {
		String a = "";
		for(int i = s.length()-1; i>-1; i--) {
			a+=s.charAt(i);
		}
		return a;
	}

}

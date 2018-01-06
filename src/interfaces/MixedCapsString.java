package interfaces;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	public String funkifyText(String s) {
		String a = "";
		for(int i = 0; i<s.length(); i++) {
			if(i%2 == 0) {
				a+=Character.toString(s.charAt(i)).toLowerCase();
			}
			else {
				a+=Character.toString(s.charAt(i)).toUpperCase();
			}
		}
		return a;
	}

}

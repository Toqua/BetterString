package testStreams;

public class CharacterStreamTest {

	
	public static boolean myIsLetter(String s){
		if(s==null)return false;
		else if(s.equals(""))return false;
		else return s.chars().allMatch(Character::isLetter);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="ihbhbin@";
		System.out.println(myIsLetter(s1));

	}

}

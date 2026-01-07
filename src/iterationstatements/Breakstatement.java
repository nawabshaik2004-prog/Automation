package iterationstatements;

public class Breakstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			if(i==5) {
			System.out.println("breaking at i:"+i);
			break;
			}
			System.out.println(i);
		}
	}

}

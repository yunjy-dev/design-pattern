package singletone;

public class SingletoneHuman {
	
	private static SingletoneHuman singletoneHuman;
	
	static int eye;
	static int nose;
	
	private SingletoneHuman(int eye, int nose) {
		this.eye = eye;
		this.nose = nose;
	}
	
	public static SingletoneHuman GetHumanInstance(int eye, int nose) {
		if (singletoneHuman == null ) {
			singletoneHuman = new SingletoneHuman(eye, nose);
			StringBuilder stb= new StringBuilder();
			stb.append(" eye: ");
			stb.append(eye);
			stb.append("\tnose: ");
			stb.append(nose);
			System.out.println(stb);
		} else {
			System.out.println("The instance of SingletoneHuman is already exist.");
		}

		return singletoneHuman;
		
	}
}






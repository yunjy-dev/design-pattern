package singletone;

public class Human {
	public int eye;
	public int nose;
	
	public Human(int eye, int nose){
		this.eye = eye;
		this.nose = nose;
		StringBuilder stb= new StringBuilder();
		stb.append(" eye: ");
		stb.append(eye);
		stb.append("\tnose: ");
		stb.append(nose);
		System.out.println(stb);
	}
}

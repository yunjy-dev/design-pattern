package singletone;

public class Program {

	public static void main(String[] args) {
		Human human1 = new Human(1,1);
		Human human2 = new Human(2,2);
		Human human3 = new Human(3,3);
		
//		SingletoneHuman singletoneHuman1 = new SingletoneHuman();
		SingletoneHuman singletoneHuman = SingletoneHuman.GetHumanInstance(4,4);
		
		//�ν��Ͻ� �߰��� �����ȵ�
		SingletoneHuman singletoneHuman2 = SingletoneHuman.GetHumanInstance(5,5);
		
		System.out.println(singletoneHuman.eye);
		System.out.println(singletoneHuman2.eye);


	}

}

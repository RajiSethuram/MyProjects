package MyPak;

public class Jabsmain extends Japstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jabsmain().sum();
		Jabsmain.display();
		
		Jabsmain j=new Jabsmain();
		j.add();
		int x= new Jabsmain().a;
		//int y=new Jabsmain().b;
		System.out.println("A value is   :"+x);

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("calling absract method");
	}

}

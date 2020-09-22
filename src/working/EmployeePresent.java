package working;

public class EmployeePresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IS_FULL_TIME=1;
		double empCheck=(Math.floor(Math.random()*10)%2);
		if(IS_FULL_TIME==empCheck)
		{
			System.out.println("Full time");
		}
		else
		{
			System.out.println("Not full time");
		}
	}

}

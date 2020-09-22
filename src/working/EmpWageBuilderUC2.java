package working;

public class EmpWageBuilderUC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HOUR=200;
		
		//Variable
		int empHrs=0;
		int empWage=0;
		double empCheck=(Math.floor(Math.random()*10)%2);
		if(IS_FULL_TIME==empCheck)
		{
			empHrs=8;
		}
		else
		{
			empHrs=0;
		}
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("EMP wage :"+empWage);

	}

}

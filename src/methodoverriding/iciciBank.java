package methodoverriding;

public class iciciBank {

	 int getrateofinterest() 
	 { 
		 return 7;
	 }
}

class SBI extends iciciBank {
	
	int getrateofinterest() 
	{
		return 4;
	}
}

class Hdfc extends SBI{
	
	int getrateofinterest() 
	{
		System.out.println();
		return 5;
	}
}

class Axisbank extends Hdfc {
	int getrateofinterest()
	{
		return 6;
	}
}
   class allbanks{
	   
	   public static void main(String[] args) {
		
		   iciciBank i = new iciciBank();
		   SBI S = new SBI();
		   Hdfc H = new Hdfc();
		  Axisbank A = new Axisbank();
		 
		  System.out.println("The ICICI Bank Rate of Interest :"+i.getrateofinterest()+"%");
		  System.out.println("The SBI Bank Rate of Interest : "+S.getrateofinterest()+"%");
		  System.out.println("The HDFC Rate Of Interest : "+H.getrateofinterest()+"%");
		  System.out.println("The Axis Bank Rate Of Interest : "+A.getrateofinterest()+"%");
		  
		   
	}
   }


public class expdemo {
	static void transfer(double amount,int x,int z) throws userDefinedExcp
	{
		if(amount<500){
			throw new userDefinedExcp();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		transfer(4,1,2);
		}catch(userDefinedExcp e)
		{			
			e.printStackTrace();
		}

	}

}

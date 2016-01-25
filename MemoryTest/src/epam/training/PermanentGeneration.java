package epam.training;

public class PermanentGeneration {
	static javassist.ClassPool cp = javassist.ClassPool.getDefault();
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// for -XX:MaxPermSize=800m last Generated class is -class epam.training.Generated54967
		// for -XX:MaxPermSize=1024m  last  Generated class is -class epam.training.Generated735848
	
		for (int i = 0; ; i++)
		 {
			 Class c = cp.makeClass("epam.training.Generated" + i).toClass();
			 System.out.println("Generated class is - " + c);
		 }
	 }

}

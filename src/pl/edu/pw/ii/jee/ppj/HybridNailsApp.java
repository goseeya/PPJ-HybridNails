package pl.edu.pw.ii.jee.ppj;

public class HybridNailsApp {

	public static void main(String[] args) {
		NailStep nailStep1 = new NailStep("base");
		NailStep nailStep2 = new NailStep("polish");
		
		System.out.println("The step of nailStep1 is " + nailStep1.getStep());
		nailStep1.polish();
		System.out.println("The step of nailStep1 is " + nailStep1.getStep());
		nailStep2.polish();
		System.out.println("The step of nailStep2 is " + nailStep2.getStep());
		nailStep2.top();
		System.out.println("The step of nailStep2 is " + nailStep2.getStep());

	}

}

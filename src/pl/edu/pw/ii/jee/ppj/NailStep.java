package pl.edu.pw.ii.jee.ppj;

public class NailStep extends Step implements HybridMaterial {
	
	public NailStep(String step) {
		setStep(step);
	}
	
	public void setStep(String step) {
		this.step = step;
	}

	public void base() {
		if (getStep().equals("base")) {
			System.out.println("You've just applied a base.");
		} else {
			setStep("base");
			System.out.println("Base applied.");
		}

	}

	public void polish() {
		if (getStep().equals("polish")) {
			System.out.println("Added another polish layer.");
		} else if (getStep().equals("top")) {
			System.out.println("Don't apply polish on the top.");
		} else {
			setStep("polish");
			System.out.println("Polish applied.");
		}
	}

	public void top() {
		if (getStep().equals("polish")) {
			setStep("top");
			System.out.println("Added top on the polish");
		} else if (getStep().equals("top")) {
			System.out.println("Added another top layer.");
		} else {
			setStep("top");
			System.out.println("Top applied.");
		}
	}


}

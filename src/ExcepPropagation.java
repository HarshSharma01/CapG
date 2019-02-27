
public class ExcepPropagation {
	void emi() {
	int value=100/0;
	}
	void pin() {
		emi();
	}
		void transaction() {
			try {
				pin();
			}
			catch(ArithmeticException e) {
				System.out.println("handled");
			}
	}

	public static void main(String[] args) {
		ExcepPropagation ep=new ExcepPropagation();
		ep.transaction();
	}
}

import java.util.ArrayList;

public class Calculation {
	public String input;
	public ArrayList<String> args = new ArrayList<String>();
	public String operators = "+-*/^";
	public String answer = "ERROR";
	
	public void receive(String input) {
		this.input = input;
		this.parse(this.input);
		this.answer = Double.toString(this.calcStart());
	}
	
	private void parse(String input) {
		int breaker = input.indexOf(' ');
		if (breaker == -1) {
			args.add(input);
			return;
		}
		String part = input.substring(0, breaker);
		args.add(part);
		this.parse(input.substring(breaker + 1));
	}
	
	private double calcStart() {
		String operand = "";
		ArrayList<Double> nums = new ArrayList<Double>();
		for (String s : this.args) {
			if (operators.contains(s)) {
				operand = s;
			} else {
				nums.add(Double.parseDouble(s));
			}
		}
		
		switch (operand) {
		case "+":
			return nums.get(0) + nums.get(1);
		case "-":
			return nums.get(0) - nums.get(1);
		case "*":
			return nums.get(0) * nums.get(1);
		case "/":
			return nums.get(0) / nums.get(1);
		default:
			return nums.get(0);
		
		}
	}
	
	public String getAnswer() {
		return this.answer;
	}
	
}

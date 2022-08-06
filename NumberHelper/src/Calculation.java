import java.util.ArrayList;
import java.util.Arrays;

public class Calculation {
	private String input;
	private ArrayList<String> args = new ArrayList<String>();
	private String operators = "+-*/^";
	public String answer = "ERROR";

	public void receive(String input) {
		this.input = input;
		if (input.contains("cos") || input.contains("sin") || input.contains("tan") ||
				input.contains("log") || input.contains("ln")) {
			if (!input.endsWith(")")) {
				this.input = input.concat(")");
			}
			this.parseExp(this.input);
			this.answer = Double.toString(this.expStart());
		} else {
			this.parse(this.input);
			this.answer = Double.toString(this.calcStart());
		}
	}
	
	private void parseExp(String input) {
		int start = input.indexOf('(');
		int end = input.indexOf(')');
		String part = input.substring(start + 1, end);
		args.add(part);
		args.add(input.substring(0, start));
		
	}
	
	private double expStart() {
		double input = 0.0;
		if (args.get(0).equals("e")) {
			input = Math.E;
		} else if (args.get(0).equals("\u03c0")) {
			input = Math.PI;
		} else {
			input = Double.parseDouble(args.get(0));
		}
		double deg2Rad = Math.toRadians(input);
		switch (args.get(1)) {
		case "cos":
			return Math.round(Math.cos(deg2Rad) * 1000000000) / 1000000000.0;
		case "sin":
			return Math.round(Math.sin(deg2Rad) * 1000000000) / 1000000000.0;
		case "tan":
			return Math.round(Math.tan(deg2Rad) * 1000000000) / 1000000000.0;
		case "ln":
			return Math.round(Math.log(input) * 1000000000) / 1000000000.0;
		case "log":
			return Math.round(Math.log10(input) * 1000000000) / 1000000000.0;
		default:
			return 0.0;
		}
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
			} else if (s.equals("e")) {
				nums.add(Math.E);
			} else if (s.equals("\u03c0")) {
				nums.add(Math.PI);
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
		case "^":
			return Math.pow(nums.get(0), nums.get(1));
		default:
			return nums.get(0);

		}
	}

	public String getAnswer() {
		return this.answer;
	}

}

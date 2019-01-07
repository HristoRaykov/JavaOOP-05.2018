package P03_DependencyInversion.strategies;

public class MultiplicationStrategy implements CalculationStrategy {
	
	@Override
	public int calculate(int firstOperand, int secondOperand) {
		return firstOperand*secondOperand;
	}
	
}

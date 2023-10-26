package test_project;
import java.lang.constant.Constable;
import java.math.BigDecimal;;

public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		BigDecimal a = new BigDecimal("0.2");
		BigDecimal b = new BigDecimal("0.1");
		
		BigDecimal sum = a.add(b);
		BigDecimal diff = a.subtract(b);
		BigDecimal multi = a.multiply(b);
		BigDecimal div = a.divide(b);
		
		sb.append(sum).append("\n")
		.append(diff).append("\n")
		.append(multi).append("\n")
		.append(div);
		
		System.out.print(sb);
		
	}

}

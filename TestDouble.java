package q9;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class TestDouble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double d1 = 12345667890.12345667890;
		double d2 = 12345667890.12345667890;
		double d3 = 12345667890.12345667890;

		double answerD = d1 * d2 * d3;

		System.out.println("D：" + answerD);
		String str = String.format("%f",answerD);
		System.out.println("D：" + str);

		// ブラウザから編集のテストします。


		BigDecimal bd1 = new BigDecimal(12345667890.12345667890);
		BigDecimal bd2 = new BigDecimal(12345667890.12345667890);
		BigDecimal bd3 = new BigDecimal(12345667890.12345667890);

		BigDecimal answerB = (bd1.multiply(bd2)).multiply(bd3);

		System.out.println("B：" + answerB);
		System.out.println("B：" + answerB.toPlainString());
		System.out.println("-------------");

		d1 = 1.1;
		d2 = 2.2;

		System.out.println("1.1 + 2.2 = " + (d1+d2));
		System.out.println("-------------");
	}

}

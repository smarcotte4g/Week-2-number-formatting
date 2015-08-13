package com.smarcotte.number_formatting;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Launcher {

	public static void main(String[] args) {
		// Do some math
		double num = 100.0 / 3.0;
		
		// not formatting
		System.out.print("No formatting: ");
		System.out.println(num);
		
		// using NumberFormat for decimal places
		NumberFormat fmtNumber = NumberFormat.getNumberInstance();
		fmtNumber.setMaximumFractionDigits(2);
		fmtNumber.setMinimumIntegerDigits(10);
		System.out.print("\nNumberFormat: ");
		System.out.println(fmtNumber.format(num));
		
		// using NumberFormat for currency
		NumberFormat fmtCurrency = NumberFormat.getCurrencyInstance();
		System.out.print("NumberFormat for currency: ");
		System.out.println(fmtCurrency.format(num));
		
		// using DecimalFormat for numbers
		DecimalFormat fmtNumber1 = new DecimalFormat("#,##0.00");
		System.out.print("\nDecimalFormat: ");
		System.out.println(fmtNumber1.format(num));
		
		// using decimal format for currency
		DecimalFormat fmtCurrency1 = new DecimalFormat("$#,##0.00");
		System.out.print("\nDecimalFormat for currency: ");
		System.out.println(fmtCurrency1.format(num));
		
		// exit gracefully
		System.exit(0);

	}

}

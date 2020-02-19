package com.shruthi.interest;

public class CompoundInterest {
	double CompoundInterestCalculation(double principalAmount,double timeInYears,double rateOfInterest)
	{
		return(principalAmount*Math.pow(1.0+rateOfInterest/100.0,timeInYears)-principalAmount);
	}
}

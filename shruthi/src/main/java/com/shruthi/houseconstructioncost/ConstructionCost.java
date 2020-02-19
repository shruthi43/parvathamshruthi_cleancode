package com.shruthi.houseconstructioncost;

public class ConstructionCost {
	double calculateHouseCost(String TypeOfMaterial,double AreaOfHouse)
	{
		if(TypeOfMaterial=="Standard Material")
			return(AreaOfHouse*1200);
		else if(TypeOfMaterial=="Above Standard Material")
			return(AreaOfHouse*1500);
		else if(TypeOfMaterial=="High Standard Material")
			return(AreaOfHouse*1800);
		else if(TypeOfMaterial=="High Standard Material and Fully Automated")
			return(AreaOfHouse*2500);
		else
			return(0.0);
	}
}

package gst.calculate;

import java.io.IOException;
import java.util.Scanner;

public class CalculateGST {
	public static void main(String args[]) throws IOException
	{
		System.out.println("Enter Units item unitPrice:");
		Scanner sc = new Scanner(System.in);
		int units = sc.nextInt();
		ReadPropertyFile rdp = new ReadPropertyFile();
		String item = sc.next();
		double gstValue[]=new double[5];
		if((item.equalsIgnoreCase("Rice")) || (item.equalsIgnoreCase("Dal"))||(item.equalsIgnoreCase("Wheat")))
		{
			FoodGrains fd = new FoodGrains(units,sc.nextInt());
			 gstValue = fd.calculateGST(Integer.parseInt(rdp.getProperty("FoodGrainsSlab")),fd.getUnitPrice(),fd.getUnits());
			
		}

		if((item.equalsIgnoreCase("Table")) || (item.equalsIgnoreCase("Sofa"))||(item.equalsIgnoreCase("Chair")))
		{
			Furniture ft = new Furniture(units,sc.nextInt());
			 gstValue = ft.calculateGST(Integer.parseInt(rdp.getProperty("FurnitureSlab")),ft.getUnitPrice(),ft.getUnits());
			
		}
		if((item.equalsIgnoreCase("Mobile")) || (item.equalsIgnoreCase("TV"))||(item.equalsIgnoreCase("Tablet")))
		{
			Electronics ec = new Electronics(units,sc.nextInt());
			 gstValue = ec.calculateGST(Integer.parseInt(rdp.getProperty("ElectronicsSlab")),ec.getUnitPrice(),ec.getUnits());
			
		}
		if((item.equalsIgnoreCase("Cream")) || (item.equalsIgnoreCase("Perfume"))||(item.equalsIgnoreCase("Lotion")))
		{
			Cosmetics cm = new Cosmetics(units,sc.nextInt());
			 gstValue = cm.calculateGST(Integer.parseInt(rdp.getProperty("CosmeticsSlab")),cm.getUnitPrice(),cm.getUnits());
			
		}
		System.out.println("GSTApplicablePerUnit"+" "+"FinalPrice");
		System.out.println(gstValue[0]+" "+(gstValue[1] ));



	}
}

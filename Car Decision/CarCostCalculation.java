import java.util.Scanner;

public class CarCostCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inputs
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the cost of a regular car: ");
		double regularCarCost=scan.nextDouble();
		System.out.print("Enter the miles per gallon of a regular car: ");
		double regularGallonMiles=scan.nextDouble();
		System.out.print("Enter the cost of a hybrid car: ");
		double hybridCarCost=scan.nextDouble();
		System.out.print("Enter the miles per gallon of a hybrid car: ");;
		double hybridGallonMiles=scan.nextDouble();
		System.out.print("Enter the miles traveled in a year: ");
		double travelMiles=scan.nextDouble();
		System.out.print("Enter the cost per gallon of gas: ");
		double costPerGallon=scan.nextDouble();
		
		//Computations
		double yearOne=regularCarCost+(travelMiles/regularGallonMiles)*2.5;
		System.out.println("Cost to own after Year 1 for regular car: "+yearOne);
		double yearOne1=hybridCarCost+(travelMiles/hybridGallonMiles)*2.5;
		System.out.println("Cost to own after Year 1 for hybrid car: "+yearOne1);
		double yearTwo=regularCarCost+(travelMiles*(2)/regularGallonMiles)*2.5;
		System.out.println("Cost to own after Year 2 for regular car: "+yearTwo);
		double yearTwo2=hybridCarCost+(travelMiles*(2)/hybridGallonMiles)*2.5;
		System.out.println("Cost to own after Year 2 for hybrid car: "+yearTwo2);
		double yearThree=regularCarCost+(travelMiles*(3)/regularGallonMiles)*2.5;
		System.out.println("Cost to own after Year 3 for regular car: "+yearThree);
		double yearThree3=hybridCarCost+(travelMiles*(3)/hybridGallonMiles)*2.5;
		System.out.println("Cost to own after Year 3 for hybrid car: "+yearThree3);
		double yearFour=regularCarCost+(travelMiles*(4)/regularGallonMiles)*2.5;
		System.out.println("Cost to own after Year 4 for regular car: "+yearFour);
		double yearFour4=hybridCarCost+(travelMiles*(4)/hybridGallonMiles)*2.5;
		System.out.println("Cost to own after Year 4 for hybrid car: "+yearFour4);
		double yearFive=regularCarCost+(travelMiles*(5)/regularGallonMiles)*2.5;
		System.out.println("Cost to own after Year 5 for regular car: "+yearFive);
		double yearFive5=hybridCarCost+(travelMiles*(5)/hybridGallonMiles)*2.5;
		System.out.println("Cost to own after Year 5 for hybrid car: "+yearFive5);
		System.out.println("The hybrid car pays back after 5 years");
 
 
 
 
	}

}

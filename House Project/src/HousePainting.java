import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		//Input all variables necessary for calculation
		System.out.print("Enter the length of the house:");
		int houseLength=scan.nextInt();
		System.out.print("Enter the width of the house:");
		int houseWidth=scan.nextInt();
		System.out.print("Enter the height of the house: ");
		int houseHeight=scan.nextInt();
		
		//Print the House SqFt
		int houseSqFt=2*(houseLength*houseWidth);
		System.out.println("House SqFT:"+houseSqFt);
		
		System.out.print("Enter the # of Windows:");
		int windowNumbers=scan.nextInt();
		System.out.print("Enter the length of the windows: ");
		int windowLength=scan.nextInt();
		System.out.print("Enter the width of the windows: ");
		int windowWidth=scan.nextInt();
		
		//Print the Window Sqft
		int windowSqft=(10*(windowLength*windowWidth));
		System.out.println("windowSqft:"+windowSqft);
		
		System.out.print("Enter the number of doors: ");;
		int doorNumbers=scan.nextInt();
		System.out.print("Enter the length of the door: ");
		int lengthDoor=scan.nextInt();
		System.out.print("Enter the width of the door: ");
		int widthDoor=scan.nextInt();
		
		//Print the Door Sqft
		int doorSqft=(2*(lengthDoor*widthDoor));
		System.out.println("doorSqft:"+doorSqft);

		double peakSqft= 2*((houseLength*houseWidth)+.5*(houseLength*(houseHeight-houseWidth)));
		System.out.println("Peak Sqft: "+peakSqft) ;
		
		double regularSqft= 2*(houseLength*houseWidth);
		System.out.println("Regular Sqft: "+regularSqft) ;
		
		//Sqft to paint 
		double paintSqft=(peakSqft+regularSqft);
		System.out.println("Square foot to paint window and door: "+paintSqft);
				
		//Sum of Window and door sqft
		int sumSqft=windowSqft+doorSqft;
		//Sqft to paint with doors
		double paintSqft2=paintSqft-sumSqft;
		System.out.print("Square foot to paint house: "+paintSqft2);
		
		
		
		
		
		
		
		
		
		
		

	}

}

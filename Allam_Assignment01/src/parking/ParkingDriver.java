package parking;

//@author  Tejaswi Allam

import java.util.Scanner;

public class ParkingDriver {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String licensePlate = "";
		String model = "";
		int parkingspace;
		int userinput = 0;
		VlkParkingLot vlk = new VlkParkingLot();
		//Car car = new Car(model, licensePlate);
		Scanner sc = new Scanner(System.in);
		while(userinput!= 7)
		{
		System.out.println("VlkParkingLot Menu :");
		System.out.println("1.Park a car \n2.Free a space \n3.Retrieve a car by license plate\n4.Get parking space of car by license plate \n5.Check parking space \n6.Display parking lot \n7.Exit");
		System.out.print("choose an option");
		userinput = sc.nextInt();
		switch(userinput)
		{
		case 1:
		    System.out.print("Enter car license plate: ");
		    licensePlate = sc.next();
		    System.out.print("Enter car model: ");
		    model = sc.next();
		    System.out.print("Enter parking space number (0-99): ");
		    parkingspace = sc.nextInt();
		    Car car = new Car(model, licensePlate);
		    try {
		        vlk.parkCar(car, parkingspace);
		    } catch (Exception e) {
		        System.out.println("Error: " + e.getMessage());
		    }
		    System.out.println();
		    break;

		case 2:
            System.out.print("Enter parking space number to free (0-99): ");
            parkingspace = sc.nextInt();
            try {
                Car freedCar = vlk.freeSpace(parkingspace);
                System.out.println("Freed space, car removed: " + freedCar);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        	System.out.println();
            //vlk.freeSpace(parkingspace);
            break;
		case 3:
			System.out.println("Enter car license plate to retrieve: ");
			licensePlate = sc.next();
			//vlk.retrieve(licensePlate);
			try {
                Car retrievedCar = vlk.retrieve(licensePlate);
                System.out.println("Retrieved car: " + retrievedCar);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
			System.out.println();
			break;
		case 4:
            System.out.println("Enter car license plate to get parking space number:");
            licensePlate = sc.next();
            int Space = vlk.parkingSpot(licensePlate);
           // int Space = parkingLot.parkingSpot(plateForSpace);
            //System.out.println(Space);
            //1Car car1 = new Car(model, licensePlate);
            System.out.println("Parking Space of " + licensePlate + ": " + Space);
        	System.out.println();
            break;
		case 5:
			System.out.println("Enter parking space number to check (0-99):");
			parkingspace = sc.nextInt();
			//vlk.checkParkingSpace(parkingspace);
			try {
                String status = vlk.checkParkingSpace(parkingspace);
                System.out.println("Space status: " + status);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
			System.out.println();
			break;
		case 6:
			vlk.display();
			System.out.println();
			break;
		case 7:
            System.out.println("Exiting...");
            break;
		default: 
			System.out.println("Invalid option. Please try again.");
			System.out.println();
			
            
		}
		
		}
		sc.close();
       // System.out.println("Exiting...");
	}

}

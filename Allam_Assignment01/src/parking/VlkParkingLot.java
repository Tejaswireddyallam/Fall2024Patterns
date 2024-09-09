package parking;

//@author  Tejaswi Allam

//import java.util.HashMap;

public class VlkParkingLot {
	
	 private final int TOTAL_SPOTS = 100;
	 private final int HANDICAPPED_SPOTS = 30;
	 private Car[] parkingSpaces = new Car[TOTAL_SPOTS];
	 
	 public VlkParkingLot() {
	        // Initialize the parking lot with empty spaces
	        for (int i = 0; i < TOTAL_SPOTS; i++) {
	            parkingSpaces[i] = null; // Empty space
	        }
	    }

	
	public String checkParkingSpace(int index) {
        if (index < 0 || index >= TOTAL_SPOTS) {
            throw new IndexOutOfBoundsException("Parking space does not exist.");
        }
        if (parkingSpaces[index] == null) {
            if (index < HANDICAPPED_SPOTS) {
                return "Handicapped Space";
            } else {
                return "Space Available";
            }
        } else {
            return "Space Taken";
        }
    }
	
	public void parkCar(Car car, int spaceNumber) {
	   // if (spaceNumber < 0 || spaceNumber >= TOTAL_SPOTS) {
	        //throw new IndexOutOfBoundsException("Parking space does not exist.");
	   // }
	    if (parkingSpaces[spaceNumber] != null) {
	        throw new IllegalStateException("Parking space is already occupied.");
	    }
	    parkingSpaces[spaceNumber] = car;
	    System.out.println("Car parked successfully");
	  //  System.out.println("Car parked successfully at space " + spaceNumber + " with license plate: " + car.getLicensePlate());
	}


	
	 public Car freeSpace(int spaceNumber) {
	       //if (spaceNumber < 0 || spaceNumber >= TOTAL_SPOTS) {
	           //throw new IndexOutOfBoundsException("Parking space does not exist.");
	      // }
	        if (parkingSpaces[spaceNumber] == null) {
	            throw new IllegalStateException("Parking space is already empty.");
	        }
	        Car removedCar = parkingSpaces[spaceNumber];
	        parkingSpaces[spaceNumber] = null;
	        return removedCar;
	    }
	 
	 public Car retrieve(String licensePlate) {
		    for (int i = 0; i < TOTAL_SPOTS; i++) {
		        if (parkingSpaces[i] != null && parkingSpaces[i].getLicensePlate().equalsIgnoreCase(licensePlate)) { // Use equalsIgnoreCase
		            Car retrievedCar = parkingSpaces[i];
		            parkingSpaces[i] = null; // Remove the car from the parking space
		            return retrievedCar;
		        }
		    }
		    throw new IllegalStateException("Car does not exist in the parking lot.");
		}
	
	 public int parkingSpot(String licensePlate) {
		    for (int i = 0; i < TOTAL_SPOTS; i++) {
		        if (parkingSpaces[i] != null) {
		          //  System.out.println("Checking space " + i + " with car: " + parkingSpaces[i].getLicensePlate());
		            if (parkingSpaces[i].getLicensePlate().equalsIgnoreCase(licensePlate)) {
		                return i; 
		            }
		        }
		    }
		    return -1;  // Car not found, return -1
		}

	 
	 public void display() {
	        for (int i = 0; i < TOTAL_SPOTS; i++) {
	            if (parkingSpaces[i] == null) {
	                if (i < HANDICAPPED_SPOTS) {
	                    System.out.println("Space " + i + ": Available (Handicapped Space)");
	                } else {
	                    System.out.println("Space " + i + ": Available (Regular Space)");
	                }
	            } else {
	                System.out.println("Space " + i + ": Occupied by " + parkingSpaces[i].toString() + 
	                                   (i < HANDICAPPED_SPOTS ? " (Handicapped Space)" : " (Regular Space)"));
	            }
	        }
	    }
	 
	 @Override
	    public String toString() {
		 String result = "";  // Initialize an empty string
		    for (int i = 0; i < TOTAL_SPOTS; i++) {
		        if (parkingSpaces[i] != null) {
		            result += "Space " + i + ": Occupied by " + parkingSpaces[i].toString() + "\n";
		        } else {
		            result += "Space " + i + ": Available\n";
		        }
		    }
		    return result;
	    }

}

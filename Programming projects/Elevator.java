public class Elevator {
    public static void main(String[] args) {
        // Initialize!!! The elevator is starting at floor 1
        int elevatorA = 1; // Elevator A starting at floor 1
        int elevatorB = 1; // Elevator B starting at floor 1
        
        // Command line inputs - Time to gather our inputs from the command line—let's see what floors our elevators will be servicing today!

        int numberOfFloors = Integer.parseInt(args[0]); // Total number of floors (count)
        int floorRequests = Integer.parseInt(args[1]);  // Floor requests (in reversed order) :)
        int numberOfRestricted = Integer.parseInt(args[2]); // Number of restricted floors 
        
        // Checking for passcode - Let's check if we've got the secret passcode to access those exclusive floors—time to unlock some restricted floors hehe

        int restrictedPasscode = 0;
        if (numberOfRestricted > 0 && args.length > 3) {
            restrictedPasscode = Integer.parseInt(args[3]); // Passcode for restricted access
        }

        // Determine the number of requests - Counting the number of floor requests—let's see how many stops our elevators have to make
        int requestCount = 0;
        int tempRequests = floorRequests;
        while (tempRequests > 0) {
            requestCount++;
            tempRequests /= 10;  
        }

        // Process each request in descending order - let’s get these elevators moving
        for (int i = 0; i < requestCount; i++) {
            // Extract the last digit as the current request
            int num = floorRequests % 10;  
            floorRequests /= 10; // Remove the last digit

            // Check if the requested floor is restricted
            if (num >= (numberOfFloors - numberOfRestricted + 1)) {
                // This is a restricted floor
                if (restrictedPasscode % numberOfFloors == num || 
                    (restrictedPasscode % numberOfFloors == 0 && num == numberOfFloors)) {
                    // Access granted
                    if (Math.abs(num - elevatorA) <= Math.abs(num - elevatorB)) {
                        elevatorA = num;
                        System.out.println(1 + " " + num);
                    } else {
                        elevatorB = num;
                        System.out.println(2 + " " + num);
                    }
                    System.out.println("Granted");
                } else {
                    // Access denied
                    // Check which elevator services the floor regardless of restriction
                    if (Math.abs(num - elevatorA) <= Math.abs(num - elevatorB)) {
                        elevatorA = num;
                        System.out.println(1 + " " + num);
                    } else {
                        elevatorB = num;
                        System.out.println(2 + " " + num);
                    }
                    System.out.println("Denied");
                }
            } else {
                // For non-restricted floors, directly service the floor
                if (Math.abs(num - elevatorA) <= Math.abs(num - elevatorB)) {
                    elevatorA = num;
                    System.out.println(1 + " " + num);
                } else {
                    elevatorB = num;
                    System.out.println(2 + " " + num);
                }
            }
        }
    }
}
// we DID ITTTTT WOOO
//CERTIFIED TECH BADDIES
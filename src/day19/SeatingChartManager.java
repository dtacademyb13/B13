package day19;

public class SeatingChartManager {


    /**
     * Seating Chart Manager
     * * Task Description:
     * * Create a Java class named SeatingChartManager that helps a theater to manage seating arrangements for its audience.
     * * The class will use a two-dimensional array to represent rows and seats within each row and
     * perform various manipulations to simulate seat assignment and management.
     * *
     * * Operations to Implement:
     * * Initialize Seating: A method initializeSeating that sets up the seating chart with a specified number of rows and seats per row.
     * * Assign Seat: A method assignSeat that assigns a seat to a customer based on the row and seat number and marks the seat as taken.
     * * Cancel Seat: A method cancelSeat that frees up a seat that was previously assigned to a customer.
     * * Search Seat: A method searchSeat that checks if a specific seat (row and seat number) is available.
     * * Print Seating Chart: A method printSeatingChart that prints out the current seating chart showing which seats are occupied and which are available.
     * *
     * * Guidelines:
     *
     * * Use a two-dimensional array where each element represents a seat, using a boolean value to indicate if it's taken (false) or available (true).
     * * Assume each row has the same number of seats for simplicity.
     * * Validate seat assignments to ensure they don't exceed the array bounds and handle any invalid inputs.
     * * Use nested loops to iterate over rows and seats when necessary.
     */

    public static boolean[][] initializeSeating(int rows, int numberOfSeats){

        boolean[][] seating =  new boolean[rows][numberOfSeats];

        for (int i = 0; i < seating.length; i++) {

            for (int j = 0; j < seating[i].length; j++) {
                seating[i][j] = true;
            }

        }

        return seating;


    }

    public static void printSeatingChart(boolean[][] seating){
        for (boolean[] row: seating){

            for( boolean seat: row){
                System.out.print(seat ? "[ ]" : "[X]");
            }
            System.out.println();
        }
    }


    public static void assignSeat(boolean[][] seating, int row, int seatNumber){

      if(row>=0 && row< seating.length && seatNumber>=0 && seatNumber < seating[0].length) {

          if (seating[row][seatNumber] == true) {
              System.out.println("Assigning a seat -> Row: " + row + ": Seat: " + seatNumber + "");
              seating[row][seatNumber] = false; // assign the seat
          } else {
              System.out.println("Row: " + row + ": Seat: " + seatNumber + " is already assigned");
          }

      }else {
          System.out.println("Either row or seat number is invalid");
      }


    }

    public static void cancelSeat(boolean[][] seating, int row, int seatNumber){

        //   if(row>=0 && row< seating.length && seatNumber>=0 && seatNumber < seating[0].length) add this check


        if(seating[row][seatNumber] == false){
            System.out.println("Canceling a seat -> Row: "+row+": Seat: "+seatNumber+"");
            seating[row][seatNumber] = true; // cancel the seat
        }else{
            System.out.println( "Row: "+row+": Seat: "+seatNumber+" is already available.");
        }


    }

    public static boolean isAvailable(boolean[][] seating, int row, int seatNumber){

        //   if(row>=0 && row< seating.length && seatNumber>=0 && seatNumber < seating[0].length) add this check
        return seating[row][seatNumber];
    }

    public static void main(String[] args) {

        System.out.println("Creating a 7 X 20 seating chart");

        boolean[][] seating = initializeSeating(7, 20);

        printSeatingChart(seating);



        assignSeat(seating,5, 8);

        assignSeat(seating,0, 3);

        assignSeat(seating,3, 9);
        assignSeat(seating,3, 9);

        printSeatingChart(seating);

        cancelSeat(seating,0,3);

        printSeatingChart(seating);

        cancelSeat(seating,0,3);

        // Check is a certain seat is available

        boolean available = isAvailable(seating, 5, 7);

        System.out.println("Row 5 Seat 7 " +  (available ? " is available" : " is not available"));



        assignSeat(seating, 20,20);


    }
}

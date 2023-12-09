package Banks;

public class Flight {
    private final int number;
    private final String destination;

    public Flight(int number, String destination) {
        if (number > 0) {
            this.number = number;
            this.destination = destination;
        } else {
            this.number = 0;
            this.destination = "";
        }
    }

    public void display() {
        System.out.println(number + ", " + destination);
    }

    public static void main(String[] args) {
        Flight g1 = new Flight(123, "Tokyo");
        g1.display();
    }
}
import java.util.Scanner;

class Car {
    String ModelName;
    int price;

    Car(String ModelName, int price) {
        this.ModelName = ModelName;
        this.price = price;

    }

    void display() {
        System.out.println("Car Model: " + ModelName + "  Price: " + price);
    }

}

class CarManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car[] cars = new Car[5];

        cars[0] = new Car("Car1", 100000);
        cars[1] = new Car("Car2", 230000);
        cars[2] = new Car("Car3", 780000);
        cars[3] = new Car("Car4", 90000);
        cars[4] = new Car("Car5", 786660);
        System.out.println(
                "Welcome to Car service \n select for following options \n1. Display all the car details \n2. Higher and lower prices \n3. Check based on Car Price Range \n4. Find ur Car \n5.Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (Car c : cars) {
                    c.display();
                }
                break;
            case 2:
                Car highest = cars[0];
                Car lowest = cars[0];
                for (int i = 0; i < cars.length; i++) {
                    if (highest.price < cars[i].price) {
                        highest = cars[i];
                    }
                }

                for (int i = 0; i < cars.length; i++) {
                    if (lowest.price > cars[i].price) {
                        lowest = cars[i];
                    }
                }

                System.out.println("Car with Highest Price: \n Model Name: " + highest.ModelName + "  Price: "
                        + highest.price);
                System.out.println(
                        "Car with Lowest Price: \n Model Name: " + lowest.ModelName + "  Price: " + lowest.price);
                break;
            case 3:
                System.out.println("enter the range of car price : ");
                int carPrice = sc.nextInt();
                for (Car c : cars) {
                    if (carPrice >= c.price) {
                        System.out.println("Car model: " + c.ModelName + " Price: " + c.price);
                    }
                }
                break;
            case 4:
                System.out.println("enter the car name ur finding: ");
                String sname = sc.next();
                boolean isFound = false;

                for (Car c : cars) {
                    if (c.ModelName.equals(sname)) {
                        isFound = true;
                        c.display();
                        break;
                    }
                }
                if (!isFound) {
                    System.out.println("Car not found");
                }
                break;
            case 5:
                break;

            default:
                System.out.println("Enter a valid input as suggested");
                break;
        }
        sc.close();
    }
}

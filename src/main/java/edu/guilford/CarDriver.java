package edu.guilford;

import java.util.random.RandomGeneratorFactory;

/**
 * Hello world!
 *
 */
public class CarDriver 
{
    public static void main( String[] args )
    {
       // Generate a random array of sports cars and luxry cars; 40 each
       // and then ask the user how many they want to see
            Car car1 = new Car("Ford", "Mustang", 2019, "red");
            Car car2 = new Car("Chevy", "Corvette", 2019, "blue");
            Car car3 = new Car("Dodge", "Challenger", 2019, "black");
            Car car4 = new Car("Toyota", "Supra", 2019, "yellow");
            Car car5 = new Car("Nissan", "GTR", 2019, "white");
            Car car6 = new Car("Mazda", "RX7", 2019, "green");
            Car car7 = new Car("Subaru", "WRX", 2019, "orange");
            Car car8 = new Car("Honda", "Civic", 2019, "purple");
            Car car9 = new Car("Mitsubishi", "Eclipse", 2019, "pink");
            Car car10 = new Car("BMW", "M3", 2019, "brown");
            Car car11 = new Car("Audi", "R8", 2019, "silver");
            Car car12 = new Car("Mercedes", "AMG", 2019, "gold");
            Car car13 = new Car("Porsche", "911", 2019, "gray");
            Car car14 = new Car("Lamborghini", "Huracan", 2019, "maroon");
            Car car15 = new Car("Ferrari", "488", 2019, "cyan");
            Car car16 = new Car("Bugatti", "Veyron", 2019, "magenta");
            Car car17 = new Car("Koenigsegg", "Agera", 2019, "lime");
            Car car18 = new Car("McLaren", "P1", 2019, "olive");
            Car car19 = new Car("Pagani", "Zonda", 2019, "teal");
            Car car20 = new Car("Aston Martin", "DB11", 2019, "navy");
            Car car21 = new Car("Lotus", "Elise", 2019, "aqua");
            Car car22 = new Car("Bentley", "Continental", 2019, "beige");
            Car car23 = new Car("Rolls Royce", "Phantom", 2019, "ivory");
            Car car24 = new Car("Maserati", "GranTurismo", 2019, "coral");
            Car car25 = new Car("Jaguar", "F-Type", 2019, "khaki");
            Car car26 = new Car("Lexus", "LFA", 2019, "crimson");
            Car car27 = new Car("Tesla", "Roadster", 2019, "azure");
            Car car28 = new Car("Volkswagen", "Golf", 2019, "lavender");

            Car[] cars = {car1, car2, car3, car4, car5, car6, car7, car8, car9, car10,
            car11, car12, car13, car14, car15, car16, car17, car18, car19, car20,
            car21, car22, car23, car24, car25, car26, car27, car28};

            System.out.println("How many cars would you like to see?");
            int numCars = Integer.parseInt(System.console().readLine());
            for (int i = 0; i < numCars; i++) {
                int randomCar = (int) (Math.random() * 28);
                System.out.println(cars[randomCar].getMake() + " " + cars[randomCar].getModel() + " " + cars[randomCar].getYear() + " " + cars[randomCar].getColor()); // set the random car to the array
            }

            // sort the result of the printed array by make and model
            for (int i = 0; i < numCars; i++) {
                for (int j = 0; j < numCars - 1; j++) {
                    if (cars[j].getMake().compareTo(cars[j + 1].getMake()) > 0) {
                        Car temp = cars[j];
                        cars[j] = cars[j + 1];
                        cars[j + 1] = temp;
                    }
                    if (cars[j].getMake().compareTo(cars[j + 1].getMake()) == 0) {
                        if (cars[j].getModel().compareTo(cars[j + 1].getModel()) > 0) {
                            Car temp = cars[j];
                            cars[j] = cars[j + 1];
                            cars[j + 1] = temp;
                        }
                    }
                }
            }


            
            // Print the sorted array by result randomly generated
            System.out.println("Sorted by Aplhabet; make and model:");
            for (int i = 0; i < numCars; i++) {
                int randomCar = (int) (Math.random() * 28);
                System.out.println(cars[randomCar].getMake() + " " + cars[randomCar].getModel() + " " + cars[randomCar].getYear() + " " + cars[randomCar].getColor());
            }



        }

        





        
    }

import java.util.Scanner;

class Train {
    int Train_No;
    String Train_Name;
    int No_Of_Coach;
    String Train_Type;
    String[] Stations;
    int[] distance;

    public Train(int Train_No, String Train_Name, int No_Of_Coach, String Train_Type, String[] Stations, int[] distance) {
        this.Train_No = Train_No;
        this.Train_Name = Train_Name;
        this.No_Of_Coach = No_Of_Coach;
        this.Train_Type = Train_Type;
        this.Stations = Stations;
        this.distance = distance;
    }
}

class Coach {
    String Coach_Type;
    int Sleeper;
    int AC3;
    int AC2;
    int AC1;

    public Coach(String Coach_Type, int Sleeper, int AC3, int AC2, int AC1) {
        this.Coach_Type = Coach_Type;
        this.Sleeper = Sleeper;
        this.AC3 = AC3;
        this.AC2 = AC2;
        this.AC1 = AC1;
    }
}

class Passenger {
    String Passenger_Name;
    String Email;
    double Mobile_No;
    String Gender;
    int Age;

    public Passenger(String Passenger_Name, String Email, double Mobile_No, String Gender, int Age) {
        this.Passenger_Name = Passenger_Name;
        this.Email = Email;
        this.Mobile_No = Mobile_No;
        this.Gender = Gender;
        this.Age = Age;
    }

    public String collectPassengerDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name Here:");
        this.Passenger_Name = sc.nextLine();
        System.out.println("Enter Your E-Mail Here:");
        this.Email = sc.nextLine();
        System.out.println("Enter Your Mobile No. Here:");
        this.Mobile_No = sc.nextDouble();
        sc.nextLine(); // Clear buffer
        System.out.println("Enter Your Gender Here:");
        this.Gender = sc.nextLine();
        System.out.println("Enter Your Age Here:");
        this.Age = sc.nextInt();
        sc.nextLine(); // Clear buffer

        return "Passenger: " + Passenger_Name + ", Email: " + Email + ", Mobile: " + Mobile_No + 
               ", Gender: " + Gender + ", Age: " + Age;
    }
}

class Login {
    String Username;
    String Password;

    public Login(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }
}

public class Lab_1C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Collect Travel Details
        System.out.println("Enter The Boarding Station:-");
        String Boarding = sc.nextLine();
        System.out.println("Enter The Arriving Station:-");
        String Arriving = sc.nextLine();
        System.out.println("Enter Date You Want To Travel:-");
        String Date = sc.nextLine();
        System.out.println("Do You Want To Take Lounge Or Hotels To Stay:-");
        String Hotels = sc.nextLine();
        System.out.println("Do You Want To Take Meal During Trip:-");
        String Meal = sc.nextLine();

        // Train 1 - Saurashtra Janta
       String[] stationsTrain1 = {"Veraval", "Rajkot", "Ahemdabad", "Vadodara", "Surat", "Bandra Terminus"};
        int[] distancesTrain1 = {0, 185, 432, 531, 660, 912};
        Train train1 = new Train(19218, "SAURASHTRA JANTA", 10, "Superfast", stationsTrain1, distancesTrain1);

        // Train 2 - Mumbai Express
        String[] stationsTrain2 = {"Mumbai", "Pune", "Solapur", "Hyderabad"};
        int[] distancesTrain2 = {0, 150, 300, 500};
        Train train2 = new Train(12345, "Mumbai Express", 12, "Express", stationsTrain2, distancesTrain2);

        // Train 3 - Gujarat Mail
        String[] stationsTrain3 = {"Rajkot", "Surat", "Mumbai"};
        int[] distancesTrain3 = {0, 475, 750};
        Train train3 = new Train(54321, "Gujarat Mail", 8, "Mail", stationsTrain3, distancesTrain3);

        // Train 4 - Tamil Nadu Express
        String[] stationsTrain4 = {"Delhi", "Agra", "Bhopal", "Nagpur", "Chennai"};
        int[] distancesTrain4 = {0, 200, 550, 900, 2200};
        Train train4 = new Train(12622, "Tamil Nadu Express", 15, "Superfast", stationsTrain4, distancesTrain4);

        // Train 5 - Poorva Express
        String[] stationsTrain5 = {"Kolkata", "Patna", "Varanasi", "Delhi"};
        int[] distancesTrain5 = {0, 550, 850, 1500};
        Train train5 = new Train(12303, "Poorva Express", 14, "Express", stationsTrain5, distancesTrain5);

        // Train 6 - Rani Chennamma Express
        String[] stationsTrain6 = {"Bangalore", "Hubli", "Pune", "Mumbai"};
        int[] distancesTrain6 = {0, 400, 800, 1000};
        Train train6 = new Train(16589, "Rani Chennamma Express", 11, "Express", stationsTrain6, distancesTrain6);

        // Train 7 - Swarna Jayanti Rajdhani
        String[] stationsTrain7 = {"Ahemdabad", "Ajmer", "Jaipur"};
        int[] distancesTrain7 = {0, 440, 650};
        Train train7 = new Train(12957, "Swarna Jayanti Rajdhani", 9, "Rajdhani", stationsTrain7, distancesTrain7);

        // Train 8 - Trivandrum Rajdhani
        String[] stationsTrain8 = {"Trivandrum", "Kochi", "Mangalore", "Goa", "Mumbai"};
        int[] distancesTrain8 = {0, 280, 630, 900, 1350};
        Train train8 = new Train(12431, "Trivandrum Rajdhani", 10, "Rajdhani", stationsTrain8, distancesTrain8);

        // Train 9 - Shatabdi Express
        String[] stationsTrain9 = {"Ranchi", "Jamshedpur", "Kolkata"};
        int[] distancesTrain9 = {0, 130, 330};
        Train train9 = new Train(12019, "Shatabdi Express", 8, "Shatabdi", stationsTrain9, distancesTrain9);

        // Train 10 - Bangalore Rajdhani
        String[] stationsTrain10 = {"Delhi", "Bhopal", "Nagpur", "Bangalore"};
        int[] distancesTrain10 = {0, 550, 900, 2400};
        Train train10 = new Train(22691, "Bangalore Rajdhani", 12, "Rajdhani", stationsTrain10, distancesTrain10);

        // Train 11 - Rajendra Nagar Express
        String[] stationsTrain11 = {"Patna", "Mughalsarai", "Allahabad", "Kanpur", "Delhi"};
        int[] distancesTrain11 = {0, 200, 350, 550, 1000};
        Train train11 = new Train(12309, "Rajendra Nagar Express", 13, "Express", stationsTrain11, distancesTrain11);

        // Train 12 - Netravati Express
        String[] stationsTrain12 = {"Mumbai", "Goa", "Mangalore", "Trivandrum"};
        int[] distancesTrain12 = {0, 450, 720, 1000};
        Train train12 = new Train(16345, "Netravati Express", 14, "Express", stationsTrain12, distancesTrain12);

        // Train 13 - North East Express
        String[] stationsTrain13 = {"Delhi", "Lucknow", "Gorakhpur", "Guwahati"};
        int[] distancesTrain13 = {0, 320, 520, 1100};
        Train train13 = new Train(12506, "North East Express", 11, "Superfast", stationsTrain13, distancesTrain13);

        // Train 14 - Gitanjali Express
        String[] stationsTrain14 = {"Mumbai", "Nagpur", "Bhubaneswar", "Kolkata"};
        int[] distancesTrain14 = {0, 830, 1620, 2000};
        Train train14 = new Train(12859, "Gitanjali Express", 12, "Superfast", stationsTrain14, distancesTrain14);

        // Train 15 - Telangana Express
        String[] stationsTrain15 = {"Hyderabad", "Nagpur", "Bhopal", "Delhi"};
        int[] distancesTrain15 = {0, 600, 950, 1500};
        Train train15 = new Train(12723, "Telangana Express", 10, "Express", stationsTrain15, distancesTrain15);

        // Train 16 - Amritsar Express
        String[] stationsTrain16 = {"Mumbai", "Surat", "Jaipur", "Amritsar"};
        int[] distancesTrain16 = {0, 260, 1100, 1400};
        Train train16 = new Train(11057, "Amritsar Express", 15, "Express", stationsTrain16, distancesTrain16);

        // Train 17 - Sanghamitra Express
        String[] stationsTrain17 = {"Bangalore", "Chennai", "Nagpur", "Patna"};
        int[] distancesTrain17 = {0, 350, 1700, 2600};
        Train train17 = new Train(12295, "Sanghamitra Express", 13, "Superfast", stationsTrain17, distancesTrain17);

        // Train 18 - Mumbai Rajdhani
        String[] stationsTrain18 = {"Mumbai", "Surat", "Vadodara", "Delhi"};
        int[] distancesTrain18 = {0, 260, 390, 1400};
        Train train18 = new Train(12951, "Mumbai Rajdhani", 9, "Rajdhani", stationsTrain18, distancesTrain18);

        // Train 19 - Falaknuma Express
        String[] stationsTrain19 = {"Kolkata", "Bhubaneswar", "Visakhapatnam", "Hyderabad"};
        int[] distancesTrain19 = {0, 440, 880, 1200};
        Train train19 = new Train(12703, "Falaknuma Express", 11, "Superfast", stationsTrain19, distancesTrain19);

        // Train 20 - Karnataka Express
        String[] stationsTrain20 = {"Delhi", "Bhopal", "Pune", "Bangalore"};
        int[] distancesTrain20 = {0, 550, 1400, 2000};
        Train train20 = new Train(12627, "Karnataka Express", 12, "Superfast", stationsTrain20, distancesTrain20);

        // Train 21 - Nanded Express
        String[] stationsTrain21 = {"Mumbai", "Aurangabad", "Nanded"};
        int[] distancesTrain21 = {0, 350, 550};
        Train train21 = new Train(12485, "Nanded Express", 10, "Express", stationsTrain21, distancesTrain21);

        // Train 22 - Punjab Mail
        String[] stationsTrain22 = {"Mumbai", "Bhopal", "Delhi", "Amritsar"};
        int[] distancesTrain22 = {0, 830, 1400, 1900};
        Train train22 = new Train(12137, "Punjab Mail", 14, "Superfast", stationsTrain22, distancesTrain22);

        // Train 23 - Purushottam Express
        String[] stationsTrain23 = {"Puri", "Kolkata", "Varanasi", "Delhi"};
        int[] distancesTrain23 = {0, 500, 1200, 1900};
        Train train23 = new Train(12801, "Purushottam Express", 13, "Superfast", stationsTrain23, distancesTrain23);

        // Train 24 - Paschim Express
        String[] stationsTrain24 = {"Mumbai", "Surat", "Jaipur", "Delhi"};
        int[] distancesTrain24 = {0, 260, 1100, 1400};
        Train train24 = new Train(12925, "Paschim Express", 11, "Superfast", stationsTrain24, distancesTrain24);

        // Train 25 - Navjeevan Express
        String[] stationsTrain25 = {"Ahemdabad", "Surat", "Nagpur", "Chennai"};
        int[] distancesTrain25 = {0, 300, 900, 2100};
        Train train25 = new Train(12655, "Navjeevan Express", 12, "Superfast", stationsTrain25, distancesTrain25);

        // Train 26 - Howrah Mail
        String[] stationsTrain26 = {"Mumbai", "Nagpur", "Kolkata"};
        int[] distancesTrain26 = {0, 830, 2000};
        Train train26 = new Train(12321, "Howrah Mail", 13, "Mail", stationsTrain26, distancesTrain26);

        // Train 27 - Yesvantpur Express
        String[] stationsTrain27 = {"Ahemdabad", "Pune", "Bangalore"};
        int[] distancesTrain27 = {0, 650, 1200};
        Train train27 = new Train(16501, "Yesvantpur Express", 10, "Express", stationsTrain27, distancesTrain27);

        // Train 28 - Miraj Express
        String[] stationsTrain28 = {"Bangalore", "Miraj", "Pune"};
        int[] distancesTrain28 = {0, 450, 750};
        Train train28 = new Train(12493, "Miraj Express", 9, "Express", stationsTrain28, distancesTrain28);

        // Train 29 - Grand Trunk Express
        String[] stationsTrain29 = {"Delhi", "Nagpur", "Chennai"};
        int[] distancesTrain29 = {0, 900, 2100};
        Train train29 = new Train(12615, "Grand Trunk Express", 14, "Superfast", stationsTrain29, distancesTrain29);

        // Train 30 - Goa Express
        String[] stationsTrain30 = {"Vasco da Gama", "Hubli", "Pune", "Delhi"};
        int[] distancesTrain30 = {0, 350, 800, 2000};
        Train train30 = new Train(12779, "Goa Express", 11, "Superfast", stationsTrain30, distancesTrain30);





















        // Booking process
        System.out.println("Do You Want To Book Ticket (yes/no):-");
        String Booking = sc.nextLine();
        if (Booking.equalsIgnoreCase("yes")) {
            // Collect passenger info
            Passenger passenger = new Passenger("", "", 0, "", 0);
            System.out.println(passenger.collectPassengerDetails());

            // Coach selection
            System.out.println("Select Coach Type (Sleeper/3AC/2AC/1AC):");
            String coachType = sc.nextLine();
            Coach coach = new Coach(coachType, 100, 50, 30, 20); // Example capacities
            double coachFare = 0;
            switch (coachType.toLowerCase()) {
                case "sleeper": coachFare = 300; break;
                case "3ac": coachFare = 700; break;
                case "2ac": coachFare = 1000; break;
                case "1ac": coachFare = 1500; break;
                default: 
                    System.out.println("Invalid coach type, defaulting to Sleeper");
                    coachFare = 300;
            }
            TravelFare += coachFare;

            // Add meal and hotel costs
            if (Meal.equalsIgnoreCase("yes")) {
                TravelFare += 200;
                System.out.println("Meal added: +Rs.200");
            }
            if (Hotels.equalsIgnoreCase("yes")) {
                TravelFare += 500;
                System.out.println("Hotel/Lounge added: +Rs.500");
            }

            // Final booking confirmation
            System.out.println("\nBooking Confirmed!");
            System.out.println("Train Number: " + selectedTrain.Train_No);
            System.out.println("Train Name: " + selectedTrain.Train_Name);
            System.out.println("Number of Coaches: " + selectedTrain.No_Of_Coach);
            System.out.println("Train Type: " + selectedTrain.Train_Type);
            System.out.println("Travel Date: " + Date);
            System.out.println("Total Fare: Rs." + TravelFare);
        } else {
            System.out.println("Thanks For Coming");
        }

        sc.close();
    }
}
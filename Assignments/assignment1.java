import java.util.Scanner;
class WeatherAnalyzer {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize the Temperatures array
        double[][] temperatures = {
            // Monday
            {18.5, 19.1, 20.3, 21.7, 22.4, 23.0, 23.6, 24.2, 24.8, 25.5, 26.1, 26.7, 27.3, 27.9, 28.5, 29.1, 29.7, 30.3, 30.9, 31.5, 32.1, 32.7, 33.3, 33.9},
            // Tuesday
            {17.8, 18.3, 19.7, 20.9, 21.5, 22.0, 22.6, 23.2, 23.8, 24.4, 25.0, 25.6, 26.2, 26.8, 27.4, 28.0, 28.6, 29.2, 29.8, 30.4, 31.0, 31.6, 32.2, 32.8},
            // Wednesday
            {16.9, 17.5, 18.1, 18.7, 19.3, 19.9, 20.5, 21.1, 21.7, 22.3, 22.9, 23.5, 24.1, 24.7, 25.3, 25.9, 26.5, 27.1, 27.7, 28.3, 28.9, 29.5, 30.1, 30.7},
            // Thursday
            {19.2, 20.1, 21.0, 21.8, 22.7, 23.5, 24.3, 25.2, 26.0, 26.8, 27.6, 28.4, 29.3, 30.1, 30.9, 31.7, 32.5, 33.3, 34.1, 34.9, 35.7, 36.5, 37.3, 38.1},
            // Friday
            {18.0, 18.9, 19.8, 20.6, 21.4, 22.3, 23.1, 24.0, 24.8, 25.6, 26.4, 27.3, 28.1, 28.9, 29.7, 30.6, 31.4, 32.2, 33.0, 33.8, 34.7, 35.5, 36.3, 37.1},
            // Saturday
            {20.1, 21.0, 21.9, 22.8, 23.7, 24.6, 25.5, 26.4, 27.3, 28.2, 29.1, 30.0, 30.9, 31.8, 32.7, 33.6, 34.5, 35.4, 36.3, 37.2, 38.1, 39.0, 39.9, 40.8},
            // Sunday
            {21.3, 22.1, 22.9, 23.8, 24.7, 25.6, 26.5, 27.4, 28.3, 29.2, 30.1, 31.0, 31.9, 32.8, 33.7, 34.6, 35.5, 36.4, 37.3, 38.2, 39.1, 40.0, 40.9, 41.8}
        };

        // Other Variables
        char ch;

        do{
            menu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayTemperatureResults(temperatures, "Minimum", "day");
                    break;
                case 2:
                    displayTemperatureResults(temperatures, "Maximum", "day");
                    break;
                case 3:
                    displayTemperatureResults(temperatures, "Average", "day");
                    break;
                case 4:
                    displayTemperatureResultsForWeek(temperatures, "Minimum");
                    break;
                case 5:
                    displayTemperatureResultsForWeek(temperatures, "Maximum");
                    break;
                case 6:
                    displayTemperatureResultsForWeek(temperatures, "Average");
                    break;
                case 7:
                    getTemperatureForGivenDay(temperatures, "Minimum", scanner);
                    break;
                case 8:
                    getTemperatureForGivenDay(temperatures, "Maximum", scanner);
                    break;
                case 9:
                    getTemperatureForGivenDay(temperatures, "Average", scanner);
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 9.");
            }
            System.out.print("Continue or not (y|n) ? ");
            ch = scanner.next().charAt(0);
        }while (ch == 'y' || ch == 'Y');
        starLine(40, '=');
        System.out.println("\t End of the Program");
        starLine(40, '='); 
    }

    static void starLine(int n, char ch) {
        for (int i = 1; i <= n; i++) 
            System.out.print(ch);
        System.out.println();
    }

     static void menu() {
            starLine(50, '*');
            System.out.println("\t Menu:");
            System.out.println("1. Minimum temperature for each day");
            System.out.println("2. Maximum temperature for each day");
            System.out.println("3. Average temperature for each day");
            System.out.println("4. Minimum temperature for the week");
            System.out.println("5. Maximum temperature for the week");
            System.out.println("6. Average temperature for the week");
            System.out.println("7. Minimum temperature for a user given day");
            System.out.println("8. Maximum temperature for a user given day");
            System.out.println("9. Average temperature for a user given day");
            System.out.println("0. Exit");
            starLine(50, '*');

            System.out.print("Enter your choice: ");
    }

    // Display temperature results for each day
    static void displayTemperatureResults(double[][] temperatures, String resultType, String day) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < days.length; i++) {
            double result = calculateResult(temperatures, i, resultType);
            System.out.println(days[i] + " - " + resultType + " temperature: " + result + "°C");
        }
    }

    // Display temperature results for the entire week
    static void displayTemperatureResultsForWeek(double[][] temperatures, String resultType) {
        double result = calculateResult(temperatures, -1, resultType);
        System.out.println(resultType + " temperature for the week : " + result + "°C");
    }

    // Calculate result based on the given type (minimum, maximum, or average)
    static double calculateResult(double[][] temperatures, int dayIndex, String type) {
    switch (type) {
        case "Minimum":
            return dayIndex == -1 ? findOverallMin(temperatures) : findDayMin(temperatures, dayIndex);
        case "Maximum":
            return dayIndex == -1 ? findOverallMax(temperatures) : findDayMax(temperatures, dayIndex);
        case "Average":
            return dayIndex == -1 ? findOverallAvg(temperatures) : findDayAvg(temperatures, dayIndex);
        default:
            throw new IllegalArgumentException("Invalid type: " + type);
        }
    }

    // Calculate minimum temperature for the entire week
    static double findOverallMin(double[][] temperatures) {
    for (int i = 0; i < temperatures.length; i++) {
        for (int j = 0; j < temperatures[i].length; j++) {
            if (temperatures[i][j] < min) {
                min = temperatures[i][j];
            }
        }
    }
    return min;
    }

    // Calculate maximum temperature for the entire week
    static double findOverallMax(double[][] temperatures) {
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = 0; j < temperatures[i].length; j++) {
                if (temperatures[i][j] > max) {
                    max = temperatures[i][j];
                }
            }
        }
        return max;
    }

    // Calculate average temperature for the entire week
    static double findOverallAvg(double[][] temperatures) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = 0; j < temperatures[i].length; j++) {
                sum += temperatures[i][j];
                count++;
            }
        }
        return sum / count;
    }

    // Calculate minimum temperature for a given day
    static double findDayMin(double[][] temperatures, int dayIndex) {
        for (int i = 0; i < temperatures.length; i++) {
            double temperature = temperatures[i][dayIndex];
            if (temperature < min) {
                min = temperature;
            }
        }
        return min;
    }

    // Calculate maximum temperature for a given day
    static double findDayMax(double[][] temperatures, int dayIndex) {
        for (int i = 0; i < temperatures.length; i++) {
            double temperature = temperatures[i][dayIndex];
            if (temperature > max) {
                max = temperature;
            }
        }
        return max;
    }       

    // Calculate average temperature for a given day
    static double findDayAvg(double[][] temperatures, int dayIndex) {
        double sum = 0;
        for (int i = 0; i < temperatures.length; i++) {
            sum += temperatures[i][dayIndex];
        }
        return sum / temperatures.length;
    }


    // Get user input for day and display corresponding result
    static void getTemperatureForGivenDay(double[][] temperatures, String resultType, Scanner scanner) {
        System.out.print("Enter the day (0 for Monday, 1 for Tuesday, ..., 6 for Sunday): ");
        int dayIndex = scanner.nextInt();
        if (dayIndex < 0 || dayIndex > 6) {
            System.out.println("There Is Only 7 Days, So Please Only Enter a Number Between 0 and 6.");
            return;
        }
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        double result = calculateResult(temperatures, dayIndex, resultType);
        System.out.println("For " + days[dayIndex] + ", " + resultType + " temperature : " + result + "°C");
    }
}
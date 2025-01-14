package Workshop8;

public class GradeCalculator {
    // Method to calculate average grade
    public double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return grades.length > 0 ? (double) sum / grades.length : 0.0;
    }

    // Main method for testing
    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();
        int[] grades = {85, 90, 78, 92, 88};
        System.out.println("Average grade: " + calculator.calculateAverage(grades));
    }
}



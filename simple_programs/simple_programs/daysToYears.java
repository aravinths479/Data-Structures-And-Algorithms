package simple_programs;

public class daysToYears {
    public static void main(String[] args) {
        int days = 700;
        int years = days / 365;
        int remaininDays = days % 365;
        int weeks = remaininDays / 7;
        int remaininDaysAfterWeeks = remaininDays % 7;
        System.out.println("Years: " + years + ", weeks: " + weeks + ", days: " + remaininDaysAfterWeeks);

    }
}

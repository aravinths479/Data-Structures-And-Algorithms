import java.util.Scanner;

interface Student {
    void getName();

    void getRollNo();

    void getCourse();
}

interface Marks {
    void getMarks();
}

interface Result {
    void calculateResult();
}

class StudentInfo implements Student {
    private String name;
    private int rollNo;
    private String course;

    @Override
    public void getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
    }

    @Override
    public void getRollNo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        rollNo = scanner.nextInt();
    }

    @Override
    public void getCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter course: ");
        course = scanner.nextLine();
    }

    public String getNameValue() {
        return name;
    }

    public int getRollNoValue() {
        return rollNo;
    }

    public String getCourseValue() {
        return course;
    }
}

class Exam implements Marks {
    private int[] internalMarks = new int[7];
    private int[] externalMarks = new int[7];

    @Override
    public void getMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects (Internal and External, out of 100):");
       
        System.out.print("Tamil (Internal): ");
        internalMarks[0] = scanner.nextInt();
        System.out.print("Tamil (External): ");
        externalMarks[0] = scanner.nextInt();

        System.out.print("English (Internal): ");
        internalMarks[1] = scanner.nextInt();
        System.out.print("English (External): ");
        externalMarks[1] = scanner.nextInt();

        System.out.print("Java Theory (Internal): ");
        internalMarks[2] = scanner.nextInt();
        System.out.print("Java Theory (External): ");
        externalMarks[2] = scanner.nextInt();

        System.out.print("Java Practical (Internal): ");
        internalMarks[3] = scanner.nextInt();
        System.out.print("Java Practical (External): ");
        externalMarks[3] = scanner.nextInt();

        System.out.print("MIS (Internal): ");
        internalMarks[4] = scanner.nextInt();
        System.out.print("MIS (External): ");
        externalMarks[4] = scanner.nextInt();
    }

    public int[] getInternalMarksValue() {
        return internalMarks;
    }

    public int[] getExternalMarksValue() {
        return externalMarks;
    }
}

class ResultCalculator implements Result {
    private int[] internalMarks;
    private int[] externalMarks;

    public ResultCalculator(int[] internalMarks, int[] externalMarks) {
        this.internalMarks = internalMarks;
        this.externalMarks = externalMarks;
    }

    @Override
    public void calculateResult() {
        System.out.println("Subject-wise Result:");

        for (int i = 0; i < 5; i++) {
            int totalMarks = internalMarks[i] + externalMarks[i];

            double percentage = (totalMarks / 200.0) * 100;

            if (percentage >= 35) {
                System.out.println("Subject " + (i + 1) + ": Pass");
            } else {
                System.out.println("Subject " + (i + 1) + ": Fail");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.getName();
        studentInfo.getRollNo();
        studentInfo.getCourse();

        Exam exam = new Exam();
        exam.getMarks();

        int[] internalMarks = exam.getInternalMarksValue();
        int[] externalMarks = exam.getExternalMarksValue();

        ResultCalculator resultCalculator = new ResultCalculator(internalMarks, externalMarks);
        resultCalculator.calculateResult();
    }
}

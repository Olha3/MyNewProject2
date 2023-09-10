package p2;

public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student(123, "Anna", "Ivanova", "Economics",
                5, 4, 4);
        Student student2 = new Student(124, "Anastasiya", "Petrova", "Economics",
                5, 5, 4);
        Student student3 = new Student(125, "Mariya", "Tkachenko", "Economics",
                3, 3, 4);

        double average1 = ((double) (student1.averageScoreInMathematics + student1.averageScoreInEconomics + student1.averageScoreInForeignLanguage) / 3);
        double average2 = ((double) (student2.averageScoreInMathematics + student2.averageScoreInEconomics + student2.averageScoreInForeignLanguage) / 3);
        double average3 = ((double) (student3.averageScoreInMathematics + student3.averageScoreInEconomics + student3.averageScoreInForeignLanguage) / 3);

        System.out.println("середня арифметична оцінка Anna Ivanova" + average1);
        System.out.println("середня арифметична оцінка Anastasiya Petrova" + average2);
        System.out.println("середня арифметична оцінка Mariya Tkachenko" + average3);
    }

}

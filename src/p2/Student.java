package p2;

public class Student {
    int id;
    String name;
    String surname;
    String course;
    int averageScoreInMathematics;
    int averageScoreInEconomics;
    int averageScoreInForeignLanguage;

    public Student(int id, String name, String surname, String course, int averageScoreInMathematics,
                   int averageScoreInEconomics, int averageScoreInForeignLanguage) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.averageScoreInMathematics = averageScoreInMathematics;
        this.averageScoreInEconomics = averageScoreInEconomics;
        this.averageScoreInForeignLanguage = averageScoreInForeignLanguage;

    }
}
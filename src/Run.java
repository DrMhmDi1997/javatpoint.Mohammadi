public class Run {

    public static void main(String[] args) {

        School school = new School();
        school.name = "Abbasion";
        school.id = "1";
        school.numberOfClasses = 10;

        System.out.println(school.name + " " + school.id + " " + "the classes number is " + school.numberOfClasses);
    }
}

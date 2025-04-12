public class TestProgram {
    public static void main(String[] args) {
        Library library = new Library();
        library.addResource(new Book("Introduction to Algorithms"));
        library.addResource(new Journal("Science Today"));
        library.addResource(new AudioBook("The Digital Age"));

        Student student = new Student(library);
        student.borrowResource("Introduction to Algorithms");
        student.borrowResource("Science Today");
        student.borrowResource("The Digital Age");
        student.borrowResource("Desert Flower");
    }
}
public class Journal implements LibraryResource {
    private final String title;

    public Journal(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void borrow() {
        System.out.println("Journal borrowed: " + title);
    }
}
public class Book implements LibraryResource {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void borrow() {
        System.out.println("Book borrowed: " + title);
    }
}
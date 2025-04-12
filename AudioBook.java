public class AudioBook implements LibraryResource {
    private final String title;

    public AudioBook(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void borrow() {
        System.out.println("Audio book borrowed: " + title);
    }
}
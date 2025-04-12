public class Student {
    private final ResourceManager resourceManager;

    public Student(ResourceManager resourceManager) {
        this.resourceManager = resourceManager;
    }

    public void borrowResource(String title) {
        LibraryResource resource = resourceManager.findResource(title);
        if (resource != null) {
            resource.borrow();
        } else {
            System.out.println("Resource not found: " + title);
        }
    }
}
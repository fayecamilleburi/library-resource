import java.util.*;

public class Library implements ResourceManager {
    private final List<LibraryResource> resources = new ArrayList<>();

    public void addResource(LibraryResource resource) {
        resources.add(resource);
    }

    @Override
    public LibraryResource findResource(String title) {
        for (LibraryResource resource : resources) {
            String resourceTitle = null;

            if (resource instanceof Book) {
                resourceTitle = ((Book) resource).getTitle();
            } else if (resource instanceof Journal) {
                resourceTitle = ((Journal) resource).getTitle();
            } else if (resource instanceof AudioBook) {
                resourceTitle = ((AudioBook) resource).getTitle();
            }

            if (title.equalsIgnoreCase(resourceTitle)) {
                return resource;
            }
        }

        return null;
    }
}
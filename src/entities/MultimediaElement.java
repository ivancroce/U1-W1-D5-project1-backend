package entities;

public abstract class MultimediaElement {
    // Attributes
    // protected: visible to this class and all the subclasses.
    protected String title;

    // Constructor
    public MultimediaElement(String title) {
        this.title = title;
    }

    // Getter
    public String getTitle() {
        return title;
    }
}

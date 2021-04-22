package structures;

public class Comment {
    private final int comentID;
    private final String text;
    private final int tag;

    public Comment(int comentID, String text, int tag) {
        this.comentID = comentID;
        this.text = text;
        this.tag = tag;
    }
}

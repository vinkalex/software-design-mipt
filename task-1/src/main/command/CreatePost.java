package command;

public class CreatePost implements Command{
    private final int postID;
    private final int profileID;
    private final String text;
    private final int image;

    public CreatePost(int postID, int profileID, String text, int image) {
        this.postID = postID;
        this.profileID = profileID;
        this.text = text;
        this.image = image;
    }
}

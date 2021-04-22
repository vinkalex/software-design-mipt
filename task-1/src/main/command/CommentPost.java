package command;

public class CommentPost implements Command{
    private final int commentID;
    private final int postID;
    private final String text;
    private final int tag;

    public CommentPost(int commentID, int postID, String text, int tag) {
        this.commentID = commentID;
        this.postID = postID;
        this.text = text;
        this.tag = tag;
    }
}

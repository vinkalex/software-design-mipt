package command;

public class LikeComment implements Command{
    private final int likeID;
    private final int commentID;
    private final boolean status;

    public LikeComment(int likeID, int commentID, boolean status) {
        this.likeID = likeID;
        this.commentID = commentID;
        this.status = status;
    }
}

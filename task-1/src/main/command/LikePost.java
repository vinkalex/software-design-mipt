package command;

public class LikePost implements Command{
    private final int likeID;
    private final int postID;
    private final boolean status;

    public LikePost(int likeID, int postID, boolean status) {
        this.likeID = likeID;
        this.postID = postID;
        this.status = status;
    }
}

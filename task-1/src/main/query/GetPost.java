package query;

public class GetPost implements Query{
    private final int profileID;
    private final int postID;

    public GetPost(int profileID, int postID) {
        this.postID = postID;
        this.profileID = profileID;
    }
}

package query;

public class GetLikesOnPost implements Query{
    private final int postID;

    // далее идем в бд и в табличке-связке поста с лайками делаем выборку по лайкам с заданным postID
    public GetLikesOnPost(int postID) {
        this.postID = postID;
    }
}

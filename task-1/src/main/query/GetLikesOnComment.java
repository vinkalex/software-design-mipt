package query;

public class GetLikesOnComment implements Query{
    private final int commentID;

    // далее идем в бд и в табличке-связке комментариев с лайками делаем выборку по лайкам
    // с заданным commentID
    public GetLikesOnComment(int commentID) {
        this.commentID = commentID;
    }
}

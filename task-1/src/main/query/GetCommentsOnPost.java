package query;

public class GetCommentsOnPost implements Query{
    private final int postID;

    // далее идем в бд и в табличке-связке поста с комментариями делаем выборку по комментариям
    // с заданным postID
    public GetCommentsOnPost(int postID) {
        this.postID = postID;
    }
}

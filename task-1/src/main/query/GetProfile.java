package query;

public class GetProfile implements Query{
    private final int profileID;

    public GetProfile(int profileID) {
        this.profileID = profileID;
    }
}

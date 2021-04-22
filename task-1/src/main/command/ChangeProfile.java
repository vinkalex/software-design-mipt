package command;

public class ChangeProfile implements Command{
    private final int profileID;
    private final String name;
    private final String login;
    private final String bio;

    public ChangeProfile(int profileID, String name, String login, String bio) {
        this.profileID = profileID;
        this.name = name;
        this.login = login;
        this.bio = bio;
    };
}

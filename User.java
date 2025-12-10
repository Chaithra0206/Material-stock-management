public class User extends BaseEntity {
    private int userRoleId;
    private String userName;
    private String userEmail;
    private String userDob;
    private String userAddress;

    public User() {}
    public User(int id, int userRoleId, String userName, String userEmail, String userDob, String userAddress) {
        super(id);
        this.userRoleId = userRoleId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userDob = userDob;
        this.userAddress = userAddress;
    }

    public int getUserRoleId() { return userRoleId; }
    public String getUserName() { return userName; }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + userName + "', email='" + userEmail + "', roleId=" + userRoleId + "}";
    }
}

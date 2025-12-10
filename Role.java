public class Role extends BaseEntity {
    private String roleTitle;
    private String roleDescription;

    public Role() {}
    public Role(int id, String roleTitle, String roleDescription) {
        super(id);
        this.roleTitle = roleTitle;
        this.roleDescription = roleDescription;
    }

    public String getRoleTitle() { return roleTitle; }
    public void setRoleTitle(String roleTitle) { this.roleTitle = roleTitle; }

    public String getRoleDescription() { return roleDescription; }
    public void setRoleDescription(String roleDescription) { this.roleDescription = roleDescription; }

    @Override
    public String toString() {
        return "Role{id=" + id + ", title='" + roleTitle + "', desc='" + roleDescription + "'}";
    }
}

public class Permission extends BaseEntity {
    private int permissionRoleId;
    private String permissionTitle;
    private String permissionModule;
    private String permissionDescription;

    public Permission() {}
    public Permission(int id, int permissionRoleId, String permissionTitle, String permissionModule, String permissionDescription) {
        super(id);
        this.permissionRoleId = permissionRoleId;
        this.permissionTitle = permissionTitle;
        this.permissionModule = permissionModule;
        this.permissionDescription = permissionDescription;
    }

    public int getPermissionRoleId() { return permissionRoleId; }
    public String getPermissionTitle() { return permissionTitle; }
    public String getPermissionModule() { return permissionModule; }
    public String getPermissionDescription() { return permissionDescription; }

    @Override
    public String toString() {
        return "Permission{id=" + id + ", roleId=" + permissionRoleId + ", title='" + permissionTitle + "', module='" + permissionModule + "'}";
    }
}

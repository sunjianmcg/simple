package tk.mybatis.simple.model;

public class SysPrivilege {
    private Long privilegeId;
    private String privilegeName;
    private String getPrivilegeUrl;

    public Long getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public String getGetPrivilegeUrl() {
        return getPrivilegeUrl;
    }

    public void setGetPrivilegeUrl(String getPrivilegeUrl) {
        this.getPrivilegeUrl = getPrivilegeUrl;
    }
}

package com.john.spring.response;

public class Permission {

    private String permissionId;

    public String getPermissionId() {
        return permissionId;
    }

    public Permission() {
    }

    public Permission(String permissionId) {
        this.permissionId = permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }
}

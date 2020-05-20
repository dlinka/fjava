package com.cr.annotation;

@ClassAnnotation(description = "类:User")
public class User {

    @FieldAnnotation(description = "属性:uid")
    private int uid;
    private String username;

    @MethodAnnotation(description = "方法:getUid")
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @MethodAnnotation(description = "方法:getUsername")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

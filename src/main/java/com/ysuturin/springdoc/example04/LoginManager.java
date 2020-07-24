package com.ysuturin.springdoc.example04;

public class LoginManager {
    UserDirectory userDirectory;

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    @Override
    public String toString() {
        return "LoginManager{" +
                "userDirectory=" + userDirectory +
                '}';
    }
}

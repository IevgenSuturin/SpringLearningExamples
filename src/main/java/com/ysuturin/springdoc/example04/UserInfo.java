package com.ysuturin.springdoc.example04;

public class UserInfo {
    LDAPUserDirectory ldapUserDirectory;

    public LDAPUserDirectory getLdapUserDirectory() {
        return ldapUserDirectory;
    }

    public void setLdapUserDirectory(LDAPUserDirectory ldapUserDirectory) {
        this.ldapUserDirectory = ldapUserDirectory;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "ldapUserDirectory=" + ldapUserDirectory +
                '}';
    }
}

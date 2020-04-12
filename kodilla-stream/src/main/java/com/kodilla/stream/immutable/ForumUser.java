package com.kodilla.stream.immutable;

public final class ForumUser {
    private final String usermame;
    private final String realName;
    int a;

    public ForumUser(final String usermame, final String realName) {
        this.usermame = usermame;
        this.realName = realName;
    }

    public String getUsermame() {
        return usermame;
    }

    public String getRealName() {
        return realName;
    }
}

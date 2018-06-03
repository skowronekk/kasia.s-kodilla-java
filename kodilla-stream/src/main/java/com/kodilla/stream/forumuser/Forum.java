package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1021, "Jan Kowalski ", 'M', 2,
                2000 , 12 , 9));
        theForumUserList.add(new ForumUser(1034 , "Joe Black ", 'M', 23,
                1990 , 7 , 29));
        theForumUserList.add(new ForumUser(1018, "Victoria White ", 'F', 0,
                1992 , 5 , 24));
        theForumUserList.add(new ForumUser(1078 , "Maria Stewart ", 'F', 6,
                1988 , 11 , 9));
        theForumUserList.add(new ForumUser(1011 , "James Yellow ", 'M', 5,
                2002 , 9 , 7));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);

    }
}

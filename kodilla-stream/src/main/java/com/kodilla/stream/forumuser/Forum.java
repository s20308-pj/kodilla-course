package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(1, "Janusz", 'M', LocalDate.of(1990, 1, 1), 0));
        forumUsersList.add(new ForumUser(2, "Aldona", 'F', LocalDate.of(1999, 2, 2), 10));
        forumUsersList.add(new ForumUser(3, "Marian", 'M', LocalDate.of(2001, 3, 3), 4));
        forumUsersList.add(new ForumUser(4, "Marianna", 'F', LocalDate.of(2003, 4, 4), 5));
    }

    public List<ForumUser> getForumUsersList() {
        return forumUsersList;
    }
}

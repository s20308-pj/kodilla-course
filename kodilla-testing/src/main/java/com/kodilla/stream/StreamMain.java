package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
//        String text = "Ala ma kota";
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//
//        poemBeautifier.beautify(text, (t) -> System.out.println(t.toUpperCase()));
//        poemBeautifier.beautify(text, (t) -> System.out.println(t.toLowerCase()));
//        poemBeautifier.beautify(text, (t) -> System.out.println(t + " ABC"));
//        poemBeautifier.beautify(text, (t) -> {
//            for (int i = 0; i < t.length(); i++) {
//                if (i % 2 != 0) {
//                    System.out.print(t.toLowerCase(Locale.ROOT).charAt(i) + " ");
//                } else {
//                    System.out.print(t.toUpperCase(Locale.ROOT).charAt(i) + " ");
//                }
//            }
//            System.out.println();
//        });
//
//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n", "<<", ">>"));                    // [2]
//
//        System.out.println(theResultStringOfBooks);

        Forum forum = new Forum();

        System.out.println("men: ");
        forum.getForumUsersList().stream()
                .filter(forumUser -> forumUser
                        .getSex() == 'M')
                .forEach(System.out::println);

        System.out.println("older than 20: ");
        forum.getForumUsersList().stream()
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() < 2002)
                .forEach(System.out::println);

        System.out.println("published more than one post: ");
        forum.getForumUsersList().stream()
                .filter(forumUser -> forumUser.getNumberOdPublishedPosts() > 1)
                .forEach(System.out::println);

        System.out.println("Forum user map:");
        Map<Integer, ForumUser> forumUserMap = forum.getForumUsersList().stream()
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        forumUserMap.forEach((key, value) -> System.out.println("key: <<" + key + ">> Value: " + value));
    }
}



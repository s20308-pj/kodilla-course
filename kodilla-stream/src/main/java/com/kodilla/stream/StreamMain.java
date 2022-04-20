package com.kodilla.stream;

import com.kodilla.stream.array.ArrayOperations;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

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

//        Forum forum = new Forum();

//        Map<Integer, ForumUser> forumUserMap = forum.getForumUsersList().stream()
//                .filter(forumUser -> forumUser.getSex() == 'M')
//                .filter(forumUser -> forumUser.getDateOfBirth().getYear() < 2002)
//                .filter(forumUser -> forumUser.getNumberOdPublishedPosts() > 1)
//                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));
//
//        forumUserMap.forEach((key, value) -> System.out.println("key: <<" + key + ">> Value: " + value));


    }
}



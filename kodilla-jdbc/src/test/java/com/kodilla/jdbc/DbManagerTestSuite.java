package com.kodilla.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    void testConnection() {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter ++;
        }
        rs.close();
        statement.close();
        Assertions.assertEquals(5,counter);
    }
    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT FIRSTNAME, LASTNAME, COUNT(USER_ID) AS NUMBER_PUBLISHED_POSTS " +
                "FROM USERS U JOIN POSTS P on U.ID = P.USER_ID " +
                "GROUP BY USER_ID " +
                "HAVING NUMBER_PUBLISHED_POSTS > 1";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME") + ", " +
                    rs.getString("NUMBER_PUBLISHED_POSTS"));
            counter ++;
        }
        rs.close();
        statement.close();
        Assertions.assertEquals(2,counter);
    }

}

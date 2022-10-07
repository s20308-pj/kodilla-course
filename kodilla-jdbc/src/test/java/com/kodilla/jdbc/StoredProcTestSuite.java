package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {

        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL='Not set'";

        // When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);

        // Then
        int howMany = -1;
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
        rs.close();
        statement.close();
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {

        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER=false";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckHowManyRents = "SELECT COUNT(*) AS HOW_MANY_RENTS FROM RENTS";
        String sqlCheckHowManyBooksWasRents = "SELECT COUNT(DISTINCT READER_ID) AS HOW_MANY_BOOKS FROM RENTS";
        String sqlCheckHowManyBestsellers = "Select COUNT(BESTSELLER) AS HOW_MANY_BESTSELLERS FROM BOOKS WHERE BOOKS.BESTSELLER = TRUE";
        String sqlProcedureCall = "CALL UpdateBestsellers()";

        //When
        statement.execute(sqlProcedureCall);

        //Then
        int howManyRents = -1;
        int howManyBooks = -1;
        int howManyBestsellers = -1;

        ResultSet rsRents = statement.executeQuery(sqlCheckHowManyRents);
        if(rsRents.next()) howManyRents = rsRents.getInt("HOW_MANY_RENTS");

        ResultSet rsBooks = statement.executeQuery(sqlCheckHowManyBooksWasRents);
        if(rsBooks.next()) howManyBooks = rsBooks.getInt("HOW_MANY_BOOKS");

        ResultSet rsBestsellers = statement.executeQuery(sqlCheckHowManyBestsellers);
        if(rsBestsellers.next()) howManyBestsellers = rsBestsellers.getInt("HOW_MANY_BESTSELLERS");

        if (howManyRents == howManyBooks) {
            assertEquals(0, howManyBestsellers);
        } else {
            assertNotEquals(0,howManyBestsellers);
        }
        rsRents.close();
        rsBooks.close();
        rsBestsellers.close();
        statement.close();
    }
}


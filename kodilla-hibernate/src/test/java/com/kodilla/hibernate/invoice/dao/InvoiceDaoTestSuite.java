package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("1234");
        Item item1 = new Item(new BigDecimal(20), 20);
        Item item2 = new Item(new BigDecimal(30), 40);
        Item item3 = new Item(new BigDecimal(15), 10);
        Product product1 = new Product("test product 1");
        Product product2 = new Product("test product 2");
        product1.addItem(item1);
        product1.addItem(item2);
        product2.addItem(item3);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        //Then
        Assertions.assertNotEquals(0,id);

        //CleanUp
//        invoiceDao.deleteById(id);

    }
}

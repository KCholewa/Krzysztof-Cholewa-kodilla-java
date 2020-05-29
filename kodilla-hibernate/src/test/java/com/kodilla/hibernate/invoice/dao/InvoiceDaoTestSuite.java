package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Autowired
    ProductDao productDao;

    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product product1 = new Product("Shoes");
        Product product2 = new Product("Jacket");
        Product product3 = new Product("Hat");

        Invoice invoice1 = new Invoice("001");
        Invoice invoice2 = new Invoice("002");

        Item item1 = new Item(product1, new BigDecimal(100), 2, new BigDecimal(70), invoice1);
        item1.addInvoiceAndProduct();

        Item item2 = new Item(product2, new BigDecimal(200), 2, new BigDecimal(170), invoice1);
        item2.addInvoiceAndProduct();

        Item item3= new Item(product3, new BigDecimal(300), 2, new BigDecimal(170), invoice1);
        item3.addInvoiceAndProduct();

        Item item4 = new Item(product1, new BigDecimal(500), 2, new BigDecimal(200), invoice2);
        item4.addInvoiceAndProduct();

        Item item5 = new Item(product2, new BigDecimal(700), 2, new BigDecimal(555), invoice2);
        item5.addInvoiceAndProduct();


        //When
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);
        itemDao.save(item5);

        //Then
        Assert.assertEquals(3, invoice1.getItems().size());
        Assert.assertEquals(2, invoice2.getItems().size());
        Assert.assertEquals(2, product1.getItems().size());
        Assert.assertEquals(2, product2.getItems().size());
        Assert.assertEquals(1, product3.getItems().size());

        //Clean
        itemDao.deleteAll();
        invoiceDao.deleteAll();
        productDao.deleteAll();
    }
}

package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    private String PEN = "Pen";
    private String RUBBER = "Rubber";
    private String HIGHLIGHTER = "Highlighter";

    @Test
    public void testInvoiceDaoSave() {

        //given

        itemDao.deleteAll();
        Invoice invoice = new Invoice();
        Product product1 = new Product(PEN);
        Product product2 = new Product(RUBBER);
        Product product3 = new Product(HIGHLIGHTER);

        Item item1 = new Item(new BigDecimal(11), 25);
        Item item2 = new Item(new BigDecimal(12), 40);
        Item item3 = new Item(new BigDecimal(4), 25);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //when
        itemDao.save(item1);
        int item1Id = item1.getId();
        itemDao.save(item2);
        int item2Id = item2.getId();
        itemDao.save(item3);
        int item3Id = item3.getId();
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        invoiceDao.findById(invoiceId).get().getItems().size();
        Optional<Invoice> all = invoiceDao.findById(invoiceId);

       int cc=  all.get().getItems().size();

        //athen
        assertEquals(3,cc);

        //CleanUp
        invoiceDao.deleteById(invoiceId);


    }
}

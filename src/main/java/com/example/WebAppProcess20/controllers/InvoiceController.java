package com.example.WebAppProcess20.controllers;

/*
 * Created by Amit Nissan on 16/7/2018
 */

import com.example.WebAppProcess20.Repositories.InvoiceRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InvoiceController {
    private InvoiceRepository invoiceRepository;

    public InvoiceController(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @RequestMapping("/invoices")
    // Mapping web requests to invoices list, "direction" to the invoices' list
    public String getInvoices(Model model){
        model.addAttribute("invoices", invoiceRepository.findAll());
        return "invoices";
    }
}

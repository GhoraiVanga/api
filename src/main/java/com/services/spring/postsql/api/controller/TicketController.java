package com.services.spring.postsql.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.TicketService;

import com.services.spring.postsql.api.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketController
{

	@Autowired
	private TicketService service;
	
	
	@GetMapping("/all")
	public List<Ticket> a()
	{
		return service.geTickets();
	}
	 @PostMapping("/addProduct")
	    public Ticket addProduct(@RequestBody Ticket ticket) {
	        return service.saveProduct(ticket);
	    }

	    @PostMapping("/addProducts")
	    public List<Ticket> addProducts(@RequestBody List<Ticket> products) {
	        return service.saveProducts(products);
	    }

	    @GetMapping("/products")
	    public List<Ticket> findAllProducts() {
	        return service.getProducts();
	    }

	    @GetMapping("/productById/{id}")
	    public Ticket findProductById(@PathVariable int id) {
	        return service.getProductById(id);
	    }

	    @GetMapping("/product/{name}")
	    public Ticket findProductByName(@PathVariable String name) {
	        return service.getProductByName(name);
	    }

	    @PutMapping("/update")
	    public Ticket updateProduct(@RequestBody Ticket product) {
	        return service.updateProduct(product);
	    }

	    @DeleteMapping("/delete/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return service.deleteProduct(id);
	
}
}

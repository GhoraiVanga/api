package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.services.spring.postsql.api.dao.Ticketdao;
import com.services.spring.postsql.api.model.Ticket;

@Service
public class TicketService
{
	@Autowired
	private Ticketdao dao;
	
	
	
	public List<Ticket> geTickets()
	{
		return (List<Ticket>) dao.findAll();
	}
	
	
	 public Ticket saveProduct(Ticket ticket) {
	        return dao.save(ticket);
	    }

	    public List<Ticket> saveProducts(List<Ticket> tickets) {
	        return (List<Ticket>) dao.saveAll(tickets);
	    }

	    public List<Ticket> getProducts() {
	        return (List<Ticket>) dao.findAll();
	    }

	    public Ticket getProductById(int id) {
	        return dao.findById(id).orElse(null);
	    }

	    public Ticket getProductByName(String name) {
	        return dao.findByName(name);
	    }

	    public String deleteProduct(int id) {
	        dao.deleteById(id);
	        return "product removed !! " + id;
	    }

	    public Ticket updateProduct(Ticket product) {
	    	Ticket existingProduct = dao.findById(product.getId()).orElse(null);
	        existingProduct.setName(product.getName());
	        existingProduct.setMobile(product.getMobile());
	        
	        return dao.save(existingProduct);
	    }
}

package com.services.spring.postsql.api.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.services.spring.postsql.api.model.Ticket;

public interface Ticketdao extends CrudRepository<Ticket, Integer> 
{

	Ticket findByName(String name);

	
}

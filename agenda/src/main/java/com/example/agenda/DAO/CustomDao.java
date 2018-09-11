package com.example.agenda.DAO;

import java.util.List;

import com.example.agenda.pojos.*;

public interface CustomDao {

	List<Personas> getFirstNamesLike(String username);
	
}

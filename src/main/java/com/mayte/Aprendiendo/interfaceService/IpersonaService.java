package com.mayte.Aprendiendo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.mayte.Aprendiendo.models.person;

public interface IpersonaService {
	public List<person>listar();
	public Optional<person>listarId(Long id);
	public int save(person p);
	public void delete(Long id);		
}

package com.example.app.crud.Controlador;

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

import com.example.app.crud.Repository.InterfaceUser;
import com.example.app.crud.Entity.*;

@RestController
@RequestMapping("/User")
public class UserControlador {

	@Autowired
	private InterfaceUser interfaceUser;
	
	@GetMapping
	public List<User> usuarios()
	{
		return (List<User>) interfaceUser.findAll();
	}
	@PostMapping
	public void insertar(@RequestBody User usuario)
	{
		interfaceUser.save(usuario);
	}
	@PutMapping 
	public void modificar(@RequestBody User usuario)
	{
		interfaceUser.save(usuario);
	}
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Integer id)
	{
		interfaceUser.deleteById(id);
	}
}
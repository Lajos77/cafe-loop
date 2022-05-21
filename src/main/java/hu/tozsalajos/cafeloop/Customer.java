package hu.tozsalajos.cafeloop;

import lombok.Data;

@Data
public class Customer {

	private int id;
	private String name;
	private String email;
	private String password;
	private String salt;
	// TODO hozzájárulások
}
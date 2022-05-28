package hu.tozsalajos.cafeloop.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	private int id;
	private String name;
	private String email;
	private String password;
	private String salt;
	// TODO hozzájárulások
	
	
	
	
	
	
	
	
}
package hu.tozsalajos.cafeloop.bo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class SubscriptionItem {

	private int id;
	private Product product;
	private int quantity;
	private Subscription subscription;
	
}

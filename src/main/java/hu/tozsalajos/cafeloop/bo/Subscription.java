package hu.tozsalajos.cafeloop.bo;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor

@Data
public class Subscription {

	private int id;
	private Customer customer;
	private LocalDate subscriptionDate;
	private Frequency frequency;
	private String adress;
	private List<SubscriptionItem> item;

}

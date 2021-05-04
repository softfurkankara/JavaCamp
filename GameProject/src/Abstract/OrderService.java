package Abstract;

import Entities.Campaing;
import Entities.Customer;
import Entities.Game;

public interface OrderService {
	void buyGame(Customer customer,Game game);
	void discountBuyGame(Customer customer,Game game,Campaing campaign);
}

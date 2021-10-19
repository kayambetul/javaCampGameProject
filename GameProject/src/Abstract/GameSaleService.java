package Abstract;

import Entities.Game;
import Entities.GameUser;
import Entities.Offer;

// Oyun satýþý yapýlabilecek satýþ ortamýný
public interface GameSaleService {
	
	void sale(GameUser gameUser ,Game game,Offer offer);

}

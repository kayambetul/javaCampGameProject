package Abstract;

import Entities.Game;
import Entities.GameUser;
import Entities.Offer;

// Oyun sat��� yap�labilecek sat�� ortam�n�
public interface GameSaleService {
	
	void sale(GameUser gameUser ,Game game,Offer offer);

}

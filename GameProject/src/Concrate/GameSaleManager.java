package Concrate;

import Abstract.GameSaleService;
import Entities.Game;
import Entities.GameUser;
import Entities.Offer;

public class GameSaleManager implements GameSaleService{

	@Override
	public void sale(GameUser gameUser, Game game, Offer offer) {
		System.out.println(gameUser.getFirstName()+ " adl� kullan�c� " + game.getGameName() + " isimli oyunu " +
	offer.getOfferName() + " isimli kampanyadan %" + offer.getOfferDiscount()+ " indirimle alm��t�r.");
		
	}

}

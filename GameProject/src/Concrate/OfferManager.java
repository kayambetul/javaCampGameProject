package Concrate;

import Abstract.OfferService;
import Entities.Offer;

public class OfferManager implements OfferService {

	@Override
	public void add(Offer offer) {
		System.out.println("Kampanyalı oyun eklendi. "+ offer.getOfferName());
		
	}

	@Override
	public void delete(Offer offer) {
		System.out.println("kampanyalı oyun silindi "+offer.getOfferName());
		
	}

	@Override
	public void uptade(Offer offer) {
		System.out.println("Kampanyalı oyun güncellendi "+offer.getOfferName());
		
	}

}

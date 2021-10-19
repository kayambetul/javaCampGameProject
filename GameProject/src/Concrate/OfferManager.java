package Concrate;

import Abstract.OfferService;
import Entities.Offer;

public class OfferManager implements OfferService {

	@Override
	public void add(Offer offer) {
		System.out.println("Kampanyalý oyun eklendi. "+ offer.getOfferName());
		
	}

	@Override
	public void delete(Offer offer) {
		System.out.println("kampanyalý oyun silindi "+offer.getOfferName());
		
	}

	@Override
	public void uptade(Offer offer) {
		System.out.println("Kampanyalý oyun güncellendi "+offer.getOfferName());
		
	}

}

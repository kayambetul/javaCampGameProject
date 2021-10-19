package Concrate;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Yeni oyun eklendi "+game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi. "+game.getGameName());
		
	}

	@Override
	public void uptade(Game game) {
		System.out.println("Oyun güncellendi. "+game.getGameName());
		
	}

}

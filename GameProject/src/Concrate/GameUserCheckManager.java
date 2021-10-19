package Concrate;

import Abstract.GameUserCheckService;
import Entities.GameUser;

public class GameUserCheckManager implements GameUserCheckService{

	@Override
	public boolean CheckIfRealPerson(GameUser gameUser) {
		
		return true;
	}

}

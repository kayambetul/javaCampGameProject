package Concrate;

import Abstract.GameUserCheckService;
import Abstract.GameUserService;
import Entities.GameUser;

public class GameUserManage implements GameUserService{

     GameUserCheckService gameUserCheckService;
	
	public GameUserManage(GameUserCheckService gameUserCheckService){
		this.gameUserCheckService=gameUserCheckService;
	}
	@Override
	public void add(GameUser gameUser) {
		//System.out.println("Oyuncu eklendi. "+ gameUser.getFirstName());
		if(gameUserCheckService.CheckIfRealPerson(gameUser)) {
			System.out.println(gameUser.getFirstName() + " adlı oyuncu kaydedildi. ");
		}
		else
		{
			System.out.println(gameUser.getFirstName() + " 'adlı oyuncunun kaydı başarısız oldu.");
		}
		
	}

	@Override
	public void delete(GameUser gameUser) {
		System.out.println("Oyuncu silindi" + gameUser.getFirstName());
		
	}

	@Override
	public void uptade(GameUser gameUser) {
		System.out.println("Oyuncu bilgileri güncellendi. "+gameUser.getFirstName());
		
	}

}

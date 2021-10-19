import Adapter.MernisServiceAdapter;
import Concrate.GameManager;
import Concrate.GameSaleManager;
import Concrate.GameUserManage;
import Entities.Game;
import Entities.GameUser;
import Entities.Offer;

public class Main {

	public static void main(String[] args) {
		
		GameUser gameUser=new GameUser(1,"Ümmü Betül","Kayam",1995,"1234567890");
		GameUserManage userManager=new GameUserManage(new MernisServiceAdapter());
		userManager.add(gameUser);
		
		Game game=new Game (2,"Oyun1",12.50);
		Offer offer=new Offer(3,"OyunKampanyasý",50.0,10);
		
		GameSaleManager gameSale=new GameSaleManager();
		gameSale.sale(gameUser, game, offer);
		
		GameManager gameManager=new GameManager();
		gameManager.add(game);
		
		
		

	}

}

package Adapter;

import java.rmi.RemoteException;
import java.util.Locale;

import Abstract.GameUserCheckService;
import Entities.GameUser;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter  implements GameUserCheckService{

	
	@Override
	public boolean CheckIfRealPerson(GameUser gameUser) {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		
		boolean result=true;
		try {
			result =client.TCKimlikNoDogrula(Long.parseLong(gameUser.getNationalityId()), gameUser.getFirstName().toUpperCase(new Locale("tr")),
						gameUser.getLastName().toUpperCase(new Locale("tr")), gameUser.getDateOfBirth());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
		
	}
}



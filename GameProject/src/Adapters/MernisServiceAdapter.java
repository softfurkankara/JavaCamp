package Adapters;

import java.rmi.RemoteException;

import Abstract.UserValidationService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements UserValidationService {

	@Override
	public boolean validate(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy=new KPSPublicSoapProxy();
		boolean result=true;
		try {
			result=kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationlityId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getBirthOfYear());
		}
		catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}

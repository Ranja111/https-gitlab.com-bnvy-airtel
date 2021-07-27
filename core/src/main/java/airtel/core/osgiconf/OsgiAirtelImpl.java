package airtel.core.osgiconf;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

@Component(immediate=true)
@Designate(ocd=OsgiAirtel.class)
public class OsgiAirtelImpl {

@Activate
public void activate(OsgiAirtel osgiAirtel){
	
String title=osgiAirtel.Title();
String dropdown= osgiAirtel.dropdown();
Boolean user= osgiAirtel.user();
	
	
}

}

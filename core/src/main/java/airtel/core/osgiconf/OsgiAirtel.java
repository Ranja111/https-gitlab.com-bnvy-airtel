package airtel.core.osgiconf;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.Option;

@ObjectClassDefinition(name="Demo", description="DemoConfiguration details")
public @interface OsgiAirtel {
	
	@AttributeDefinition(name="title", description="title information")
	public String Title();
	
	@AttributeDefinition(name="protocal",description="protocal details",
			options={ @Option(label="http",value="httpinfo") ,
					  @Option(label="https",value="httpsinfo")	
					
					
					
			})
	public String dropdown();
	
	@AttributeDefinition(name="userchecklist", description="user checklist info")
	public  boolean user();
	
	

}

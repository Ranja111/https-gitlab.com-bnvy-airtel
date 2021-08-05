package airtel.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class ExpertDetailsModel {

	@Inject
	private String heading;
	
	@Inject
	private String image;
	
	@Inject
	private String alternate;
	
	@Inject
	private String subheading;
	
	@Inject
	private String description;
	
	@Inject
	private String mailicon;
	
	@Inject
	private String alternatemailicon;

	public String getHeading() {
		return heading;
	}

	public String getImage() {
		return image;
	}

	public String getAlternate() {
		return alternate;
	}

	public String getSubheading() {
		return subheading;
	}

	public String getDescription() {
		return description;
	}

	public String getMailicon() {
		return mailicon;
	}

	public String getAlternatemailicon() {
		return alternatemailicon;
	}
	
	
	
	
     
     
     
     
     
     
	
	
}

package airtel.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ImageType {

	
	
	@Inject
private String imagefile;
	
	@Inject
	private String alternate;
	
    @Inject
	private String description;
	
	public String getDescription() {
		return description;
	}

	public String getAlternate() {
		return alternate;
	}

	public String getImagefile() {
		return imagefile;
	}
}

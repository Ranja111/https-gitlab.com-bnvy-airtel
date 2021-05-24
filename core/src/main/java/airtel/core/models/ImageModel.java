package airtel.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ImageModel {
	
	
	@Inject
	private String fileReference;
	
	@Inject
	private String alternate;
	
	@Inject
	private String description;

	public String getAlternate() {
		return alternate;
	}

	public String getFileReference() {
		return fileReference;
	}

	public String getDescription() {
		return description;
	}
	
	

}

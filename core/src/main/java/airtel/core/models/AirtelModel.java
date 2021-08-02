package airtel.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class)
public class AirtelModel {

	
	@Inject
	private String text;
	@Inject
	private String textarea;

	public String getTextarea() {
		return textarea;
	}

	public String getText() {
		return text;
	}
	
}

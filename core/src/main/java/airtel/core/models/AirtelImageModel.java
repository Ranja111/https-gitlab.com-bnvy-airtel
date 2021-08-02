package airtel.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class)
public class AirtelImageModel {
	
	@Inject
	private String text;
	@Inject
    private String des;
	@Inject
    private String image;
	@Inject
    private String alternate;
	@Inject
    private String path;
    

	public String getText() {
		return text;
	}
	public String getDes() {
		return des;
	}
	public String getImage() {
		return image;
	}
	public String getAlternate() {
		return alternate;
	}
	public String getPath() {
		return path;
	}
	
}

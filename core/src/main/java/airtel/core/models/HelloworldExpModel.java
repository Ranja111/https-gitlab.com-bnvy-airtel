package airtel.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class HelloworldExpModel {
	
	@Inject  @Named("text")
	private String title;
    
	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}

	@Inject @Default(values="firstname")
	private String name;
	
	private String message;
	
	public String getMessage() {
		return message;
	}

	@PostConstruct
	private void init()
	{
		message="hello";
	}
}

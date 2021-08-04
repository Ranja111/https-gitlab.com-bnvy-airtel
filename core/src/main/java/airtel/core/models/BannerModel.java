package airtel.core.models;


import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.RequestAttribute;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.day.cq.wcm.api.Page;

@Model(adaptables ={Resource.class,SlingHttpServletRequest.class},defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class BannerModel {
	Logger log=LoggerFactory.getLogger(BannerModel.class);

	@Inject @Named("jcr:text")@Via("resource")
	private String text;
	
	@Inject @Via("resource")
	private String des;
	
	@ValueMapValue(via="resource")
	private String image;
	
	private String message;
	
	@ScriptVariable
    private Page currentPage;
	
	private String pageProperts;
	
	@PostConstruct
	private void init()
	{
		message="by default init method will be execute";
		pageProperts=currentPage.getName();
		
	}
	
	@Inject @Default(values="ddd")@Via("resource")
	private String alternate;
	
	@RequestAttribute
	private String param;

	public String getText() {
		log.info("this is text method "+text);
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

	public String getMessage() {
		return message;
	}

	public String getPageProperts() {
		return pageProperts;
	}

	public String getParam() {
		return param;
	}
	
	
	
	
	

}

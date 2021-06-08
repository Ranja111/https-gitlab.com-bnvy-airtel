package airtel.core.models;

import javax.annotation.PostConstruct;
import javax.jcr.Node;
import javax.jcr.PathNotFoundException;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.ValueFormatException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

@Model(adaptables={Resource.class,SlingHttpServletRequest.class},defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class BannerModel {

	@SlingObject
	Resource resource;
	@SlingObject
	ResourceResolver resourceResolver;
	
	private String text;
	private String title;
	
	@PostConstruct
	public void init() throws ValueFormatException, PathNotFoundException, RepositoryException{
		
	Node node=resource.adaptTo(Node.class);
   text= node.getProperty("text").getString();
      title= node.getProperty("name").getString();
  //jcr api    
  Session session=resourceResolver.adaptTo(Session.class);
  if(node!=null){
	  
	 Node airtelNode= node.addNode("airtel");
	 airtelNode.setProperty("one", "oneplus");
	 airtelNode.setProperty("two", "twoPlus");
	 
	 session.save();
  }
   
	
		
	}

	public String getText() {
		return text;
	}

	public String getTitle() {
		return title;
	}
	
}

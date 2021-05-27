package airtel.core.models;

import javax.annotation.PostConstruct;
import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.jcr.Session;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.RequestAttribute;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables={Resource.class,SlingHttpServletRequest.class},defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class FecthproperitesModel {
	Logger log=LoggerFactory.getLogger(FecthproperitesModel.class);

	@SlingObject
	Resource resource;
	
	@SlingObject
	ResourceResolver resourceResolver;
	
	@RequestAttribute
	private String param;
	
	private String text;
	private String stype;
	private String name;
	
	
	@PostConstruct
	public void init() throws RepositoryException{
		
		
	Node node=resource.adaptTo(Node.class);
	Session session=resourceResolver.adaptTo(Session.class);
	log.debug("node::::::::"+node.getPath()+" name::::::::"+node.getName());
	  text= node.getProperty("text").getString();
	    stype =node.getProperty("sling:resourceType").getString();
	    name=node.getProperty("name").getString();
	    
	    if(node!=null)
	    {
	    	Node airtelNode=node.addNode("airtel");
	    	airtelNode.setProperty("aem", "aemcourse");
	    	airtelNode.setProperty("siva", "sankar");
	    }
	    session.save();
	
	  
	 
		
	}

	public String getText() {
		return text;
	}

	public String getStype() {
		return stype;
	}

	public String getName() {
		return name;
	}

	public String getParam() {
		return param;
	}
	
}

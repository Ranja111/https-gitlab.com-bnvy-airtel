package airtel.core.models;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.jcr.Node;
import javax.jcr.NodeIterator;
import javax.jcr.RepositoryException;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables=Resource.class,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class AirtelMutliModel {

	@ChildResource(name="airtelMulti")
	Resource airtel;
	private List<AirteldetailPojo> listInfo=new ArrayList<AirteldetailPojo>();
	
	@PostConstruct
	private void init() throws RepositoryException
	{
	
		Node node=airtel.adaptTo(Node.class);
		NodeIterator nodeitr=node.getNodes();
		while(nodeitr.hasNext())
		{
			String title;
			String description;
			String image;
			Node finalNode=nodeitr.nextNode();
			title=finalNode.getProperty("title").getString();
			description =finalNode.getProperty("description").getString();
			image=finalNode.getProperty("img").getString();
			
			AirteldetailPojo airtelInfo=new AirteldetailPojo();
			airtelInfo.setTitle(title);
			airtelInfo.setDescription(description);
			airtelInfo.setImg(image);
			listInfo.add(airtelInfo);
			
			
		}
		
		
	}

	public List<AirteldetailPojo> getListInfo() {
		return listInfo;
	}
	
	
	
}

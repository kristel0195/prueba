package javamon.utils.communication;

import javamon.utils.communication.components.NintengoPlatform;
import javamon.utils.communication.components.factory.NintengoPlatformFactory;
import javamon.utils.enums.NintengoPlatformType;
import javamon.utils.interfaces.SerializeToXml;

public class CommunicationManager {
    
    public void SendJavamon(SerializeToXml pJavamon,
    						NintengoPlatformType target){
    	
    	NintengoPlatform communicationComponent = 
    			NintengoPlatformFactory.CreatePlatformCommunicationComponent(target);
    	
    	communicationComponent.sendJavamon(pJavamon.toXML());
    }
}


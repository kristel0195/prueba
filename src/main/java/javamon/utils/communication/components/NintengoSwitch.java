package javamon.utils.communication.components;

public class NintengoSwitch extends NintengoPlatform{
	@Override
	public void sendJavamon(String pJavamonXmlString){
        System.out.println("Opening connection to Switch...");
        System.out.println(pJavamonXmlString);
        System.out.println("Javamon received...");
        System.out.println("Connection closed.");
    }
}

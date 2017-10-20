package javamon.utils.communication.components;

public class NintengoClassic extends NintengoPlatform{
	@Override
    public void sendJavamon(String pJavamonXmlString){
        System.out.println("Opening connection...");
        System.out.println(pJavamonXmlString);
        System.out.println("Javamon received...");
        System.out.println("Connection closed.");
    }
}

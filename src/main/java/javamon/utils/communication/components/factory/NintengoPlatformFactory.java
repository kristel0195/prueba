package javamon.utils.communication.components.factory;

import javamon.utils.communication.components.NintengoClassic;
import javamon.utils.communication.components.NintengoPlatform;
import javamon.utils.communication.components.NintengoSwitch;
import javamon.utils.enums.NintengoPlatformType;

public final class NintengoPlatformFactory {
	public static NintengoPlatform CreatePlatformCommunicationComponent(
							NintengoPlatformType type) {
		switch(type) {
    	case CLASSIC:
    		return new NintengoClassic();
    	case SWITCH:
    		return new NintengoSwitch();
    	}
		return null;
	}
}

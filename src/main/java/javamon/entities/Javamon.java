package javamon.entities;

import javamon.utils.enums.Element;
import javamon.utils.enums.Experience;
import javamon.utils.interfaces.SerializeToXml;

public class Javamon implements SerializeToXml{
    private String name;
    private Element element;
    private Experience experienceLevel;
    private int highAttack;
    private int middleAttack;
    private int lowAttack;
    private int highDefense;
    private int middleDefense;
    private int lowDefense;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public Experience getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(Experience experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public int getHighAttack() {
        return highAttack;
    }

    public void setHighAttack(int highAttack) {
        this.highAttack = highAttack;
    }

    public int getMiddleAttack() {
        return middleAttack;
    }

    public void setMiddleAttack(int middleAttack) {
        this.middleAttack = middleAttack;
    }

    public int getLowAttack() {
        return lowAttack;
    }

    public void setLowAttack(int lowAttack) {
        this.lowAttack = lowAttack;
    }

    public int getHighDefense() {
        return highDefense;
    }

    public void setHighDefense(int highDefense) {
        this.highDefense = highDefense;
    }

    public int getMiddleDefense() {
        return middleDefense;
    }

    public void setMiddleDefense(int middleDefense) {
        this.middleDefense = middleDefense;
    }

    public int getLowDefense() {
        return lowDefense;
    }

    public void setLowDefense(int lowDefense) {
        this.lowDefense = lowDefense;
    }
    
    @Override
    public String toString(){
        return this.getName() + ";" + this.element + ";" + this.experienceLevel;
    }

	@Override
	public String toXML() {
		StringBuilder output = new StringBuilder();
        output.append("<javamon>");
        output.append("<name>");
        output.append(this.getName());
        output.append("</name>");
        output.append("<element>");
        output.append(this.getElement());
        output.append("</element>");
        output.append("<experience>");
        output.append(this.getExperienceLevel());
        output.append("</experience>");
        output.append("<attack>");
        output.append("<high>");
        output.append(this.getHighAttack());
        output.append("</high>");
        output.append("<middle>");
        output.append(this.getMiddleAttack());
        output.append(this.getLowAttack());
        output.append("</middle>");
        output.append("<low>");
        output.append(this.getMiddleAttack());
        output.append(this.getLowAttack());        
        output.append("</low>");
        output.append("</attack>");
        output.append("<defence>");
        output.append("<high>");
        output.append(this.getHighDefense());
        output.append("</high>");
        output.append("<middle>");
        output.append(this.getMiddleDefense());
        output.append("</middle>");
        output.append("<low>");
        output.append(this.getLowDefense());
        output.append("</low>");
        output.append("</defence>");
        output.append("</javamon>");
		return output.toString();
	}
            
}

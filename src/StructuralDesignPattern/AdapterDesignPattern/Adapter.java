package StructuralDesignPattern.AdapterDesignPattern;

public class Adapter extends DataAnalyticsTool {
    private XMLData xmlData;

    public Adapter(XMLData xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public void analyseData() {
        System.out.println("here we are converting this xml data to a json data");
    }

}

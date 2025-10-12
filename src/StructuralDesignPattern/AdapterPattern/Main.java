package StructuralDesignPattern.AdapterPattern;

public class Main {
    public static void main(String[] args) {
        XMLData xmlData = new XMLData("<xml><name value='subin'></name></xml>");
        DataAnalyticsTool tool = new Adapter(xmlData);
        Client client = new Client();
        client.processData(tool);
    }
}

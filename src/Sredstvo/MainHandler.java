package Sredstvo;


import java.util.logging.Handler;

public class MainHandler {
    public static MainHandler getlntance(Handler handler) {
        switch (handler) {
            case Xml:
                return new XmlHandler();
            case Json:
                return new JsonHandler();
                default:
                    return null;

        }

    }

    public static void main(String[] args) {

    }
    enum Handler {Xml, Json}
}

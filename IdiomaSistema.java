import java.util.Locale;

public class IdiomaSistema{
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println("Seu sistema esta em " + locale.getDisplayLanguage());
    }
}
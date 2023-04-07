import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma esta em:");
        System.out.println(idioma.getDisplayName());
    }
}

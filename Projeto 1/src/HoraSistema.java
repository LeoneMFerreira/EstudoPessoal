import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HoraSistema {
    public static void main(String[] args) {
        //Date é classe para datas e horários
        Date relogio = new Date();
        System.out.println("A hora do sistema é:");
        // Usar SimpleDateFormat para formatar
        //dd minuscolo para os dias MM maiusculo para o mes e yyyy minusculo para o ano.
        SimpleDateFormat formato = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy, HH:mm:ss",
                new Locale("pt", "BR"));
        System.out.println(formato.format(relogio));


    }
}

import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension resolucao = kit.getScreenSize();
        System.out.println("Resolucao da tela:");
        //height altura
        //width largura
        int largura = resolucao.width;
        int altura = resolucao.height;
        System.out.println("Largura: "+largura);
        System.out.println("Altura: "+altura);
    }
}

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela{
    public static void main(String[] args) {
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension screenSize = resolucao.getScreenSize();
        System.out.println("Sua tela tem resolucao " + screenSize.width + 'x' + screenSize.height);
    }
}
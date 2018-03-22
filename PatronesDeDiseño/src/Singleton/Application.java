package Singleton;

/**
 *
 * @author dapda
 */
public class Application {
    private void exec() {
        Singleton.instance().m();
    }
    
    public static void main (String[] args) {
        new Application().exec();
    }
}

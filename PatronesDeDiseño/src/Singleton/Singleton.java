package Singleton;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author dapda
 */
public class Singleton {
    
    private static Singleton singleton;
    
    public static Singleton instance() {
        if(singleton == null){
            String line = Singleton.getSingletonConfigure();
            if(line.equals("SingletonA")) {
                singleton = new SingletonA();
            } else if (line.equals("SingletonB")) {
                singleton = new SingletonB();
            } else {
                assert false;
            }
        }
        return singleton;
    }
    
    private static String getSingletonConfigure() {
		BufferedReader in = null;
		String line = "";
		try {
			in = new BufferedReader(new FileReader("/home/dapda/NetBeansProjects/PatronesDeDiseño/src/Singleton/singletonConfigure"));
			line = in.readLine().substring(13);
		} catch (IOException ex) {
			System.out.println("IOException al leer: " + ex.getMessage());
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ex) {
					System.out.println("IOException al cerrar: "
							+ ex.getMessage());
				}
			}
		}
		return line;
	}

	protected Singleton() {

	}

	public void m() {
		System.out.println("Ejecucion de m en Singleton");
	}
}

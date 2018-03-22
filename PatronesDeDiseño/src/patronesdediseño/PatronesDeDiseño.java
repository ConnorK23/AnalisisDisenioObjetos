package patronesdediseño;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dapda
 */

abstract class XH {
    
    protected int[] a;
    
    private boolean b;
    
    public void m1(){}
    
    public void m2(){ System.out.println("XH"); }

    public void m4() {
        System.out.println("Prueba");
        this.m5();
    }
    
    public abstract void m5();
}

class YH extends XH {
    
    private float c;
    
    @Override
    
    public void m2(){super.m2(); System.out.println("YH");}
    
    public void m3(){}

    @Override
    public void m5() {
        System.out.println("Prueba");
    }
}

interface M5able {
    void m5();
}

class XC {
    
    protected int[] a;
    
    private boolean b;
    
    public void m1(){}
    
    public void m2(){System.out.println("XC");}

    public void m4(M5able m5able) {
        System.out.println("Prueba");
        m5able.m5();
    }
}

class X2C extends XC {
    
}

class YC implements M5able {
    
    private XC xc = new XC();
    
    private float c;
    
    public void m1(){ xc.m1(); }
    
    public void m2(){ xc.m2(); System.out.println("YC");}
    
    public void m3() { xc = new X2C(); }

    public void set(XC xc){
        this.xc = xc;
    }
    
    public void m4() {
        xc.m4(this);
    }
    
    public void m5() {
        System.out.println("Prueba");
    }
}

class ZZZ {
    public void m() {
        
        YC yc = new YC();
        
        yc.m1();
        
        yc.set(new X2C());
        
        yc.m1();
    }
}


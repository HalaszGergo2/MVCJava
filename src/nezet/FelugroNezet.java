package nezet;

import javax.swing.JOptionPane;

public class FelugroNezet {
    
    
    public void megjelenit(String uzenet) {
        JOptionPane.showMessageDialog(null, uzenet);
    }
    
    public int bekeres() {
        String v = JOptionPane.showInputDialog("Melyik ládában van a kincs? (1,2,3): ");
        return Integer.parseInt(v)-1;
    }
    
}

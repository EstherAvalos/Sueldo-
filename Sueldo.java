import javax.swing.JOptionPane;

public class Sueldo {

    public static void main(String[] args) {
        float s,h,st,t;
        h=Float.parseFloat(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
        s=Float.parseFloat(JOptionPane.showInputDialog("Ingrese su sueldo por hora"));
        t=h*s;
        st=t*6;
        JOptionPane.showMessageDialog(null, "El sueldo menanal es de"+ st);
    }
}
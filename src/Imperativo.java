

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DigitalMonster
 */
public class Imperativo {

    public static int Mayor(int a, int b, int c) {
        int numb;
        if (a < b) {
            numb = b;
        } else {
            numb = a;
        }
        if (numb < c) {
            numb = c;
        } else {
            numb = numb;
        }
        javax.swing.JOptionPane.showMessageDialog(null, "El numero mayor es: " + numb);
        return numb;
    }

    public static void main(String arg[]) {
        Mayor(3, 2, 1);
    }
}

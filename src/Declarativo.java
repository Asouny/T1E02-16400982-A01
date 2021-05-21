/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author DigitalMonster
 **/
public class Declarativo {

    public static int Mayor(int a, int b, int c) {
        return (((a > b) && (a > c)) ? a : ((b > a) && (b > c)) ? b : ((c > b) && (c > a)) ? c : a);
    }

    public static void main(String[] args) {
       javax.swing.JOptionPane.showMessageDialog(null,"El numero mayor es: "+(Mayor(3, 2, 1)));
    }
}

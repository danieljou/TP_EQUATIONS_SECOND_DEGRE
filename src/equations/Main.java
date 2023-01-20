/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equations;

/**
 *
 * @author Developer
 */
public class Main {
    public static void main(String[] args) {
        Equations E = new Equations(-2, 3, 5);
        System.out.println("Le discrimiant est : " + E.discriminant());
        if (E.estSoluble()) {
            if (E.discriminant() == 0) {
                System.out.println("La seule solution X est : X0 = " + E.SolutionX0());
            } else {
                System.out.println(
                        "Les deux solutions X1 et X2 sont  : X1 = " + E.SolutionX1() + " et X2 = " + E.SolutionX2());
            }
        }
    }
}

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
public class Equations {
    private double a, b, c;

    public Equations(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double discriminant() {
        double D;
        D = Math.pow(b, 2) - (4 * (a * c));
        return D;
    }

    public boolean estSoluble() {
        if (discriminant() >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public double SolutionX0() {
        double x = 0;
        if (estSoluble() && discriminant() == 0) {
            x = -b / (2 * a);
        }

        return x;
    }

    public double SolutionX1() {
        double x1 = 0;
        if (estSoluble() && discriminant() > 0) {
            x1 = (-b - Math.sqrt(discriminant())) / (2 * a);
        }

        return x1;
    }

    public double SolutionX2() {
        double x2 = 0;
        if (estSoluble() && discriminant() > 0) {
            x2 = (-b + Math.sqrt(discriminant())) / (2 * a);
        }

        return x2;
    }
}

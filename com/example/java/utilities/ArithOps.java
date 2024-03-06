package com.example.java.utilities;
import com.example.java.CalcOps;
import java.util.Objects;
public class ArithOps {
    private double add(double ip1, double ip2) {
        double result = ip1 + ip2;
        return result;
    }
    private double mul(double ip1, double ip2) {
        double result = ip1 * ip2;
        return result;
    }
    private double mod(double ip1, double ip2) {
        double result = ip1 % ip2;
        return result;
    }
    private double div(double ip1, double ip2) {
        double result = ip1 / ip2;
        return result;
    }
    private double sub(double ip1, double ip2) {
        double result = ip1 - ip2;
        return result;
    }
    public double ops(String op, double a, double b){
        if (op.equals("+")){
            return add(a,b);
        } else if (op.equals("*")) {
            return mul(a,b);
        }else if (op.equals("-")) {
            return sub(a,b);
        }else if (op.equals("/")) {
            return div(a,b);
        }else if (op.equals("%")) {
            return mod(a,b);
        }else{
            return 0;
        }
    }
}
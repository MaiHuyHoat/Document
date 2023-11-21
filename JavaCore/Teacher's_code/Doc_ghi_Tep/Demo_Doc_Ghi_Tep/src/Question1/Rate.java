/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Question1;

/**
 *
 * @author tmtruong
 */
public class Rate {
    String CODE1;
    String CODE2;
    double rate;
    public Rate()
    {
        CODE1="";
        CODE2="";
        rate = 0;
    }
    public Rate(String c1, String c2, double r)
    {
        CODE1 = c1;
        CODE2 = c2;
        rate = r;
    }
    public String toString()
    {
        return "CODE1: " + CODE1 + ", CODE2:" + CODE2 + ", rate:" +rate;
    }
}

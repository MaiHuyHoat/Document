/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Baitap.demsotu_cach1;

/**
 *
 * @author truongtm
 */
public class tumoi {
    String noidung;
    int solan;

    public tumoi()
    {
        noidung = "";
        solan = 0;
    }

    public tumoi(String t, int s)
    {
        noidung = t;
        solan = s;
    }
    public tumoi(String t)
    {
        noidung = t;
        solan=1;
    }
}

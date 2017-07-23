/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kangaroo;

/**
 *
 * @author Tony
 */
class Marsupial {
    public static boolean isBiped() {
    return false;
    }
    public void getMarsupialDescription() {
    System.out.println("Marsupial walks on two legs: "+isBiped());
    }
}

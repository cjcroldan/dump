/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TAU
 */
public class SingerClass {
    String name;
    int noOfPerformances;
    double earnings;
    
    public void performForAudience () {
        noOfPerformances += 1;
        earnings += 100;
    }
  
    public void changeFavSong() {
        earnings -= 2;
    }
}

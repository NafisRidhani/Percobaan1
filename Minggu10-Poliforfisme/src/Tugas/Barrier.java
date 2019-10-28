package Tugas;

public class Barrier implements Destroyable {
    private int strength;
    
    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }
    
    public void destroy() {
        
    }
    
    public String getBarrierInfo() {
        return "a";
    }

    @Override
    public void destroyed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

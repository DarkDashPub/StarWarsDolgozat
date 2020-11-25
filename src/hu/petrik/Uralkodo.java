package hu.petrik;

public class Uralkodo implements EroErzekeny,Sith {

    private double gonoszsag;

    public Uralkodo()
    {
        this.gonoszsag = 100;
    }

    @Override
    public boolean legyoziE(EroErzekeny e) {
        if(e.mekkoraAzEreje() < this.gonoszsag)
        {
            return true;
        }
        else
            {
                return false;
            }
    }

    @Override
    public double mekkoraAzEreje() {
        return this.gonoszsag*2;
    }

    @Override
    public void engeddElAHaragod() {
        this.gonoszsag += 50;
    }

    @Override
    public String toString() {
        return "Uralkodó, Gonoszság: " + this.gonoszsag;
    }
}

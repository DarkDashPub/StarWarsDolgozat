package hu.petrik;

public abstract class Jedi implements EroErzekeny {

    private double ero;
    private boolean atallhatE;

    public Jedi(double ero,boolean atallhatE)
    {
        this.ero = ero;
        this.atallhatE = atallhatE;
    }

    public double getEro() {
        return ero;
    }

    public void setEro(double ero) {
        this.ero = ero;
    }

    public boolean isAtallhatE() {
        return atallhatE;
    }

    public void setAtallhatE(boolean atallhatE) {
        this.atallhatE = atallhatE;
    }

    public abstract boolean megteremtiAzEgyensulyt();

    @Override
    public boolean legyoziE(EroErzekeny e) {

        boolean l = false;

        if(e.equals(Uralkodo.class))
        {
            if(this.ero > e.mekkoraAzEreje()*2)
            {
                l = true;
            }
            else
                {
                    l = false;
                }
        }
        else if(e.equals(Jedi.class))
        {
            if(this.atallhatE == true && this.ero > e.mekkoraAzEreje())
            {
                l = true;
            }
            else
                {
                    l =  false;
                }
        }

        return l;
    }

    @Override
    public double mekkoraAzEreje() {
        return this.ero;
    }

    @Override
    public String toString() {
        return "Erő: " + this.ero + ", Átállhat-e?: " + this.atallhatE;
    }
}

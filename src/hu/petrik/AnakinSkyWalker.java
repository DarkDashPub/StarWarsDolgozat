package hu.petrik;

public class AnakinSkyWalker extends Jedi implements Sith {

    public AnakinSkyWalker() {
        super(150, true);
    }

    @Override
    public boolean megteremtiAzEgyensulyt() {
        boolean l = false;

        if(this.getEro() > 999)
        {
            l = true;
        }
        else
            {
                l = false;
            }
        return l;
    }

    @Override
    public void engeddElAHaragod() {
        double eroNoveles = (Math.random()*10) + 1;

        this.setEro(this.getEro()+eroNoveles);
    }

    @Override
    public String toString() {
        return "Anakin Skywalker "+super.toString();
    }
}

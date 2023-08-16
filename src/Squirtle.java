public class Squirtle extends Pokemon implements Water{

    public Squirtle() {
    }

    @Override
    protected void tackle() {
        System.out.println("I'm Squirtle and I'm doing a tackle!");
    }

    @Override
    protected void scratch() {
        System.out.println("I'm Squirtle and I'm doing a scratch!");
    }

    @Override
    protected void bite() {
        System.out.println("I'm Squirtle and I'm doing a bite!");
    }

    @Override
    public void hydropump() {
        System.out.println("I'm Squirtle and I'm doing a hydropump!");
    }

    @Override
    public void buble() {
        System.out.println("I'm Squirtle and I'm doing a buble!");
    }

    @Override
    public void waterGun() {
        System.out.println("I'm Squirtle and I'm doing a water gun!");
    }
}

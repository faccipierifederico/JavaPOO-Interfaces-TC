public class Charmander extends Pokemon implements Fire{

    public Charmander() {
    }

    @Override
    public void fireFist() {
        System.out.println("I'm Charmander and I'm doing a fire fist!");
    }

    @Override
    public void flameThrower() {
        System.out.println("I'm Charmander and I'm doing a flame thrower!");
    }

    @Override
    public void ember() {
        System.out.println("I'm Charmander and I'm doing a ember!");
    }

    @Override
    protected void tackle() {
        System.out.println("I'm Charmander and I'm doing a tackle!");
    }

    @Override
    protected void scratch() {
        System.out.println("I'm Charmander and I'm doing a scratch!");
    }

    @Override
    protected void bite() {
        System.out.println("I'm Charmander and I'm doing a bite!");
    }
}

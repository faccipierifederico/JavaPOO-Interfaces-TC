public class Bulbasur extends Pokemon implements Plant{

    public Bulbasur() {
    }

    @Override
    public void sewer() {
        System.out.println("I'm Bulbasur and I'm doing a sewer!");
    }

    @Override
    public void paralyze() {
        System.out.println("I'm Bulbasur and I'm doing a paralyze!");
    }

    @Override
    protected void tackle() {
        System.out.println("I'm Bulbasur and I'm doing a tackle!");
    }

    @Override
    protected void scratch() {
        System.out.println("I'm Bulbasur and I'm doing a scratch!");
    }

    @Override
    protected void bite() {
        System.out.println("I'm Bulbasur and I'm doing a bite!");
    }
}

public class Pikachu extends Pokemon implements Electric{

    public Pikachu() {
    }

    @Override
    public void thunder() {
        System.out.println("I'm Bulbasur and I'm doing a thunder!");
    }

    @Override
    public void thunderFist() {
        System.out.println("I'm Bulbasur and I'm doing a thunder fist!");
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

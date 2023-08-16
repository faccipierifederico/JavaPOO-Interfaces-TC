public class Main {
    public static void main(String[] args) {


        // This is just a Pokemon App for practice the use of Interfaces and Abstract Class.
        // It is very simple and have a lot of things to do better,
        // but the use of Interfaces and Abstract Class was OK and help me to understand better the topic.


        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasur bulbasur = new Bulbasur();
        Pikachu pikachu = new Pikachu();

        squirtle.bite();
        squirtle.hydropump();
        charmander.ember();
        charmander.flameThrower();
        bulbasur.bite();
        bulbasur.paralyze();
        pikachu.tackle();
        pikachu.thunderFist();

    }
}
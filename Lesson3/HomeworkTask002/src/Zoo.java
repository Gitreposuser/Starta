public class Zoo {
    private Animal [] animals;

    public void initZoo() {
        animals = new Animal[10];
        animals[0] = new Dog("Boss", "bark bark", 1);
        animals[1] = new Cat("Snowfall", "meow meow", 2);
        animals[2] = new Cat("Lucky", "meeeeeow", 3);

        String name = ((Dog) animals[0]).getName();
        System.out.println(name);
    }

    public Animal choseAnimalById(int id) {
        if(0 > id) {
            return animals[0];
        }
        if(2 < id) {
            return animals[(animals.length - 1)];
        }
        return animals[id];
    }
}
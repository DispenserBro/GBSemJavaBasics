public class Cat {
    String name;
    String owner;
    String breed;
    float weight;
    int ageMonth;
    char sex;
    boolean isNeutered;

    public void getInfo() {
        System.out.println(String.format("Кличка: %s\nВладелец: %s\nПорода: %s\nВес: %f\nВозраст: %f\nПол: %c\nСтерилизация: %b\n",
                           this.name, this.owner, this.breed, this.weight, (double) this.ageMonth / 12, this.sex, this.isNeutered));
    }

    public void makeNeuter() {
        this.isNeutered = true;
    }

    public void setWeight(float newWeight) {
        this.weight = newWeight;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public Cat() {
        this.name = null;
        this.owner = null;
        this.breed = null;
        this.weight = 0.0f;
        this.ageMonth = 0;
        this.sex = 'М';
        this.isNeutered = false;
    }

    public Cat(String name, String owner, String breed, float weight, int age, char sex) {
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.weight = weight;
        this.ageMonth = age;
        this.sex = sex;
        this.isNeutered = false;
    }

    public static void main(String[] args) {
        Cat c = new Cat(
            "Барсик",
            "Иванов И.И.",
            "Персидский",
            12.45f,
            12,
            'М'
        );
        c.getInfo();
        c.makeNeuter();
        c.getInfo();
        // System.out.println(c.toString());

        Cat c1 = new Cat();
        c1.getInfo();
    }
}
public class Dog extends Pet {
    // Instance variable(s)
    private String name;
    private int age;
    private String breed;

    // Constructors
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public Dog() {
        this.name = "Dog";
        this.age = 1;
        this.breed = "breed";
    }

    // makeNoise() method
        public void makeNoise() {
            System.out.println("woof");
        }

    // toString method
        public String toString() {
            return super.toString() + " Breed: " + this.breed;
        }

    // Getter
    public String getBreed() {
        return breed;
    }

    // Setter
    public void setBreed(String breed) {
        this.breed = breed;
    }
}
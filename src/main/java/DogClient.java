public class DogClient {
    public static void main(String[] args) {
        Dog carl = new Dog("Carl", 4, "labrador");
        carl.makeNoise();
        System.out.println(carl);
        carl.setBreed("retriever");
        System.out.println(carl.getBreed());
        carl.setName("doug");
        System.out.println(carl);

    }
}
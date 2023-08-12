public class Main {
    public static void main(String[] args) {

        CustomMap<Integer, String> nameToLen = new CustomMap<>();
        nameToLen.put(1,"a");
        nameToLen.put(6, "Logesh");
        nameToLen.put(2, "b");
        nameToLen.put(3, "Raja");

        System.out.println(nameToLen.get(1));
        System.out.println(nameToLen.get(6));
        System.out.println(nameToLen.get(2));
        System.out.println(nameToLen.get(3));
    }
}
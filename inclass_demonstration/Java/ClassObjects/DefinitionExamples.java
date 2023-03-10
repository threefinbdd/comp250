class DefinitionExamples {

    /* Example set for Polymorphism */
    // Specified add function for integer
    public static int add(int x, int y) {
        return x + y;
    }

    // Specified add function for double
    public static double add(double x, double y) {
        return x + y;
    }

    // Default add function that utilizes Template types
    public static <T> T add(T x, T y) {
        return (T) (x.toString() + " " + y.toString());
    }

    /* Call Me To Test Polymorphism examples! */
    public static void poly_main() {
        int addInt = add(5, 7);
        System.out.println(addInt);

        double addDoub = add(3.141596, 2.71828);
        System.out.println(addDoub);

        String addString = add("Hello ", "World");
        System.err.println(addString);
    }

    /* End Polymorphism */

    public static void main(String[] args) {
        poly_main();
    }
}

/* Example set for Inheritance with Encapsulation */
class Restaurant {
    protected String name;
    protected String address;

    Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void welcome() {
        // private void welcome(){
        System.out.println("Welcome to my restaurant");
        System.out.println("A staff member will be with you shortly.");
    }
}

class Italian extends Restaurant {
    private String menu;

    Italian(Restaurant r, String menu) {
        super(r.name, r.address);
        this.menu = menu;
    }

    public static void main(String[] args) {
        Restaurant myRestaurant = new Restaurant("Pasta Familia", "Springfield, Ohio");
        Italian ItalianBranch = new Italian(myRestaurant, "Only Spaghetti, No Meatballs");

        ItalianBranch.welcome();
    }
}
/* End for Inheritance with Encapsulation */

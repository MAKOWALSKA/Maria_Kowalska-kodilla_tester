public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("600g", 800,  2020);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.laptopName();

        Notebook heavyNotebook = new Notebook("2000g", 1500,1980);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.laptopName();

        Notebook oldNotebook = new Notebook("1600g", 500,1950);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.laptopName();


    }
}
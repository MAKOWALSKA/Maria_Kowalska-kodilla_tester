public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap."); }
        else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good."); }
        else {
            System.out.println("This notebook is expensive."); }
    }
    public void checkWeight() {
        if (this.weight.equals("600g")) {
            System.out.println("This notebook is easy."); }
        else if (this.weight.equals("2000g")) {
            System.out.println("This notebook is heavy."); }
        else
        {
            System.out.println("This laptop weight is ok."); }
    }
    public void laptopName() {
        if ((this.weight.equals("600g")) && (this.price == 800)) {
            System.out.println("Thats Toshiba"); }
        else if ((this.weight.equals("2000g")) && (this.price >= 1500)) {
            System.out.println("Thats Apple."); }
        else
        {
            System.out.println("Thats Dell."); }
    }
}

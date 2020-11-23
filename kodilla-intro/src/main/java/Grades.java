public class Grades {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(2);
        grades.add(8);
        grades.add(45);
        System.out.println(grades.size);
        System.out.println(grades.lastNumber());
        System.out.println(grades.average());
    }
    private final int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add ( int value){
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public int lastNumber() {
        return this.grades[this.size - 1];
    }
    public double average () {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum +=this.grades[i];
        }
        return (double)sum / this.size;
    }


}


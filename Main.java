public class Main {
    
    public static void main(String[] args) {
        Segitiga sgt = new Segitiga();
        System.out.println("Total Sudut Segitiga 1 " + sgt.totalSudut(90));
        System.out.println("Total Sudut Segitiga 2 " + sgt.totalSudut(30, 30));
        System.out.println("Keliling Segitiga 1 " + sgt.keliling(12, 12, 12));
        System.out.println("Keliling Segitiga 2 " + sgt.keliling(8, 8));
    }
    
}

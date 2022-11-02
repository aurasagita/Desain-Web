public class Main1 {

    public static void main(String[] args) {
        // membuat objek dari Class Manusia
        Manusia man = new Manusia();
        // Membuat Objek dari class Dosen
        Dosen lecturer = new Dosen();
        // Membuat Objek dari class Mahasiswa
        Mahasiswa students = new Mahasiswa();
        
        // Menampilkan Seluruh Method
        System.out.println("==============================");
        //menampilkan method dari class Manusia
        man.bernafas();
        man.makan();
        System.out.println("==============================");
        //menampilkan method dari class Dosen
        lecturer.lembur();
        lecturer.makan();
        System.out.println("==============================");
        //menampilkan method dari class Mahasiswa
        students.Tidur();
        students.makan();
        System.out.println("==============================");
        System.out.println("==============================");
        //dynamic method dispatch
        //membuat referensi
        System.out.println("==============================");
        System.out.println(" == dynamic method dispatch == ");
        // dapatkan referensi tipe Manusia
        Manusia ref;
        //referensi mengacu pada objek Manusia
        ref = man;
        // memanggil Method Makan Dari ref
        ref.makan();
        // mengubah referensi tipe Dosen
        ref = lecturer;
        // memanggil Method Makan Dari ref
        ref.makan();
        // mengubah referensi tipe Mahasiswa
        ref = students;
        // memanggil Method Makan Dari ref
        ref.makan();
        System.out.println("==============================");
        System.out.println("==============================");
    }
    
}

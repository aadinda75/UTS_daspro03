import java.util.Scanner;

public class UtsDaspro03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai persentase: ");
        int persentase = scanner.nextInt();
        
        // Menentukan grade berdasarkan persentase
        char grade;
        
        if (persentase >= 90 && persentase <= 100) {
            grade = 'A';
        } else if (persentase >= 80 && persentase <= 89) {
            grade = 'B';
        } else if (persentase >= 70 && persentase <= 79) {
            grade = 'C';
        } else if (persentase >= 60 && persentase <= 69) {
            grade = 'D';
        } else if (persentase >= 0 && persentase < 60) {
            grade = 'E'; // Atau bisa juga menggunakan 'F'
        } else {
            System.out.println("Nilai persentase tidak valid.");
            return; // Mengakhiri program jika nilai tidak valid
        }
        
        // Menampilkan hasil grade
        System.out.println("Grade: " + grade);
    }
}

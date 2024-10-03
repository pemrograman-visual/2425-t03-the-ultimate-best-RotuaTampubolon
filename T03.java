// 12S24028-Rotua
// 12S24002-Petra

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, formatbuku, keterangan, bestPick, mustRead, recommended, average, low, onceinAlifetime, nevercometwice, noregret;
        int tahun, stok, jumlahbuku, i;
        double harga, margin, rating, diskon;

        iSBN = input.nextLine();
        do {
            judul = input.nextLine();
            penulis = input.nextLine();
            tahun = input.nextInt();
            penerbit = input.nextLine();
            formatbuku = input.nextLine();
            harga = input.nextDouble();
            margin = input.nextDouble();
            stok = input.nextInt();
            rating = input.nextDouble();
            diskon = margin / harga;
            if (rating >= 4.7 && rating <= 5.0) {
                keterangan = "Best Pick";
            } else {
                if (rating >= 4.5 && rating < 4.7) {
                    keterangan = "Must Read";
                } else {
                    if (rating >= 4.0 && rating < 4.5) {
                        keterangan = "Recommended";
                    } else {
                        if (rating >= 3.0) {
                            keterangan = "Average";
                        } else {
                            keterangan = "Low";
                        }
                    }
                }
            }
            if (diskon >= 0.4) {
                i = "OnceinAlifetime";
            } else {
                if (diskon > 0.2) {
                    i = "Nevercometwice";
                } else {
                    i = "Noregret";
                }
            }
            System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + formatbuku + "|" + toFixed(harga,2) + "|" + toFixed(margin,2) + "|" + stok + "|" + rating + "|" + keterangan);
        } while (!iSBN.equals("---"));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

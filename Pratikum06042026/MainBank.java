package Pratikum06042026;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zakiv
 */
public class MainBank {
    public static void main(String[] args) {
        // Membuat objek akun dengan saldo awal 1 juta
        AkunBank akunKu = new AkunBank("1234567890", "Daffa", 1000000);

        System.out.println("=== INFORMASI AKUN ===");
        // Menampilkan saldo awal dan identitas (norek dan nama)
        akunKu.tampilkanInfoAwal();
        System.out.println("======================\n");

        // Skenario 1: Melakukan deposit (misal: 500 ribu)
        System.out.println(">> Melakukan deposit sebesar Rp 500000");
        akunKu.deposit(500000);

        // Skenario 2: Melakukan withdraw yang berhasil (misal: 200 ribu)
        System.out.println("\n>> Melakukan withdraw sebesar Rp 200000");
        akunKu.withdraw(200000);

        // Skenario 3: Melakukan withdraw yang gagal karena saldo tidak cukup (misal: 2 juta)
        System.out.println("\n>> Melakukan withdraw sebesar Rp 2000000");
        akunKu.withdraw(2000000);
    }
}
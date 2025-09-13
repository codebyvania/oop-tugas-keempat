# 📘 Praktikum Pemrograman Berorientasi Objek

**Topik:** Koneksi NetBeans dengan PostgreSQL untuk Membuat Tabel

## 📋 Deskripsi

Proyek ini merupakan hasil praktikum mata kuliah **Pemrograman Berorientasi Objek** yang bertujuan untuk menghubungkan aplikasi **Java (NetBeans)** dengan **PostgreSQL** menggunakan JDBC.
Melalui praktikum ini, dibuat beberapa class Java yang mengimplementasikan operasi dasar pada database (**CRUD: Create, Read, Update, Delete**) serta main class untuk menjalankan keseluruhan proses.

Dengan adanya dokumentasi ini, pengguna dapat memahami langkah-langkah koneksi database, pembuatan tabel, hingga pengelolaan data secara langsung melalui kode program.

---

## 🎯 Tujuan

1. Memahami proses koneksi antara NetBeans dengan PostgreSQL.
2. Membuat program Java yang dapat melakukan operasi CRUD pada database.
3. Melatih keterampilan dalam membuat struktur class yang modular dan mudah dipelihara.
4. Menggunakan pgAdmin untuk memverifikasi tabel serta data yang sudah dimanipulasi.

---

## 🛠️ Tools & Teknologi

* **Java JDK** (disarankan versi 8 ke atas)
* **NetBeans IDE**
* **PostgreSQL** (dengan pgAdmin sebagai GUI)
* **JDBC Driver for PostgreSQL**

---

## 🚀 Langkah Instalasi & Konfigurasi

### 1. Persiapan Database PostgreSQL

* Buka **pgAdmin**, klik kanan pada menu **Database** → pilih **Create** → **Database**.
* Berikan nama database, misalnya: `PBO_P4`.
* Klik **Save** untuk menyimpan.

### 2. Konfigurasi NetBeans

* Buka **NetBeans IDE**.
* Pergi ke **Services → Databases → Drivers → PostgreSQL**.
* Klik kanan, lalu pilih **Connect Using**.
* Masukkan username, password, serta detail JDBC URL.
* Pilih schema `public` → klik **Finish**.

### 3. Membuat Project Java

* Buat **New Project** → pilih **Java with Ant → Java Application**.
* Berikan nama project (gunakan gaya penamaan CamelCase, misalnya `TugasPBO4`).
* Tambahkan library **PostgreSQL JDBC Driver** melalui menu **Libraries → Add Library**.

---

## 🏗️ Struktur Class

1. **Koneksi Class** → konfigurasi koneksi database.
2. **Create Class** → membuat tabel `koleksi_film`.
3. **Insert Class** → menambahkan data baru ke tabel.
4. **Read Class** → membaca dan menampilkan data.
5. **Update Class** → memperbarui data dalam tabel.
6. **Delete Class** → menghapus data dari tabel.
7. **Main Class** → menjalankan semua fungsi di atas melalui menu interaktif.

---

## 📌 Contoh Penggunaan

1. Jalankan **Main Class**.
2. Pilih menu sesuai kebutuhan:

   * `1` → Membuat tabel
   * `2` → Insert data (misalnya 10 data film)
   * `3` → Membaca semua data
   * `4` → Update data
   * `5` → Delete data
   * `6` → Keluar dari aplikasi

---

## 📊 Verifikasi di pgAdmin

* Masuk ke database `PBO_P4`.
* Klik schema **public → Tables → koleksi\_film**.
* Klik kanan → **View Data → All Rows**.
* Pastikan data sesuai dengan operasi yang dilakukan (insert, update, delete).


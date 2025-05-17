# 📘 Java Generics

## 🔹 Pengertian

Generics adalah fitur Java sejak JDK 1.5 yang memungkinkan kita menulis kode yang lebih aman terhadap tipe data (type safety) dan menghindari casting secara manual. Generics diperkenalkan dengan menggunakan type parameter seperti `<T>`, `<E>`, dll.

---

## 🔸 Penggunaan Tanpa Generics (Raw Type)

```
List lo = new ArrayList();
lo.add("lo - String 1");
lo.add(new Planet("Mercury", 0.06));

for (Object o : lo) {
    Planet p = (Planet) o; // perlu casting
    p.print();
}
```

📌 *Masalah:*

* List dapat menampung objek dari berbagai tipe.
* Perlu melakukan casting saat mengambil data.
* Potensi `ClassCastException` saat runtime.

---

## ✅ Penggunaan Dengan Generics

```
List<Planet> lp = new ArrayList();
lp.add(new Planet("Mercury", 0.06));
lp.add(new Planet("Venus", 0.82));

for (Planet p : lp) {
    p.print();
}
```

🔧 *Keuntungan:*

* Compile-time type safety.
* Tidak perlu casting.
* Mencegah objek dari tipe yang tidak sesuai.

---

## 🌀 Wildcards (`<?>`)

### ❌ Tanpa Wildcard

```java
public static void print(Collection<Object> collection) { }
```

⛔ Tidak bisa menerima `Collection<String>`, `Collection<Planet>`, dll.

### ✅ Dengan Wildcard

```java
public static void print(Collection<?> collection) {
    for (Object o : collection) {
        System.out.println(o);
    }
}
```

🔧 *Fungsi:*

* Bisa menerima semua jenis `Collection<T>`.
* Cocok untuk membaca data (read-only).
* Tidak bisa menambahkan elemen ke dalam koleksi.

---

## ⚙️ Generic Method

```java
static <T> void arrayToCollection(T[] a, Collection<T> c) {
    for (T o : a) {
        c.add(o);
    }
}
```

📌 *Penjelasan:*

* `<T>` adalah deklarasi type parameter.
* Type parameter `T` akan ditentukan saat method dipanggil.

🔧 *Kelebihan:*

* Method dapat digunakan untuk berbagai tipe data.
* Tidak perlu overload method.

### Contoh Pemanggilan

```
String[] sa = new String[100];
Collection<String> cs = new ArrayList();
arrayToCollection(sa, cs); // T inferred to be String

Integer[] ia = new Integer[100];
Collection<Number> cn = new ArrayList();
arrayToCollection(ia, cn); // T inferred to be Number
```

⛔ Compile Error jika:

```
Number[] na = new Number[100];
Collection<String> cs = new ArrayList();
arrayToCollection(na, cs); // Compile error
```

---

## 🔄 Wildcards vs Generic Method

### Wildcards

```java
static void print(Collection<?> col) {
    for (Object o : col) {
        System.out.println(o);
    }
}
```

📌 *Digunakan saat return-type tidak tergantung pada parameter-type.*

### Generic Method

```java
static <T> Collection<T> arrayToCollection(T[] a) {
    Collection<T> c = new ArrayList<>();
    for (T o : a) {
        c.add(o);
    }
    return c;
}
```

📌 *Digunakan saat return-type tergantung parameter-type.*

---

##  Kesimpulan

* Gunakan **Generics** untuk mencegah runtime error dan casting manual.
* Gunakan **Wildcard (`<?>`)** untuk fleksibilitas menerima berbagai jenis koleksi.
* Gunakan **Generic Method** saat return value tergantung pada parameter type.

---

🗂️ *Disarankan simpan file ini sebagai* `Generics.md` *dalam folder:*

```
src/CommonClass/generics/
```

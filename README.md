# VCS GIT
1. Install Git
2. clone repository to local
3. Di folder repo local, klik kanan, git bash here
git config --global user.name "FIRST_NAME LAST_NAME"  //username bebas/punya github klo bisa
git config --global user.email "MY_NAME@example.com"  //email yg mau dipake
5. konfigure ssh (https://gist.github.com/adamjohnson/5682757) (step 1-5)
6. copy isi id_rsa.pub, kirim ke adit
7. di git bash, ketik : git remote add origin git@github.com:bytadit/DBMS-Project-SDA-.git
8. git branch -M main
9. edit", file netbeans, klo udh fix, disave, 
10. git status, klo merah mk perlu di add (git add .)
11. git status, (klo hijau mk tinggal commit : git commit -m "pesan...")
12. 
13. 

# DBMS-Project-SDA
1. Download dulu Netbeans IDE
2. GIT
3. SQL Server, SSMS
4. Libraries (ada di folder)

## Cara Connect database SQL Server Remote

## Cara Konek SQL Server di Netbeans
1. Add Libraries <br>
Libraries -> Add JAR/Folder -> masukkin semua JAR di folder libraries (diekstrak dulu ofcourse)

https://www.youtube.com/watch?v=0lYuVx-7PUM <br>
tab services -> databases -> new connection <br>
Host : 127.0.0.1 <br>
Port : 1433 <br>
database : SDAIndo <br>
Username : bytadit <br>
password : bytadit123 <br>
->dbo
## Bagian GUI yang sudah dibuat (belum final, tampilan msh jelek) :
1. Operator
2. Menu Utama
3. SDA Menu

### Tugas Farel :
1. Membuat database + Jframe/GUI untuk RENEWABLE, Komoditas, format mirip dengan JFRAME OPERATOR, SILAKAN PELAJARI VIDEO TUTOR YT KMRN (TERUTAMA PROSES INSERT UPDATE DELETE)
2. Percantik GUI
### Tugas Adit :
1. databse n GUI Operator , Provinsi, NON-RENEWABLE
2. Link antar page, Form Login(myb)

TIAP ADA UPDATE, INGAT UTK SELALU COMMIT
UTK PUSH, BIKIN SSH SENDIRI JGA GPP, NNTI KUTAMBAHKAN

# VCS GIT
1. Install Git
3. Di folder manapun, klik kanan, git bash here <br>
git config --global user.name "FIRST_NAME LAST_NAME"  //username bebas/punya github klo bisa <br>
git config --global user.email "MY_NAME@example.com"  //email yg mau dipake <br>
5. konfigure ssh (https://gist.github.com/adamjohnson/5682757) (step 1-5)
6. copy isi id_rsa.pub, kirim ke adit
7. clone repository to local(folder manapun yg mau dipake) (git clone git@github.com:bytadit/DBMS-Project-SDA-.git)
8. di git bash, ketik : git remote add origin git@github.com:bytadit/DBMS-Project-SDA-.git
9. git branch -M main
10. edit", file netbeans, klo udh fix, disave, 
11. git status, klo merah mk perlu di add (git add .)
12. git status, (klo hijau mk tinggal commit : git commit -m "pesan...")
13. git push -u origin main (klo error pas ngepush pke: git pull origin main, baru git push -origin main) <br> sc : https://medium.com/@bayupaoh/kolaburasi-code-dengan-git-dan-github-1-79e19e553f85) (master diganti main)


# DBMS-Project-SDA
1. Download dulu Netbeans IDE
2. GIT
3. SQL Server, SSMS
4. Libraries (ada di folder)

## Cara Connect database SQL Server Remote
new connection biasa, tpi connect ke ip address 192.168.43.36, <br>
pke sql server auth
username : bytadit
pass : bytadit123

atau
username : farel
pass : farel123

## Cara Konek SQL Server di Netbeans
1. Add Libraries <br>
Libraries -> Add JAR/Folder -> masukkin semua JAR di folder libraries (diekstrak dulu ofcourse)

https://www.youtube.com/watch?v=0lYuVx-7PUM <br>
tab services -> databases -> new connection <br>
Host : 127.0.0.1 <br>
Port : 1433 <br>
database : SDAIndo <br>
Username : (sesuai ssms) <br>
password : (sesuai ssms)<br>

**Napravite klase ZaradaDvoraneException, ZaradaDvorane, KoncertnaDvorana i WriteKoncertnaDvorana sa sledećim uslovima:**

a)	Klasa ZaradaDvoraneException predstavlja neproveravani izuzetak (nasleđuje klasu RuntimeException) i ima:
-	Javni konstruktor koji kao parametar prima poruku greške i poziva odgovarajući konstruktor nadklase prosleđujući mu parametar.

b)	Klasa ZaradaDvorane koja ima:
-	Atribut zarada koji predstavlja zaradu ostvarenu na koncertu (npr. 20000 dinara).

c)	Klasa KoncertnaDvorana koja ima:
-	Atribut koji predstavlja niz sedišta u dvorani. Svako sedište može da bude slobodno ili zauzeto. Ako je slobodno, vrednost odgovarajućeg elementa niza je TRUE, a ako je zauzeto, onda je FALSE.
-	Atribut zaradaDvorane koji predstavlja objekat klase ZaradaDvorane. Odmah inicijalizovati atribut (objekat).
-	Konstruktor koji kao ulazni argument prima kapacitet sale i inicijalizuje niz sedišta na taj kapacitet. Ako je uneti kapacitet sale jednak ili manji od nule potrebno je kapacitet postaviti na 120 mesta baciti izuzetak klase ZaradaDvoraneException sa odgovarajućom porukom. Postaviti vrednosti svih sedišta iz niza na slobodna.
-	Metodu koja uvodi gledaoca na sedište. Broj sedišta je dat kao ulazni argument metode. Prvo se proverava da li je broj sedišta u granicama (brojevi se poklapaju sa indeksima niza) i da li je sedište već zauzeto, pa ako je sve u redu sedište postaje zauzeto. Ako je sedište već bilo zauzeto ili broj sedišta nije u granicama, ne dešava se ništa.
-	Metodu koja izračunava zaradu koncertne dvorane ako se zna da karte za sedišta iz prve polovine sale koštaju 500 dinara, a da karte za sedišta iz druge polovine sale koštaju 250 dinara. Zarada se računa samo za ona sedišta koja su zauzeta. Kada metoda izračuna zaradu, ovu vrednost unosi u atribut zarada klase zaradaDvorane.
-	Metodu koja proverava da li se u dvorani mogu naći tri susedna sedišta koja su slobodna i nalaze se u istom redu i vraća TRUE ako može, a FALSE ako ne može. Zna se da su svi redovi iste veličine I da sadrže tačno po 10 sedišta. Prema tome, prvih 10 sedišta iz niza su zapravo u prvom redu, sledećih 10 sedišta u drugom redu itd.

d)	Glavna klasa WriteKoncertnaDvorana koja kreira jedan objekat klase KoncertnaDvorana kapaciteta 40 mesta i uvodi gledaoce na sedišta broj 0, 20 i 40. Koristeći klasu PrintWriter u tekstualni fajl “koncertnaDvorana.txt” upisati zaradu koncertne dvorane.

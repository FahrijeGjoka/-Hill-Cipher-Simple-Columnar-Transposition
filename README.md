# Hill-Cipher




### Simple-Columnar-Transposition

Ky program në Java implementon një version të thjeshtë të algoritmit **Columnar Transposition Cipher** për enkriptimin e tekstit të zakonshëm duke përdorur një çelës numerik.
### Përshkrimi i algoritmit
Columnar Transposition Cipher është një algoritëm klasik i kriptimit që bazohet
në rindërtimin e rendit të shkronjave të mesazhit origjinal sipas një çelësi të
caktuar. Ai nuk ndryshon shkronjat, por vetëm i rindërton ato në bazë të kolonave.

### Kërkesat
- Java Development Kit(JDK 8 ose më i ri)
- IntellJ IDEA ose çdo IDE tjetër për JAVA.
- Ose, alternativisht, terminal/command prompt për përpilim dhe ekzekutim

## Si funksionon 
1.Teksti i dhënë konvertohet në shkronja të mëdha dhe hiqen hapësirat.
2. Teksti vendoset në një matricë me 'key' kolona dhe numër të caktuar rreshtash.
3. Nëse nuk plotësohet krejtësisht matrica, vendosen karaktere 'X' në fund.
4. Teksti enkriptohet duke lexuar matricën kolonë pas kolone. 

## Si ta ekzekutoni
-Hapni projektin ne IntellJ;
- Drejtohuni te `src/SimpleColumnarTransposition/Enkriptimi.java`.
- Ekzekutoni metodën `main`.
- Shkruani tekstin që dëshironi të enkriptoni dhe çelësin numerik. 


#### Shembull ekzekutimi për Enkriptim (Columnar Transposition)
Shkruaj tekstin për enkriptim: Siguria e te dhenave
Shkruaj çelësin numerik: 4
Teksti i enkriptuar: SRTEEIIENXGADAXUEHVX




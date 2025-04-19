# Hill-Cipher
Ky program në Java implementon algoritmin Hill Cipher – një teknikë klasike e kriptimit që përdor algjebrën lineare dhe matricat për të enkriptuar tekstin.
### Përshkrimi i algoritmit
Hill Cipher është një formë e kriptimit bllok që përdor një matricë çelës (key matrix) për të enkriptuar një tekst të zakonshëm në bazë të veprimeve matematikore mbi grupe të karaktereve.
Karakteristikat:
-Mbështetet në veprimet modulo 26
-Teksti konvertohet në vargje numerike, që shumëzohen me matricën çelës për të prodhuar tekstin e enkriptuar
-E kundërta (dekriptimi) kërkon inversin e matricës çelës

### Kërkesat
-Java Development Kit (JDK 8 ose më i ri)
-IntelliJ IDEA, Eclipse, ose një IDE tjetër për Java
-Alternativisht, përdorimi i javac dhe java në terminal/command prompt

## Si funksionon
1.Teksti i zakonshëm konvertohet në shkronja të mëdha dhe hiqen hapësirat
2.Zgjidhet një çelës matricë katrore (p.sh. 2x2 ose 3x3) me determinant të invertueshëm në mod 26
3.Teksti ndahet në blloqe me madhësi të barabartë me dimensionin e matricës
4.Çdo bllok shndërrohet në vektor numerik dhe shumëzohet me matricën çelës
5.Rezultati modulo 26 konvertohet në shkronja dhe formon tekstin e enkriptuar

## Si ta ekzekutoni
Hapni projektin në IDE ose direkt në terminal
Navigoni te src/HillCipher/Main.java
Ekzekutoni metodën main
Jepni:

Tekstin për enkriptim (vetëm shkronja)
Madhësinë dhe përmbajtjen e matricës çelës (vlerat numerike)
Programi do të shfaqë tekstin e enkriptuar

#### Shembull ekzekutimi për Enkriptim 
Shkruaj tekstin për enkriptim: KRIPTIM
Shkruaj dimensionin e matrices çelës (2 për 2x2, 3 për 3x3): 2
Jep vlerat e matrices çelës (8 numra për 2x2): 3 3 2 5
Teksti i enkriptuar: TTXVRPES


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

## Si funksionon ( a)Enkriptimi dhe b)Dekriptimi)
a)Enkriptimi
1.Teksti i dhënë konvertohet në shkronja të mëdha dhe hiqen hapësirat.
2. Teksti vendoset në një matricë me 'key' kolona dhe numër të caktuar rreshtash.
3. Nëse nuk plotësohet krejtësisht matrica, vendosen karaktere 'X' në fund.
4. Teksti enkriptohet duke lexuar matricën kolonë pas kolone. 

b)Dekriptimi
1.Teksti i enkriptuar vendoset në një matricë me key kolona dhe numër të caktuar rreshtash
2. Matrica mbushet kolonë pas kolone, ndryshe nga enkriptimi që lexohet kështu.
3. Teksti origjinal ndertohet duke lexuar matricën rresht pas rreshti.
4. Karakteret 'X' në fund hiqen nëse nuk janë pjesë e mesazhit origjinal.

## Si ta ekzekutoni
-Hapni projektin ne IntellJ;
- Drejtohuni te `src/SimpleColumnarTransposition/Enkriptimi.java`ose `src/SimpleColumnarTransposition/Dekriptimi.java`
- Ekzekutoni metodën `main`.
- Shkruani tekstin që dëshironi të enkriptoni dhe çelësin numerik (e kunderta për dekriptim)


#### Shembull ekzekutimi për Enkriptim (Columnar Transposition)
Shkruaj tekstin për enkriptim: Siguria e te dhenave
Shkruaj çelësin numerik: 4
Teksti i enkriptuar: SRTEEIIENXGADAXUEHVX

#### Shembull ekzekutimi për Dekriptim (Columnar Transposition)
Shkruaj tekstin e enkriptuar: SRTEEIIENXGADAXUEHVX
Shkruaj çelësin numerik (key): 4
Teksti i dekriptuar: SIGURIAETEDHENAVE




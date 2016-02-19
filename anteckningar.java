2016-02-18
jQuery
Vad är jQuery?


2016-02-15

javascript

// skapa en array #1
var weekdays = ["måndag" ,"tisdag", "onsdag", "torsdag", "fredag", "lördag", "söndag"];

// hämnta ur en array (variant #1)
console.log("Den första dagen i veckan är " + weekdays[0]);

Objekt -- inte riktigt samma sak som i java, men likheter finns.
påminner mer om en Map i java, dvs en lista med nyckel och värde.
Kallas i vissa programmeringsspråk för Dictionary
ex uppslagsord - förklaring / spelare - poäng


2016-01-11

+++++ Test ++++

Ett text undersöker att något fungerar.
 - beskriver VAD som ska göras,
 - men inte HUR det ska göras.

Manuella test: Vi gör själva, med eller utan struktur
Automatiska test: Vi tar fram kod/program som testar vårt program

Enhetstestning (unit testing) jUnit
 - Undersök en del av programmet, (oftast bara en metod) 

Integrationstest
 - Att delar av programmet samarbetar

Användartest
 -Att programmet fungerar för användare

Testa en klass och dess metoder i JAVA:
- Skriv en testklass (en vanlig klass, namnge med test på slutet: MyClass -> MyClassTest)
- Skriv en testmetod 
  @Test innan 
  assertEquals (expected, returned)
- Importera jUnit


Testdriven metodik (TDD: Text Driven Development)
Testa det man skrivit?
 Göra test efteråt 
      - Tid har gått åt till både manuell textning - automatiserad
      - Ej motiverande att testa färdigt fungerande program
      - Bristande testtäckning

TDD
1. Test
2. Implementation. Ta fram minsta möjliga kod så testet lyckas
3. Refactor. Ändra / förbättra implementationer

Refactorering
1. Se till att text lyckas... 2. därefter fira kodningsregler  3. därefter gör kod läsbar  4. därefter minimal



++++ Parprogrammering ++++

Förare: skriver kod
Navigatör: granska, strategi

- Turas om. Gärna ca varje kvart

Allmänna tips om vi fastnar: 
    Tänk högt
    Ha och visa respekt för varandra
    B(r)yt fokus
    Ta ofta pauser (pomodoro-teknik)
    Det ska vara möjlig att säga "jag vet inte" / "jag förstår ej"
    Förbered passen
    Var lyhörd
 

Fördelar: Enklare kod, snabbare klart, lärande



2016-02-22
REST 
Repsentational State Transfer 
Det behövs ingen persistent[ständig, kontinuerlig, orubblig] uppkoppling.
Vi har efterfrågat och fått något från en server, (upp)koppling till servern behövs ej.
Principen för www(World Wide Web).


1. klient ---------------------------> server 
  http GET www.google.com (i headers) ---> server
          request(förfråga)
2. <---------------------------------server
    svars (responce) html-kod + headers (information om svaret)
  
Innan 2005
  För att få ny infromation från servern, för ny förfrågan => ny (eller samma) hemsida måste hämtas.
  Även om bara en del på hemsidan behöver bytas ut, hela hemsidan måste laddas om.
  Men i javascript fanns/finns XmlhttpRequest som gör det möjligt att göra förfrågningar och hämta data med javascript, alltså på t ex användarens begäran (knapptryck etc).

  Istället för att hämta en hel hemsida med XHR, hämta bara viss data.
  Istället för en hel del HTML-fil, hämta data som en XML-fil

  Ex: sjk15.Xml
  <teacher>Oscar</teacher>
  <nrOfStudent>20</nrOfStudent>
  XML- Extensible Markup Language - ett sätt att spara information / data på (t ex XML-filer istället för databas)

    => AJAX (Asynchronous JavaScript and XML = en samling tekniker för att hämta data med JavaScript) 

Efter 2005, AJAX...
klient                                  server
1. google ---------request------------->
2. google <------responce (html)--------
3. google ------Request "Program"------>
4. google <------responce "program, programmering, program stv etc"


2016-02-18
jQuery
Vad är jQuery?
  Ett bibliotek av javascript - functioner som förenklar samspel mellan js och html
  Kort namn på funktionen som hämtar html element: $
  Använder css-selektorer som argument 
    ex $("#id") för något med id 
       $(".className") för klasser
       $("p") för html-element

javascript
  blev väldigt stort - polärt väldigt snabbt.
  tolkas olika av loka webbläsare.
  hade vissa funktioner bara tillgängliga i vissa webbläsare.
  kräver mycket/lång för det vanligaste man gör med javascript (interaktion, manipulering av element)
  ex document.getElementById("myId").metod... 
    något kortare? Ta hänsyn till webbläsare? 

  -->  $("myId").metod....

javascript

function $(someId) {
  return document.getElementById(someId);
}


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



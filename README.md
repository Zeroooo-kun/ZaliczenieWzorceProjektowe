# ZaliczenieWzorceProjektowe
Projekt opracowany w grupie 3-osobowej na zajęcia "Wzorce Projektowe".
<br/>
<br/>
<strong>Autorzy:</strong> 
<br/>
Magdalena Kur 11358 
<br/>
Konrad Cieślak 11349 
<br/>
Artur Gómułka 11872 
<hr/>

<strong>Język:</strong> Java
<br/>
<br/>
Wymagane było wykorzystanie 4 wzorców projektowych, z czego należało uwzględnić by z każdej grupy wykorzystać przynajmniej jeden rodzaj. 
<br/>
<br/>
<strong>Wykorzystane wzorce projektowe:</strong>

<strong>Wzorce behawioralne:</strong>
<ul>
<li>
Strategy/Strategia
</li>
<li>
Observer/Obserwator
</li>
</ul>
<strong>Wzorce kreacyjne:</strong>
<ul>
<li>
Singleton
</li>
</ul>
<strong>Wzorce strukturalne:</strong>
<ul>
<li>
Proxy/Pełnomocnik
</li>
</ul>
<br/>
<hr/>
<strong>Projekt ZaliczenieWzorceProjektowe</strong>
<br/>
Jest to projekt sklepu internetowego HappyDay sprzedającego owoce na sztuki. Przedstawiony został proces zakupowy zaczynający się od notatki wyjaśniająco/ witającej sklepu, wybranie produktów, ich ilość, pokazanie ceny całkowitej, wybranie metody płatności, wprowadzenie niezbędnych danych, a kończąc na potwierdzeniu zamówienia i płatności. 
<br/><br/>
<strong>Aby uruchomić program, należy:</strong><br>
<ol>
  <li>
Pobrać zestaw plików (jeśli będzie w formacie zip to go rozpakować)
   </li>
   <li>
Wczytać folder projektu
   </li>
   <li>
Wystartować projekt poprzez uruchomienie “Demo”
    </li>
    </ol>
<br/>
<strong>Kolejne kroki w programie:</strong><br/>
<ol>
  <li>
Wybranie przedmiotu, który chcemy kupić poprzez wprowadzenie cyfry z przedziału 1-8
      </li>
  <li>
Wprowadzenie ilości 
    </li>
  <li>
Wybranie czy chcemy kontynuować zakupy, czy nie. Przy wyborze Y następuje powrót do punktu 1. Przy wyborze N następuje przejście do kolejnego kroku.
Wybranie sposobu płatności 1 / 2. Po wybraniu 1 następuje przejście do kolejnych kroków z płatności sposobem PalPay. Po wybraniu 2 następuje przejście do kolejnych kroków z płatności kartą kredytową 
   <ul>
  <li>
PalPay:
podanie @ wybranego z wprowadzonych opcji w programie np. artur1997@op.pl
podanie hasła np. artur1997
      </li>
  <li>
	Karta kredytowa:
numer karty
data wygaśnięcia
CVV
</li>
     </ul>
     </li>
  <li>
Weryfikacja jak błędna to ponowna próba
    </li>
  <li>
Podanie sumy i zapytanie czy kontynuować zakupy czy płacić. Po wybraniu c - powrót do zakupów. Po wybraniu p przejście do płatności i potwierdzenia
</li>
  </ol>
<br/>
Dodatkowo do zaliczenia zostały dołączone/udostępnione:
<br/>
-Pliki zawierające dodatkowe przykłady implementacji poszczególnych wzorców projektowych
<br/>
-Plik <strong>"Wzorce Projektowe"</strong>, który zawiera:<br/>podział, którtki opis, zalety, wady, zastosowanie, diagramy ogólne, diagramy do przykładów oraz opis do przykłądów -> dla wzorców, które zostały użyte.

// Dajana
// 28.02.2024
// Ülesanne 10
// for = tsükkel aitab kuvada ostukorvi sisu, logides konsooli iga toote nime, hinna ja koguse.

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JavaScripti kood</title>
</head>
<body>
    <script>
        // Toote objekt
        const toode = {
        nimetus: 'Piim',
        hind: 1.20,
        kogus: 5,
        koguhind: function() {
            return this.hind * this.kogus;
        },

        muudakogus: function(uuskogus) {
            this.kogus = uuskogus;
        },
        
        kuvasisu: function() {
            return `${this.nimetus} - Hind: ${this.hind} EUR - Kogus: ${this.kogus}`;
        }
        };


        console.log("Toote omadused:");
        console.log("Nimetus:", toode.nimetus);
        console.log("Hind:", toode.hind);
        console.log("Kogus:", toode.kogus);


        console.log("Toote koguhind:", toode.koguhind());
        toode.muudakogus(10);
        console.log("Uus kogus:", toode.kogus);
        console.log("Toote sisu:");
        console.log(toode.kuvasisu());

        // Ostukorv
        const ostukorv = {
        tooted: [
            { nimi:'Piim', hind:3.60, kogus:2 },
            { nimi:'Leib', hind:2.00, kogus:1 },
            { nimi:'Munad', hind:1.50, kogus:6 },
            { nimi:'Juust', hind:4.20, kogus:1 },
            { nimi:'Tomatid', hind:2.30, kogus:3 },
        ],

        kogusumma: function() {
            let summa = 0;
            for (let toode of this.tooted) {
            summa += toode.hind * toode.kogus;
            }
            return summa;
        },

        kuvasisu: function() {
            console.log("Ostukorvi sisu:");
            for (let toode of this.tooted) {
            console.log(`${toode.nimi} - ${toode.hind} EUR - Kogus: ${toode.kogus}`);
            }
        },
        
        lisatoode: function(nimi, hind, kogus) {
            this.tooted.push({ nimi, hind, kogus });
        }
        };

        // ostukorvi sisu
        ostukorv.kuvasisu();

        // Lisa tooteid ostukorvi
        ostukorv.lisatoode('Kohv', 5.80, 2);
        console.log("Toode lisatud ostukorvi.");

        // Kuva ostukorvi summa
        console.log('Ostukorvi kogu summa:', ostukorv.kogusumma());






    </script>
</body>
</html>

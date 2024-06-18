// Dajana
// 18.06.2024
// Ülesanne 9
// const = kasutatakse muutuja defineerimiseks, mille väärtus jääb püsivaks ega muutu pärast seda, kui see on määratud,
// functsion = defineerib funktsiooni, parseint = loeb ainult arve

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ülesanne 9</title>
</head>
<body>
    <script>
        // Klassikaline funktsioon nime väljastamiseks
        function klassikaline() {
            console.log("Dajana Mähdi");
        }

        // Noolefunktsioon nime väljastamiseks
        const noolefunktsioon = () => {
            console.log("Dajana Mähdi");
        };

        // Funktsioon kuupäeva kuvamiseks eesti keeles
        function kuupaeveesti(kuupaev) {
            const kuud = ["jaanuar", "veebruar", "märts", "aprill", "mai", "juuni", "juuli", "august", "september", "oktoober", "november", "detsember"];
            const [paev, kuu, aasta] = kuupaev.split(".");
            console.log(`${paev}. ${kuud[parseInt(kuu) - 1]} ${aasta}`);
        }

        // Funktsioon teadmata hulga täisarvude koguarvu ja keskmise arvu arvutamiseks
        const teadmatahulk = (...arvud) => {
            const summa = arvud.reduce((acc, cur) => acc + cur, 0);
            const keskmine = summa / arvud.length;
            return [summa, keskmine];
        };

        // Noolefunktsioon salajase sõnumi loomiseks
        const salajanesonum = (sonum) => {
            const taishaalikud = /[aeiouAEIOU]/g;
            return sonum.replace(taishaalikud, "*");
        };

        // Noolefunktsioon ainulaadsete nimede leidmiseks
        const leiaunikaalsednimed = (nimed) => {
            const ainulaadsed = [];
            nimed.forEach((nimi) => {
                if (!ainulaadsed.includes(nimi)) {
                    ainulaadsed.push(nimi);
                }
            });
            return ainulaadsed;
        };

        // Testime funktsioone
        klassikaline();
        noolefunktsioon();
        kuupaeveesti("19.07.23");
        console.log((1, 2, 3, 4, 5));
        console.log(salajanesonum("Tsau Mario!")); 
        console.log(leiaunikaalsednimed(["Kati", "Mati", "Kati", "Mari", "Mati", "Jüri"]));






    </script>
</body>
</html>

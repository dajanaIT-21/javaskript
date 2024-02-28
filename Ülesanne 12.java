// Dajana
// 28.02.2024
// Ülesanne 12

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ül12</title>
</head>
<body>
    <h1>Ostukorv</h1>
    <ul id="ostukorv"></ul>
    <p id="kogusumma"></p>

    <script>
        const ostukorv = {
            tooted: [
                { nimi: 'Piim', hind: 3.60, kogus: 2 },
                { nimi: 'Leib', hind: 2.00, kogus: 1 },
                { nimi: 'Munad', hind: 1.50, kogus: 6 },
                { nimi: 'Juust', hind: 4.20, kogus: 1 },
                { nimi: 'Tomatid', hind: 2.30, kogus: 3 },
            ]
        };

        const ostukorvielement = document.getelementbyId("ostukorv");
        const koguSummaelement = document.getelementbyId("kogusumma");

        // Lisame ostukorvi sisu loendisse
        ostukorv.tooted.foreach(toode => {
            const listitem = document.createelement("li");
            listitem.textcontent = `${toode.nimi} - ${toode.hind} EUR - Kogus: ${toode.kogus}`;
            ostukorvielement.appendchild(listitem);
        });

        // Arvutame ostukorvi kogusumma
        const kogusumma = ostukorv.tooted.reduce((summa, toode) => summa + (toode.hind * toode.kogus), 0);
        kogusummaelement.textcontent = `Ostukorvi kogu summa: ${kogusumma.tofixed(2)} EUR`;
    </script>
</body>
</html>

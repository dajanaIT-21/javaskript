// Dajana
// 28.02.2024
// Ülesanne 12
// li = loob uue html li elemendi, getelementbyid = kasutatakse dokumendis olevate elementide leidmiseks
// reduce = masiivi elementide kokkuvõtmiseks, tofixed = muudab arvu stringiks säilitades kindla arvu komaarve

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ülesanne 12</title>
</head>
<body>

    <div id="ostukorv"></div>
    <div id="kogusumma"></div>

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

const ostukorvielement = document.getElementById("ostukorv");
const koguSummaelement = document.getElementById("kogusumma");

if (ostukorvielement && koguSummaelement) {
    // Lisame ostukorvi sisu loendisse
    ostukorv.tooted.forEach(toode => {
        const listitem = document.createElement("li");
        listitem.textContent = `${toode.nimi} - ${toode.hind} EUR - Kogus: ${toode.kogus}`;
        ostukorvielement.appendChild(listitem);
    });

    // Arvutame ostukorvi kogusumma
    const kogusumma = ostukorv.tooted.reduce((summa, toode) => summa + (toode.hind * toode.kogus), 0);
    koguSummaelement.textContent = `Ostukorvi kogu summa: ${kogusumma.toFixed(2)} EUR`;
} else {
    console.error("Element with ID 'ostukorv' or 'kogusumma' not found.");
}





    </script>
</body>
</html>

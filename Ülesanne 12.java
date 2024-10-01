// Dajana
// 18.06.2024
// Ülesanne 12
// li = loob uue html li elemendi, getelementbyid = kasutatakse dokumendis olevate elementide leidmiseks
// reduce = masiivi elementide kokkuvõtmiseks, tofixed = muudab arvu stringiks säilitades kindla arvu komaarve

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   

    <title>ulesanne12</title>
    
</head>

<body>

    <h1>Ostukorv</h1>

    <ul id="ostukorv">

    </ul>

    <p id="kogusumma">Kogusumma: <span id="summa">0</span> </p>


<script> 


// Kasutame Ülesanne 10 koodi ja lisame ostukorvi esemeid
const ostukorv = [
            { nimi: "Piim", hind: 4.99, kogus: 2 },
            { nimi: "Mario plushie", hind: 50.99, kogus: 1 },
            { nimi: "Holy Cross", hind: 9.99, kogus: 3 }
        ];

        const ostukorviElement = document.getElementById('ostukorv');
        const kogusummaElement = document.getElementById('summa');

        // Lisame iga ostukorvi eseme HTML-lehele
        ostukorv.forEach(asjainf => {
            const liElement = document.createElement('li');
            liElement.textContent = `${asjainf.nimi} - ${asjainf.hind} € x ${asjainf.kogus}`;
            ostukorviElement.appendChild(liElement);
        });

        // Arvutame kogusumma
        const kogusumma = ostukorv.reduce((sum, asja) => sum + asja.hind * asja.kogus, 0);
        kogusummaElement.textContent = kogusumma.toFixed(2) + ' €';

</script>

    
</body>
</html>

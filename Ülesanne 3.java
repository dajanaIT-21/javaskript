// Dajana
// 27.02.2024
// Ülesanne 3

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ülesanne 3</title>
</head>
<body>
    <script>
        // Sõidu aeg ja kaugus
        let kaugus = 150; 
        let kiirus = 60; 

        // Arvutame sõidu aja (tundides)
        let soiduaeg = kaugus / kiirus;
        console.log("Sõidu aeg:", soiduaeg, "tundi");

        // Postituste kuvamine
        let postitustearv = 137; 
        let postitusilehekuljel = 10; 

        // Arvutame lehekülgede arvu
        let lehekulgi = Math.ceil(postitustearv / postitusilehekuljel);
        console.log("Lehekülgi kokku:", lehekulgi);

        // Arvutame postituste arvu viimasel lehel
        let viimaselehepostitused = postitustearv % postitusilehekuljel;
        console.log("Postitusi viimasel lehel:", viimaselehepostitused);

        // Serveri töökulu
        let voimsus = 400; 
        let elektrihind = 0.0969;

        // Arvutame serveri voolutarbimise kilovatt-tundides (kWh)
        let voolutarbimine = voimsus / 1000;
        console.log("Voolutarbimine:", voolutarbimine, "kWh");

        // Arvutame töökulu eurodes
        let tookulu = voolutarbimine * elektrihind;
        console.log("Töökulu ühe tunni jooksul:", tookulu.toFixed(2), "eurot");






    </script>
</body>
</html>

// Dajana
// 27.02.2024
// Ülesanne 8
// const = kasutatakse muutuja defineerimiseks, mille väärtus jääb püsivaks ega muutu pärast seda, kui see on määratud,
// while = tsükkel

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JavaScripti kood</title>
</head>
<body>
    <script>
        // Mündid
        const coins = [200, 0.2, 10, 0.01, 2, 1, 0.1, 0.02, 0.05, 100, 5, 0.5, 50, 20];
        let totalcoins = 0;
        let sum = 0;

        // Uus massiiv müntide jaoks
        const newcoins = [];

        // Sorteerime välja mündid ja arvutame summa
        let i = 0;
        while (i < coins.length) {
            const coin = coins[i];
            if (coin >= 1) {
                totalcoins++;
                sum += coin;
                newcoins.push(coin);
            }
            i++;
        }

        // Kuva, mitu münti said ja mis on nende summa
        console.log(`Said kokku ${totalcoins} munti, mille summa on ${sum} eurot.`);
        console.log("Uued müntide väärtused:", newcoins);






    </script>
</body>
</html>

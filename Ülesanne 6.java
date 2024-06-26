// Dajana
// 27.02.2024
// Ülesanne 6
// switch = kasutatakse juhtumite v tingimuste hindamiseks, case = kasutatakse switchiga võrdlemiseks
// default = kasutatakse kui sisestatud number ei sobi ühegi case-iga 

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ülesanne 6</title>
</head>
<body>
    <script>
        // Positiivne või negatiivne
        let number = -5;

        switch (true) {
            case number > 0:
                console.log("Sisestatud number on positiivne.");
                break;
            case number < 0:
                console.log("Sisestatud number on negatiivne.");
                break;
            default:
                console.log("Sisestatud number on null.");
        }

        // Restoran
        let broneeringuarv = 4; 

        switch (true) {
            case broneeringuarv >= 1 && broneeringuarv <= 2:
                console.log("Valige laud kahele inimesele.");
                break;
            case broneeringuarv >= 3 && broneeringuarv <= 4:
                console.log("Valige laud neljale inimesele.");
                break;
            case broneeringuarv >= 5 && broneeringuarv <= 6:
                console.log("Valige laud kuuele inimesele.");
                break;
            default:
                console.log("Valige suur laud.");
        }






    </script>
</body>
</html>

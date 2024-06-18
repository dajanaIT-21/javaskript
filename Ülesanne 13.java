// Dajana
// 28.02.2024
// Ülesanne 13
// innertext = tagastab või määrab tekstisisu, setattribute = võimaldab lisada või muuta HTML elemendi atribuute ning nende väärtusi
// removeattribute = eemaldab elemendi, getattribute = tagastab HTML elemendi määratud atribuudi väärtuse

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ülesanne 13</title>
</head>
<body>

    <p id="paragraph">Siin on üks lõik</p>

    <script>
        document.addEventListener("DOMContentLoaded", function() {
            const id = document.querySelector("p");
            id.innerText = "timm";
            id.setAttribute("attr", "dajana mähdi"); 
            id.removeAttribute("id");
            console.log(id.getAttribute("attr"));
        });






    </script>
</body>
</html>

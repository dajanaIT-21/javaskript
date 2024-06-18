// Dajana
// 18.06.2024
// Ülesanne 13


<!DOCTYPE html>
<html lang="et">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ülesanne 13</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1 class="display-1">Pildid</h1>
        <div class="card-group">
            <div class="card" style="width: 18rem;">
                <img src="https://placehold.co/300x200" class="card-img-top" alt="..." data-title="Jumal Mario" data-description="Amen">
                <div class="card-body">
                  <h5 class="card-title">AMEN</h5>
                  <p class="card-text">AMEN</p>
                </div>
            </div>
            <div class="card" style="width: 18rem;">
                <img src="https://placehold.co/300x200" class="card-img-top" alt="..." data-title="Pühak Mario" data-description="Amen">
                <div class="card-body">
                  <h5 class="card-title">AMEN</h5>
                  <p class="card-text">AMEN</p>
                </div>
            </div>
            <div class="card" style="width: 18rem;">
                <img src="https://placehold.co/300x200" class="card-img-top" alt="..." data-title="Palun pane mulle 3" data-description="Amen">
                <div class="card-body">
                  <h5 class="card-title">AMEN</h5>
                  <p class="card-text">AMEN</p>
                </div>
            </div>
        </div>
        <p id="eemaldaID" attr="Väga jumalik tekst"></p>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
    <script>
        // Eemaldab id
        document.getElementById("eemaldaID").removeAttribute("id");

        // Muudab attr väärtust
        document.querySelector('[attr="Väga jumalik tekst"]').setAttribute("attr", "Dajana");

        // Kuvab attr väärtust konsoolis
        console.log(document.querySelector('[attr="Dajana"]').getAttribute("attr"));

        // Otsib kõiki kaarte ja muudab nende sisu
        document.querySelectorAll('.card').forEach(function(card) {
            const img = card.querySelector('.card-img-top');
            const title = img.getAttribute('data-title');
            const description = img.getAttribute('data-description');
            card.querySelector('.card-title').textContent = title;
            card.querySelector('.card-text').textContent = description;
        });
    </script>
</body>
</html>


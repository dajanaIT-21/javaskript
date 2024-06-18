// Dajana
// 28.02.2024
// Ülesanne 11

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ülesanne 11</title>
</head>
<body>
    <script>
        // Nimede korrastamine
        const nimed = ["mari maasikas", "jaan jõesaar", "kristiina kukk", "margus mustikas", "jaak järve", "kadi kask", "Toomas Tamm", "Kadi Meri", "Leena Laas", "Madis Mets", "Hannes Hõbe", "Anu Allikas", "Kristjan Käär", "Eva Esimene", "Jüri Jõgi", "Liis Lepik", "Kalle Kask", "Tiina Teder", "Kaidi Koppel", "tiina Toom"];

        // Korrasta nimed
        const korrasnimed = nimed.map(nimi => {
        const [eesnimi, perenimi] = nimi.split(" ").map(sõna => sõna.charAt(0).toUpperCase() + sõna.slice(1).toLowerCase());
        return `${eesnimi} ${perenimi}`;
        });

        console.log("Korras olevad nimed:");
        console.log(korrasnimed);

        // Emailide loomine perenimede põhjal
        const emailid = korrasnimed.map(nimi => {
        const [eesnimi, perenimi] = nimi.split(" ");
        const email = perenimi.toLowerCase() + "@metshein.com";
        return email;
        });

        console.log("Emailid:");
        console.log(emailid);

        // Funktsioon nime otsimiseks
        function otsinime(nimi) {
        const leitudnimed = nimed.filter(n => n.toLowerCase().includes(nimi.toLowerCase()));
        if (leitudnimed.length > 0) {
            console.log("Leitud nimed:", leitudnimed.join(", "));
        } else {
            console.log("Nime ei leitud.");
        }
        }

        // Funktsioon, mis otsib inimeste nime järgi
        function otsiNime(nimi) {
        const inimesteandmed = [
        { nimi: "Mari Maasikas", isikukood: "38705123568" },
        { nimi: "Jaan Jõesaar", isikukood: "49811234567" },
        { nimi: "Kristiina Kukk", isikukood: "39203029876" },
        { nimi: "Margus Mustikas", isikukood: "49807010346" },
        { nimi: "Jaak Järve", isikukood: "39504234985" },
        { nimi: "Kadi Kask", isikukood: "39811136789" }
    ];

    // Otsime inimese andmete hulgast
    const inimene = inimesteandmed.find(isik => isik.nimi.toLowerCase() === nimi.toLowerCase());

    // Kui inimene leiti, siis leitakse tema sünniaeg ja vanus
    if (inimene) {
        const sunnikuupaev = `19${inimene.isikukood.substring(1, 3)}-${inimene.isikukood.substring(3, 5)}-${inimene.isikukood.substring(5, 7)}`;
        const sunniaeg = new Date(sunnikuupaev);
        const vanus = Math.floor((new Date() - sunniaeg) / (1000 * 60 * 60 * 24 * 365));
        console.log(`${inimene.nimi} - Sünniaeg: ${sunnikuupaev}, Vanus: ${vanus} aastat`);
    } else {
        console.log(`Inimest nimega "${nimi}" ei leitud.`);
    }
    
}
otsinime("Kadi");

// Funktsiooni testimine



        // Kaugushüppe tulemuste töötlemine
        const opilased = [
        { nimi: "Anna", tulemused: [4.5, 4.8, 4.6] },
        { nimi: "Mart", tulemused: [5.2, 5.1, 5.4] },
        { nimi: "Kati", tulemused: [4.9, 5.0, 4.7] },
        { nimi: "Jaan", tulemused: [4.3, 4.6, 4.4] },
        { nimi: "Liis", tulemused: [5.0, 5.2, 5.1] },
        { nimi: "Peeter", tulemused: [5.5, 5.3, 5.4] },
        { nimi: "Eva", tulemused: [4.8, 4.9, 4.7] },
        { nimi: "Marten", tulemused: [4.7, 4.6, 4.8] },
        { nimi: "Kairi", tulemused: [5.1, 5.3, 5.0] },
        { nimi: "Rasmus", tulemused: [4.4, 4.5, 4.3] }
        ];

        opilased.forEach(opilane => {
        const parimtulemus = Math.max(...opilane.tulemused);
        const keskminetulemus = (opilane.tulemused.reduce((acc, curr) => acc + curr, 0)) / opilane.tulemused.length;
        console.log(`${opilane.nimi} - Parim tulemus: ${parimtulemus}, Keskmine tulemus: ${keskminetulemus.toFixed(2)}`);
        });






    </script>
</body>
</html>

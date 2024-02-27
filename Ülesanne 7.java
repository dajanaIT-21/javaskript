// Dajana
// 27.02.2024
// Ülesanne 7

// Tooted
const products = ["Õunad", "Piim", "Leib", "Juust", "Tomatid", "Kanafilee", "Muna", "Sibul", "Apelsinid", "Riis", "Jogurt", "Kartul", "Kalafilee", "Pasta", "Jogurtijook", "Porgandid", "Virsikud", "Pähklid", "Rosinad", "Kapsas", "Kreeka jogurt", "Veiseliha", "Banaanid", "Oliivid", "Mandlid", "Magus kartul", "Greibid"];

// Kuvame kõik tooted ja lisame igaühe ette järjekorranumbri
console.log("Tooted:");
products.foreach((product, index) => {
    console.log(`${index + 1}. ${product}`);
});

// Tooted - 10 esimest, vahele jäetakse "Muna", "Sibul" ja "Riis"
console.log("\nTooted (10 esimest, vahele jäetakse 'Muna', 'Sibul' ja 'Riis'):");
let count = 0;
for (let product of products) {
    if (product === "Muna" || product === "Sibul" || product === "Riis") continue;
    count++;
    console.log(`${count}. ${product}`);
    if (count === 10) break;
}

// Temperatuurid
const temperatures = [
    [5, 8, 12, 10, 7, 9, 11, 14, 16, 13, 10, 6, 4, 3, 2, 4, 6, 8, 10, 12, 15, 17, 18, 16, 13, 10],
    [1, 4, 6, 7, 9, 11, 13, 15, 12, 9, 7, 5, 3, 2, 3, 6, 8, 10, 12, 15, 17, 19, 18, 16, 13, 11],
    [8, 10, 13, 15, 16, 18, 19, 20, 17, 15, 13, 11, 10, 9, 8, 10, 12, 14, 16, 18, 20, 22, 21, 18, 16, 14],
    [2, 5, 7, 9, 12, 15, 17, 18, 15, 13, 11, 8, 6, 5, 4, 7, 9, 12, 14, 16, 19, 21, 20, 18, 16, 13],
    [6, 8, 11, 14, 16, 18, 20, 21, 18, 15, 12, 10, 8, 6, 5, 8, 10, 13, 15, 18, 20, 22, 21, 19, 16, 13],
    [11, 14, 17, 19, 21, 23, 24, 22, 19, 16, 13, 11, 10, 9, 9, 12, 15, 18, 20, 23, 25, 27, 26, 24, 21, 18],
    [9, 11, 14, 16, 18, 20, 22, 21, 18, 16, 13, 11, 9, 8, 7, 10, 13, 16, 18, 21, 23, 24, 23, 21, 18, 15],
    [7, 10, 13, 15, 17, 20, 22, 23, 20, 17, 14, 12, 10, 9, 8, 11, 14, 17, 19, 22, 24, 26, 25, 23, 20, 17],
    [3, 6, 9, 11, 13, 15, 17, 18, 16, 14, 11, 9, 7, 6, 5, 8, 10, 13, 15, 17, 19, 21, 20, 18, 15, 12],
    [1, 3, 5, 7, 9, 11, 13, 15, 12, 9, 7, 5, 3, 2, 3, 6, 8, 10, 12, 15, 17, 19, 18, 16, 13, 11],
    [6, 8, 11, 14, 16, 18, 20, 21, 18, 15, 12, 10, 8, 6, 5, 8, 10, 13, 15, 18, 20, 22, 21, 19, 16, 13],
    [10, 13, 16, 18, 20, 22, 23, 24, 21, 18, 15, 13, 11, 10, 9, 12, 15, 18, 20, 23, 25, 27, 26, 24, 21, 18]
];

// Leidke iga kuu keskmine temperatuur
console.log("\nKuu keskmised temperatuurid:");
for (let i = 0; i < temperatures.length; i++) {
    const monthtemperatures = temperatures[i];
    const averagetemperature = monthtemperatures.reduce((sum, temp) => sum + temp, 0) / monthtemperatures.length;
    console.log(`${months.split(", ")[i]}: ${averagetemperature.tofixed(2)} kraadi`);
}

// Leidke, millises kuus oli kõige kõrgem ja millises kõige madalam temperatuur ning kuvage vastavad kuud ja temperatuurid
let maxtemperature = -Infinity;
let mintemperature = Infinity;
let hottestmonth = "";
let coldestmonth = "";

for (let i = 0; i < temperatures.length; i++) {
    const monthtemperatures = temperatures[i];
    const maxtemp = Math.max(...monthtemperatures);
    const mintemp = Math.min(...monthtemperatures);

    if (maxtemp > maxtemperature) {
        maxtemperature = maxtemp;
        hottestmonth = months.split(", ")[i];
    }

    if (mintemp < mintemperature) {
        mintemperature = mintemp;
        coldestmonth = months.split(", ")[i];
    }
}

console.log(`Kõige korgem temperatuur oli ${hottestmonth} kuus: ${maxtemperature} kraadi`);
console.log(`Kõige madalam temperatuur oli ${coldestmonth} kuus: ${mintemperature} kraadi`);

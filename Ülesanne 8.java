// Dajana
// 27.02.2024
// Ülesanne 8

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

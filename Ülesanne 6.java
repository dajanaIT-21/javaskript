// Dajana
// 27.02.2024
// Ülesanne 6

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

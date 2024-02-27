// Temperatuuri kontroll
let temperatuur = 20; 
if (temperatuur > 25) {
    console.log("Väga kuum!");
} else if (temperatuur >= 15 && temperatuur <= 25) {
    console.log("Mõnus temperatuur");
} else {
    console.log("Jahe on!");
}

// Kasutajanime kontroll
let kasutajanimi = "admin"; 
if (kasutajanimi === "admin") {
    console.log("Tere, administraator!");
} else {
    console.log("Tere, külaline!");
}

// Ürituse piletite hind
let piletituup = "sooduspilet"; 
let vanus = 25; 

if (piletituup === "täispilet") {
    if (vanus < 18) {
        console.log("Pileti hind: 10 eurot");
    } else if (vanus >= 18 && vanus <= 64) {
        console.log("Pileti hind: 20 eurot");
    } else {
        console.log("Pileti hind: 15 eurot");
    }
} else if (piletituup === "sooduspilet") {
    if (vanus < 18 || vanus >= 65) {
        console.log("Pileti hind: 8 eurot");
    } else {
        console.log("Pileti hind: 15 eurot");
    }
} else {
    console.log("Vale piletitüüp!");
}

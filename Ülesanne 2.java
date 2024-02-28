// Dajana
// 27.02.2024
// Ülesanne 2
// let = muutuja, console.log = väljastab

// Kellaaeg
let tunnid = 2;
let minutid = 38;
let sekundid = 59;
let kellaaeg = `${tunnid}:${minutid}:${sekundid}PM`;
console.log(kellaaeg);


// Tsitaat lause sees
let tsitaat = '"Elu on nagu jalgrattasõit. Et tasakaalus püsida, pead liikuma." - Albert Einstein';
console.log(tsitaat);


// Mallide kasutamine
let eesnimi = 'Jüri';
let perenimi = 'Jurakas';
let nimetahed = `${eesnimi[0]}.${perenimi[0]}.`;
console.log(`${eesnimi} ${perenimi} nimetahed on ${nimetahed}`);


// Perenime pikkus
let taisnimi = 'Jurakas, Jüri';
let komaasukoht = taisnimi.indexOf(',');
let perenimilause = taisnimi.substring(0, komaasukoht);
let suurteperenimi = perenimilause.toUpperCase();
console.log(suurteperenimi);
console.log(suurteperenimi.length);


// E-posti aadressi muutmine
let epost = "karrolk@netlog.com";
let uusepost = epost.replace('@netlog', '@gmail');
console.log(uusepost);

// Andmerida analüüs
let andmerida = "1,Marshal,Martinovic,mmartinovic0@dedecms.com,Male,40.19.226.175";
let andmed = andmerida.split(',');
let email = andmed[3];
let kasutajanimi = email.substring(0, email.indexOf('@'));
let ipaadress = andmed[5];
console.log(ipaadress, kasutajanimi);

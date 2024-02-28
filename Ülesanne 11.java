// Dajana
// 28.02.2024
// Ülesanne 11

// Nimede korrastamine
const nimed = ["mari maasikas", "jaan jõesaar", "kristiina kukk", "margus mustikas", "jaak järve", "kadi kask", "Toomas Tamm", "Kadi Meri", "Leena Laas", "Madis Mets", "Hannes Hõbe", "Anu Allikas", "Kristjan Käär", "Eva Esimene", "Jüri Jõgi", "Liis Lepik", "Kalle Kask", "Tiina Teder", "Kaidi Koppel", "tiina Toom"];

// Korrasta nimed
const korrasnimed = nimed.map(nimi => {
  const [eesnimi, perenimi] = nimi.split(" ").map(sõna => sõna.charAt(0).touppercase() + sõna.slice(1).tolowercase());
  return `${eesnimi} ${perenimi}`;
});

console.log("Korras olevad nimed:");
console.log(korrasnimed);

// Emailide loomine perenimede põhjal
const emailid = korrasnimed.map(nimi => {
  const [eesnimi, perenimi] = nimi.split(" ");
  const email = perenimi.tolowercase() + "@metshein.com";
  return email;
});

console.log("Emailid:");
console.log(emailid);

// Funktsioon nime otsimiseks
function otsinime(nimi) {
  const leitudnimed = nimed.filter(n => n.tolowercase().includes(nimi.tolowercase()));
  if (leitudnimed.length > 0) {
    console.log("Leitud nimed:", leitudnimed.join(", "));
  } else {
    console.log("Nime ei leitud.");
  }
}

otsiNime("Kadi");

// Inimeste sünniaja ja vanuse leidmine
const inimesteandmed = [
  { nimi: "Mari Maasikas", isikukood: "38705123568" },
  { nimi: "Jaan Jõesaar", isikukood: "49811234567" },
  { nimi: "Kristiina Kukk", isikukood: "39203029876" },
  { nimi: "Margus Mustikas", isikukood: "49807010346" },
  { nimi: "Jaak Järve", isikukood: "39504234985" },
  { nimi: "Kadi Kask", isikukood: "39811136789" }
];

inimesteandmed.foreach(isik => {
  const sunnikuupaev = `19${isik.isikukood.substring(1, 3)}-${isik.isikukood.substring(3, 5)}-${isik.isikukood.substring(5, 7)}`;
  const sunniaeg = new Date(sunnikuupaev);
  const vanus = Math.floor((new Date() - sunniaeg) / (1000 * 60 * 60 * 24 * 365));
  console.log(`${isik.nimi} - Sunniaeg: ${sunnikuupaev}, Vanus: ${vanus} aastat`);
});

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

opilased.foreach(opilane => {
  const parimtulemus = Math.max(...opilane.tulemused);
  const keskminetulemus = (opilane.tulemused.reduce((acc, curr) => acc + curr, 0)) / opilane.tulemused.length;
  console.log(`${opilane.nimi} - Parim tulemus: ${parimtulemus}, Keskmine tulemus: ${keskminetulemus.tofixed(2)}`);
});

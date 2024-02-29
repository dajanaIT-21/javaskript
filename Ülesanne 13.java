// Dajana
// 28.02.2024
// Ülesanne 13
// innertext = tagastab või määrab tekstisisu, setattribute = võimaldab lisada või muuta HTML elemendi atribuute ning nende väärtusi
// removeattribute = eemaldab elemendi, getattribute = tagastab HTML elemendi määratud atribuudi väärtuse

const id = document.queryselector("p");
id.innertext = "timm";
id.setattribute("attr", "dajana mähdi"); 
id.removeattribute("id");
console.log(id.getattribute("attr"))

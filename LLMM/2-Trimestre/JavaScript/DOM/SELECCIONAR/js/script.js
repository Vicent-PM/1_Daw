function changeColor(color){
    var elem = document.getElementById("texto")
    elem.style.color = color
}

//Seleccionar todos los elementos con la clase "mi-clase"
var elemc = document.getElementsByClassName('mi-clase')

//Iterar sobre los elementos
// for(i = 0; elemc.length; i++){
//     elemc[i].style.fontSize = "2rem"
// }


//
function contarParrafos(){
    var tag = document.getElementsByTagName("p")
    var totalP = tag.length
    alert("Hay " + totalP + " <p> elementos en este documento")
}

// let lis_elements = document.querySelectorAll("li")

// lis_elements.forEach(x => x.style.fontSize  "3rem")

//La propiedad innerHTML modifica el contenido HTML de un elemento. No incluye el propio elemento
const inner = document.getElementById('inner')
inner.innerHTML = "<div> Hola Jose es <b> tonto </b></div>"

//La propiedad innerHTML modifica el contenido HTML de un elemento. Si incluye el propio elemento
const outer = document.getElementById('outer')
outer.outerHTML = "<ul><li>A</li><li>B</li></ul>"

//La propiedad innerHTML modifica el contenido HTML de un elemento. Si incluye el propio elemento
const text = document.getElementById('text')
text.innerText = "<b> Adios a todos </b>"

const titulo = document.getElementById('titulo')
titulo.title = "Esta es la descripcion"
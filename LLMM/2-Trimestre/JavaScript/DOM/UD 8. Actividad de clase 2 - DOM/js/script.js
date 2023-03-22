function ocultarContenido() {
    let parrafo = enlace.parentElement
    let enlace = document.getElementsByTagName("a")

    let oculto = false
    
    if(!oculto){
        for (let i = 0; i < enlace.length; i++) {
            enlace[i].innerHTML = "Ocultar contenido"
            enlace[i].style.display = "none"
            oculto = true
        }
    } else {
        for (let i = 0; i < enlace.length; i++) {
            enlace[i].innerHTML = "Mostrar contenido"
            enlace[i].style.display = "block"
            oculto = false
        }
    }


}
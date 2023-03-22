function añadirElementos() {
    let lista = document.getElementById("lista")
    
    let elemento = document.createElement("li")
    let texto = document.createTextNode("texto de prueba")
    
    elemento.textContent = "Elemento de prueba"

    lista.appendChild(elemento)
    lista.appendChild(texto)
}
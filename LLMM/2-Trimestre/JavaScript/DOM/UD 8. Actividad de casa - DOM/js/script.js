function crearElemento() {
    let lista = document.getElementById("lista")
    let texto = document.getElementById("texto")

    let elemento = document.createElement("li")

    elemento.textContent = texto.value

    lista.appendChild(elemento)

    texto.value = ""
}
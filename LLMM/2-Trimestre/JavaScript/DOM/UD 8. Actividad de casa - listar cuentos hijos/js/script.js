let lista = document.querySelector('ul');
let elementosDeLista = lista.getElementsByTagName('li');

for (let i = 0; i < elementosDeLista.length; i++) {
    const elemento = elementosDeLista[i];
    const cantidadDeHijos = elemento.children.length;
    document.write(`El elemento ${elemento.textContent} tiene ${cantidadDeHijos} hijos.`);
}
let enlaces = document.getElementsByTagName("a");
  
  // recorrer todos los enlaces y cambiar su color si es externo
  for (let i = 0; i < enlaces.length; i++) {
    let enlace = enlaces[i];

    let href = enlace.getAttribute('href');
    
    if (href && href.includes('://') && !enlaces[i].href.startsWith('http://internal.com')) {
      enlace.style.color = 'orange';
    }
  }
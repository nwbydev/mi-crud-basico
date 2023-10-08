fetch('http://localhost:8080/api/persona')
  .then(response => {
    if (!response.ok) {
      throw new Error('No se pudo obtener el recurso');
    }
    return response.json();
  })
  .then(data => {
    // Trabaja con los datos obtenidos
    console.log(data);
	console.log(data[1].nombre);

  })
  .catch(error => {
    console.error('Hubo un error:', error);
  });
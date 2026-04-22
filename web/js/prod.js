function cargarSaludo() {
    fetch('prod')
            .then(response => response.text())
            .then(data => {
                document.getElementById('respuesta').textContent = data;
            })
            .catch(error => {
                console.error('Error:', error);
            });
}
fetch("prod")
    .then(response => response.json())
    .then(data => {
        let html = "";

        data.forEach(p => {
            html += `
                <tr>
                    <td>${p.id}</td>
                    <td>${p.nombre}</td>
                    <td>${p.descripcion}</td>
                    <td>${p.precio}</td>
                    <td>${p.stock}</td>
                </tr>
            `;
        });

        document.getElementById("resultado").innerHTML = html;
    })
    .catch(error => console.error("Error:", error));
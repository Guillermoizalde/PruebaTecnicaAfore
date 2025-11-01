const API_URL = "http://localhost:9090/api/clientes";

document.getElementById("clienteForm").addEventListener("submit", async (e) => {
  e.preventDefault();

  const cliente = {
    nombre: editNombre.value,
    celular: editCelular.value,
    correoElectronico: editCorreo.value,
    fechaNacimiento: editFechaNacimiento.value
   };

  try {
    const res = await fetch(API_URL, {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify(cliente)
    });

    if (res.ok) {
      alert("✅ Cliente registrado correctamente");
      document.getElementById("clienteForm").reset();
    } else {
      alert("❌ Error al registrar cliente");
    }

  } catch (err) {
    console.error("Error de conexión:", err);
    alert("⚠️ No se pudo conectar con el servidor");
  }
});

document.getElementById("btnListar").addEventListener("click", async () => {
  try {
    const res = await fetch(API_URL);
    const data = await res.json();

    const lista = document.getElementById("listaClientes");
    lista.innerHTML = "";

    data.forEach(c => {
      const li = document.createElement("li");
      li.className = "list-group-item";
      li.textContent = `${c.id}. ${c.nombre} (${c.correoElectronico})`;
      lista.appendChild(li);
    });
  } catch (err) {
    console.error("Error:", err);
    alert("⚠️ No se pudieron obtener los clientes");
  }
});

const usuariosBase = {
    admin: { password: "1234", rol: "admin" },
    prof: { password: "1234", rol: "profe" },
    alum: { password: "1234", rol: "alumno" }
};

const loginForm = document.getElementById("loginForm");
const resultado = document.getElementById("resultado");
const panelAdmin = document.getElementById("panelAdmin");
const panelProfe = document.getElementById("panelProfe");
const mensajeProfe = document.getElementById("mensajeProfe");
const btnVerRoles = document.getElementById("btnVerRoles");
const listaRoles = document.getElementById("listaRoles");

function mostrarAlerta(texto, tipo) {
    resultado.className = `alert ${tipo}`;
    resultado.textContent = texto;
}

function limpiarPaneles() {
    panelAdmin.classList.add("hidden");
    panelProfe.classList.add("hidden");
    listaRoles.classList.add("hidden");
}

function resolverUsuario(usuario) {
    return usuariosBase[usuario] || null;
}

loginForm.addEventListener("submit", function (event) {
    event.preventDefault();
    limpiarPaneles();

    const usuario = document.getElementById("usuario").value.trim();
    const password = document.getElementById("password").value.trim();

    const existe = resolverUsuario(usuario);

    if (!existe || existe.password !== password) {
        mostrarAlerta("Usuario o contraseña incorrectos.", "error");
        return;
    }

    if (existe.rol === "admin") {
        mostrarAlerta("Bienvenido administrador.", "success");
        panelAdmin.classList.remove("hidden");
        return;
    }

    if (existe.rol === "profe") {
        const clave = `inicios_${usuario}`;
        const totalAnterior = Number(localStorage.getItem(clave)) || 0;
        const totalActual = totalAnterior + 1;
        localStorage.setItem(clave, String(totalActual));

        mostrarAlerta("Bienvenido profesor.", "success");
        panelProfe.classList.remove("hidden");
        mensajeProfe.textContent = `Has iniciado ${totalActual} veces con el usuario ${usuario}.`;
        return;
    }

    mostrarAlerta("Bienvenido alumno.", "success");
});

btnVerRoles.addEventListener("click", function () {
    listaRoles.classList.toggle("hidden");
});

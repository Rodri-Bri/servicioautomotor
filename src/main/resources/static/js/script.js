function validarFormatoPatente() {
            var patente = document.getElementById("patente");
            var exprecionRegular = /^[A-Z]{2,3}\d{3}[A-Z]{0,2}$/;
            if (!exprecionRegular.test(patente.value)) {
                alert("El formato de patente debe ser'AAA111' o 'AA111AA'.");
                patente.value = "";
            }
}
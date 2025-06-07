package control;

public class LoginControler {

    // Datos del usuario temporal
    String[][] usuarios = {
        {"jorch", "bicicleta"}, {"maria", "perrito123"}, {"carlos", "guitarra99"},
        {"laura", "luna2025"}, {"andres", "montaña!"}, {"sofia", "cafe_con_leche"},
        {"david", "teclado321"}, {"lucia", "nubeazul"}, {"pedro", "solyplaya"},
        {"ana", "libroRojo"}
    };

public boolean validacionDatos(String EntradaUsuario, String EntradaContrasenna) {

for (int i = 0; i < usuarios.length; i++) {
    if (usuarios[i][0].equals(EntradaUsuario) && usuarios[i][1].equals(EntradaContrasenna)) {
        return true; // Usuarios válidas
    }
}
return false; // Usuarios inválidas
}
}




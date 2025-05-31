package control;

public class LoginControler {

    // Datos del usuario temporal
    String[][] usuarios = {
        {"jorch", "bicicleta"}, {"maria", "perrito123"}, {"carlos", "guitarra99"},
        {"laura", "luna2025"}, {"andres", "montaña!"}, {"sofia", "cafe_con_leche"},
        {"david", "teclado321"}, {"lucia", "nubeazul"}, {"pedro", "solyplaya"},
        {"ana", "libroRojo"}
    };

    public boolean validacionDatos(String EUsuario, String EContrasenna) {
        for (int i = 0; i < usuarios.length; i++) {
            System.out.println(usuarios[i][0]);
            if (usuarios[i][0].equals(EUsuario) && usuarios[i][1].equals(EContrasenna)) {
                return true;
            }
        }
        return false;
    }
}


package crudstreaming;

public class Main {
    public static void main(String[] args) {

        ServicioDAO dao = new ServicioDAO();

        dao.crear(new ServicioStreaming("Netflix Premium", "Streaming", 12.99));
        dao.crear(new ServicioStreaming("Crunchyroll", "Streaming", 7.99));
        dao.crear(new ServicioStreaming("Microsoft 365", "Licencia", 6.99));

        dao.leer();

        dao.actualizar(1, 14.99);

        dao.eliminar(2);

        dao.leer();
    }
}
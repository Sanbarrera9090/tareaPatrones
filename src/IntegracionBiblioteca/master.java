package IntegracionBiblioteca;

public class master {
    public static void main (String [] args){
        KmlLibrary kmlLibrary = new KmlLibrary();
        ProveedorGeoJson adapter = new kmlAdapter(kmlLibrary);

        String geoJsonData = adapter.proveedorGeoJsonData();
        kmlLibrary.showKmlData(geoJsonData);
    }
}

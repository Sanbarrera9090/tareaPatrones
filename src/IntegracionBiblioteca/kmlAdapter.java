package IntegracionBiblioteca;

public class kmlAdapter implements ProveedorGeoJson{
    private KmlLibrary kmlLibrary;
    public kmlAdapter(KmlLibrary kmlLibrary){
        this.kmlLibrary = kmlLibrary;
    }
    @Override
    public String proveedorGeoJsonData(){
        String kmlData = convertirGeoJsonToKml();

        return kmlData;
    }


    private String convertirGeoJsonToKml (){
        return "KML DATA";
    }
}

package GeneracionInformes;

import GeneracionInformes.Interface.GeneradorReportes;

public class Report {
    private GeneradorReportes generadorReportes;

    public void setReportGenerator(GeneradorReportes generadorReportes) {
        this.generadorReportes = generadorReportes;
    }

    public void generateReport() {
        generadorReportes.generateReport();
    }
}

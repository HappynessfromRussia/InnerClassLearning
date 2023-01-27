package ananimysInner;

public class Main {
    public static void main(String[] args){

        MonitoringSystem generalIndicatorMonitoringModule = new MonitoringSystem(){

            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общих показателей стартовал");
            }
        };
        MonitoringSystem errorlMonitoringModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг отслеживания ошибок стартовал");

            }
        };
        MonitoringSystem securityModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг безопасности стартовал");

            }
        };

        generalIndicatorMonitoringModule.startMonitoring();
        errorlMonitoringModule.startMonitoring();
        securityModule.startMonitoring();

    }
    /*
    * new <Имени_НЕТ> <Класс родительский/реализуемый интерфейс>(параметры конструктора родителя){
    * };
    *
     */
}

/*
class GeneralIndicatorMonitoringModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг общих показателей стартовал");
    }
}

class ErrorlMonitoringModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг отслеживания ошибок стартовал");
    }
}

class SecurityModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг безопасности стартовал");
    }
}
*/


# My Java API

Bu proje, Java ve Spring Boot kullanarak bir REST API oluşturur. API, MSSQL veritabanına bağlanır ve verileri seçer.

## Kurulum

1. Projeyi klonlayın veya indirin.
2. `src/main/resources/application.properties` dosyasını açın ve veritabanı bağlantı bilgilerinizi girin.
3. Terminalde, projenin kök dizinine gidin ve `./mvnw spring-boot:run` komutunu çalıştırın. Bu, projeyi başlatacaktır.

## Kullanım

API, aşağıdaki endpointlere sahiptir:

- `GET /myapi`: Tüm verileri döndürür.
- `GET /myapi/{id}`: Belirli bir ID'ye sahip veriyi döndürür.

## Testler

Testleri çalıştırmak için terminalde `./mvnw test` komutunu kullanabilirsiniz.

## Katkıda Bulunma

Katkılarınızı bekliyoruz! Lütfen bir pull request açmadan önce, değişikliklerinizi ve neden bu değişiklikleri yaptığınızı açıklayan bir issue oluşturun.

## Lisans

Bu proje MIT lisansı altında lisanslanmıştır. Daha fazla bilgi için `LICENSE` dosyasına bakın.